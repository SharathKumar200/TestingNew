package com.dss;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DisplayServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();

		try {
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.107:1521:XE", "system", "admin");

			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM sharath");
			writer.println("<table border='1'>");
			writer.println("<tr><th>Name</th><th>Gender</th><th>Location</th><th>Actions</th></tr>");
			while (rs.next()) {
				writer.println("<tr>");
				writer.println("<td>" + rs.getString("name") + "</td>");

				writer.println("<td>" + rs.getString("gender") + "</td>");
				writer.println("<td>" + rs.getString("location") + "</td>");

			}

			writer.println(" <a href='Register.html'>Click here to Add the records.......</a>");
			writer.println("</table>");
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
