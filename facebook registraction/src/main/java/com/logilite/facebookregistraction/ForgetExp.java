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

@WebServlet("/ForgetExp")
public class ForgetExp extends HttpServlet {

	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		try {
			Class.forName(DatabaseConnection.driver);
			Connection con = DriverManager.getConnection(DatabaseConnection.url);
			int status = 0;
			PreparedStatement stmt = con
					.prepareStatement("update facebookregistration set password=? where email=?");
			stmt.setString(1, password);
			stmt.setString(2, email);
			status = stmt.executeUpdate();
			if (status > 0) {
				response.sendRedirect("LogIn.jsp");
			} else {
				response.sendRedirect("Forget.jsp");
			}
			stmt.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
