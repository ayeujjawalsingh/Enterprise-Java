package com.login;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.*;

public class login extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");
		PrintWriter out = response.getWriter();
		if(uname.equals("ayeujjawal@gmail.com") && pass.equals("1234"))
		{
			out.print("<h1>");
			out.print("Welcome");
			out.print("</h1>");
			System.out.print("Loged in");
		}
		else {
			out.print("<h1>");
			out.print("Error");
			out.print("</h1>");
			System.out.print("Failed");
		}
	}

}

