package com.dss;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RegisterServlet() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();

		String name = request.getParameter("name");

		String gender = request.getParameter("gender");
		String location = request.getParameter("location");

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.107:1521:XE", "system",
					"admin");

			PreparedStatement stmt = con
					.prepareStatement("insert into sharath (name, gender, location) values (?, ?, ?)");
			stmt.setString(1, name);
			stmt.setString(2, gender);
			stmt.setString(3, location);

			int result = stmt.executeUpdate();
			if (result == 1) {
				writer.println("Data inserted successfully.");
				writer.println("<a href='./DisplayServlet'>Click here to see the records.</a>");
			} else {
				writer.println("Registration failed.");
			}

			stmt.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}