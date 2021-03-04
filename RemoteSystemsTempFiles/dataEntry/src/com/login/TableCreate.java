package com.login;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import com.mysql.cj.jdbc.Driver;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TableCreate
 */
@WebServlet("/TableCreate")
public class TableCreate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "");
			
			String query = String.format("create database Account");
			PreparedStatement ps = con.prepareStatement(query);
			ps.execute(query);
			
			String query1 = String.format("use account");
			PreparedStatement ps1 = con.prepareStatement(query1);
			ps1.execute(query1);
			
			String query2 = String.format("create table account(UserName varchar(20), Password varchar(20),primary key(UserName))");
			PreparedStatement ps2 = con.prepareStatement(query2);
			ps2.execute(query2);
			
			con.close();
			response.sendRedirect("Login.jsp");
		} 
		catch (Exception e) {
			response.sendRedirect("Login.jsp");
			System.out.println(e);
		}

	}

}
