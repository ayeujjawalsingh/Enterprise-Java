package com.login;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class login extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");
		
		if(uname.equals("heyraj") && pass.equals("1234"))
		{
			PrintWriter out = response.getWriter();
			out.print("<h1>");
			out.print("LoggedIn");
			out.print("</h1>");
			System.out.print("Login Called");
		}
	}

}
