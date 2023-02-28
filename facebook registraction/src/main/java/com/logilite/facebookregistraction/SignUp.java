package com.logilite.facebookregistraction;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SignUp")
public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			Class.forName(DatabaseConnection.driver);
			Connection con = DriverManager.getConnection(DatabaseConnection.url);
			PreparedStatement stmt = con.prepareStatement("insert into facebookregistration values(?, ?,?,?,?,?)");
			stmt.setString(1, request.getParameter("email"));
			stmt.setString(2, request.getParameter("password"));
			stmt.setString(3, request.getParameter("name"));
			stmt.setString(4, request.getParameter("surname"));
			stmt.setString(5, request.getParameter("DOB"));
			stmt.setString(6, request.getParameter("gender"));
			stmt.executeUpdate();
			stmt.close();
			con.close();
			PrintWriter out = response.getWriter();
			out.println("<html><body><b>Successfully Inserted" + "</b></body></html>");
			if()
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}