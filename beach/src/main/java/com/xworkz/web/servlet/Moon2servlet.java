package com.xworkz.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 15, urlPatterns = "/hot")
public class Moon2servlet extends HttpServlet {
	public Moon2servlet() {
		System.out.println("this is defult constr");
	}

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("running method");
		arg1.setContentType("text/html");
		PrintWriter writer = arg1.getWriter();
		writer.append("<html> <head><body bgcolor='yellow'; >" + " <h1>IDU YELLOW </h1>").append(" </body></head> </html>");

	}

}
