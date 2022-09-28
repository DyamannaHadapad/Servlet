package com.xworkz.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.companyServlet.DTO.CompanyServletDTO;

@WebServlet(loadOnStartup = 10, urlPatterns = {"/company","/Details"})
public class CompanyServlet extends HttpServlet {
	
	List<CompanyServletDTO> company=new ArrayList<CompanyServletDTO>(); 
	
	public CompanyServlet() {
		System.out.println("Running defult constr");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Using post method to get data");
		resp.setContentType("text/html");
		String companyName = req.getParameter("company Name");
		String founder = req.getParameter("founder");
		String since = req.getParameter("since");
		String employee = req.getParameter("employee");
		String address = req.getParameter("address");
		String business = req.getParameter("business");

		System.out.println("Company Name    :" + companyName);
		System.out.println("Founder Name   :" + founder);
		System.out.println("Since    :" + since);
		System.out.println("Company Employees    :" + employee);
		System.out.println("Company Address   :" + address);
		System.out.println("Company Type of Business    :" + business);

		PrintWriter writer = resp.getWriter();
		writer.append("<html>")
		.append("<body>")
		.append("<h4>")
		.append("Company Name Is  :".concat(companyName))
		.append("<br>")
		.append("Founder Name Is  :".concat(founder))
		.append("<br>")
		.append("Company Since From  :".concat(since))
		.append("<br>")
		.append("Company Employees  :".concat(employee))
		.append("<br>")
		.append("Company Address  :".concat(address))
		.append("<br>")
		.append("Company Type of Business   :".concat(business))
		.append("<br>")
		.append("</h4>")
		.append("</body>")
		.append("</html>");
		
		
		CompanyServletDTO companyServletDTO = new CompanyServletDTO(companyName, founder, since, address, employee,
				business);
	
		System.out.println(	company.add(companyServletDTO));
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doGet method");
		resp.setContentType("text/html");
		
		PrintWriter color = resp.getWriter();
		color.append("<html>")
		.append("<body>")
		.append("<h3>DISPLAY ALL THE DETAILS </h3>")
		.append("<table>");
		for (CompanyServletDTO companyServletDTO : company) {
			
		
				color.append("<tr>")
               
				.append("<td>")
				.append(companyServletDTO.getCompanyName())
				.append("</td>")
				.append("<br>")
				.append("<td>")
				.append(companyServletDTO.getFounder())
				.append("</td>")
				.append("<br>")
				.append("<td>")
				.append(companyServletDTO.getSince())
				.append("</td>")
				.append("<br>")
				.append("<td>")
				.append(companyServletDTO.getEmployee())
				.append("</td>")
				.append("<br>")
				.append("<td>")
				.append(companyServletDTO.getAddress())
				.append("</td>")
				.append("<br>")
				.append("<td>")
				.append(companyServletDTO.getBusiness())
				.append("</td>")

				
				.append("</tr>");
		
		
	};
		
		color.append("</table>")
		.append("</body>")
		.append("</html>");
		
	}

	private PrintWriter append(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
