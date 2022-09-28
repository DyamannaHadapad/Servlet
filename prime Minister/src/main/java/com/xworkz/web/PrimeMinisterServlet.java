package com.xworkz.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 10, urlPatterns = "/Atal")
public class PrimeMinisterServlet extends HttpServlet {
	public PrimeMinisterServlet() {
		System.out.println("primeminister defult constr");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("using post methid to get data");
		resp.setContentType("text/html");

		String name = req.getParameter("name");
		String country = req.getParameter("country");
		String status = req.getParameter("status");
		String party = req.getParameter("party");
		String age = req.getParameter("age");
		String gender = req.getParameter("Gender");
		String period = req.getParameter("period");
		String time = req.getParameter("time");

		req.setAttribute("name", name);
		req.setAttribute("country", country);
		req.setAttribute("status", status);
		req.setAttribute("party", party);
		req.setAttribute("age", age);
		req.setAttribute("gender", gender);
		req.setAttribute("period", period);
		req.setAttribute("time", time);
		
		
		
	  RequestDispatcher dispatcher=  req.getRequestDispatcher("/Success.jsp");
	  dispatcher.forward(req, resp);

		
		
		

	}
}
