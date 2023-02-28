package com.logilite.facebookregistraction;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LogIn")
public class LogIn extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		try {

			Class.forName(DatabaseConnection.driver);
			Connection con = DriverManager.getConnection(DatabaseConnection.url);

			PreparedStatement ps = con
					.prepareStatement("select * from facebookregistration where email=? and password=?");

			ps.setString(1, email);
			ps.setString(2, password);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				RequestDispatcher rd = request.getRequestDispatcher("Home.jsp");
				rd.forward(request, response);
			} else {
				response.sendRedirect("LogIn.jsp");

			}
			ps.close();
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}