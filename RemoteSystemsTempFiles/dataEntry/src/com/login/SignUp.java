package com.login;

import com.mysql.cj.jdbc.Driver;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/SignUp")
public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");
		PrintWriter out = response.getWriter();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/account", "root", "");

			String query = String.format("select exists(select * from account where UserName = '%s' )", uname);
			PreparedStatement ps = con.prepareStatement(query);
			Boolean result = ps.execute(query);
			if (result == false) {
				}
			
			String query1 = String.format("insert into account values('%s','%s')", uname, pass);
			PreparedStatement ps1 = con.prepareStatement(query1);
			ps1.execute(query1);
			
			System.out.println("Record Inserted Successfully");
			response.sendRedirect("Login.jsp");
			con.close();
		} 
		catch (Exception e) {
			System.out.println(e);
			out.println("<html><head></head><script>alert(\"User Name already exist\");location = \"SignUp.jsp\";</script></html>");
			
		}
		
	}

}
