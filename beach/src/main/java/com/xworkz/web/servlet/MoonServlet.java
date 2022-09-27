package com.xworkz.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 10, urlPatterns = "/water")
public class MoonServlet extends HttpServlet {

	public MoonServlet() {
		System.out.println("this is defult constr");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running service is moonservlet");
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.append("<html> <body bgcolor='green'; > <h1>IDU GREEN</h1>  </body> </html>");
		// super.service(req, resp);
	}

}
