package com.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException {
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");
		PrintWriter out = response.getWriter();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/account", "root", "");
			String query = String.format("select Password from account where UserName = '%s' ", uname);
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet result = ps.executeQuery(query);
			

			if(!result.next()) {
				out.println("<html><head></head><script>alert(\"User Name does not exists\");location = \"Login.jsp\";</script></html>");
			}
			
			else if (pass.equals(result.getString(1)))
			{
				response.sendRedirect("Welcome.jsp");
			}
			else 
			{
				out.println("<html><head></head><script>alert(\"Incorrect Password\");location = \"Login.jsp\";</script></html>");
				
			}
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
