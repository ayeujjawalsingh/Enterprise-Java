package com.firstservlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException{
		int k = (int)req.getAttribute("k");
		k = k * k;
		PrintWriter out = res.getWriter();
		out.println("Result is: "+k);
	}
}
