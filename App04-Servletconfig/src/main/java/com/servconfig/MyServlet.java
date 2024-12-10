package com.servconfig;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(
		name="configServlet",
		urlPatterns= {"/configServlet"},
		initParams= {
				@WebInitParam(name="database",value="mysql"),
				@WebInitParam(name="max_connections", value="100")
		})
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public MyServlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		 PrintWriter writer=response.getWriter();
	}

}
