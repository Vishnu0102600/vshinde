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
public class SignUp extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)	throws ServletException, IOException 
	{
		try 
		{
			Class.forName(DatabaseConnection.driver);
			// Initialize the database
			Connection con = DriverManager.getConnection(DatabaseConnection.url);
			PreparedStatement st = con.prepareStatement("insert into facebookregistration values(?, ?,?,?,?,?)");

			st.setString(1, request.getParameter("name"));
			st.setString(2, request.getParameter("surname"));
			st.setString(3, request.getParameter("email"));
			st.setString(4, request.getParameter("password"));
			st.setString(5, request.getParameter("DOB"));
			st.setString(6, request.getParameter("gender"));

			st.executeUpdate();
			st.close();
			con.close();
			PrintWriter out = response.getWriter();
			out.println("<html><body><b>Successfully Inserted" + "</b></body></html>");
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}