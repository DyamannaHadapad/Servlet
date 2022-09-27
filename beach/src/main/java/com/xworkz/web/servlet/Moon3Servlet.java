package com.xworkz.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 20, urlPatterns = "/fire")
public class Moon3Servlet extends HttpServlet {
	public Moon3Servlet() {
		System.out.println("hi");
	}

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("Running method");
		arg1.setContentType("text/html");
		PrintWriter writer = arg1.getWriter();
		writer.append("<html><head><body bgcolor='black'; > " + " <h1 style=\"color:white\">IDU BLACK </h1>")
				.append(" </body></head> </html>");

		// super.service(arg0, arg1);
	}

}
