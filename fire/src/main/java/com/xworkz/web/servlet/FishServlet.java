package com.xworkz.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 8, urlPatterns = "/switch")
public class FishServlet extends HttpServlet {

	public FishServlet() {
		System.out.println("FishServlet defult constr");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running service method");
		String name = req.getParameter("AliasName");
		String company1 = req.getParameter("offer");
		String salary1 = req.getParameter("salary");

		System.out.println("Name     :" + name);
		System.out.println("Company  :" + company1);
		System.out.println("Salary   :" + salary1);

		// System.out.println("Name : ".concat(name) + "company : ".concat(company) +
		// "salary : ".concat(salary));
		resp.setContentType("text/html");
		PrintWriter santhosh = resp.getWriter();
		santhosh.append("<html>").append("<body>").append("<h1 style= 'color:green';>").append("THIS IS WORKING").append("</h1>")
				.append("<h3>").append("Alias Name    :").append(name)
				.append("<br>")
				.append("Company Name    :").append(company1)
				.append("<br>")
				.append("Salary    :").append(salary1)
				.append("</h3>").append("</body>").append("</html>");

	}

}
