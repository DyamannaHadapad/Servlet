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

import com.xworkz.jobapplication.dto.JobApplicationServletDTO;

@WebServlet(loadOnStartup = 20, urlPatterns = "/job")
public class JobApplicationServlet extends HttpServlet {

	List<JobApplicationServlet> list = new ArrayList<JobApplicationServlet>();

	public JobApplicationServlet() {
		System.out.println("Running defult constr");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running service method");
		String name = req.getParameter("Name");
		String email = req.getParameter("Email");
		String num = req.getParameter("PhoneNo");
		String altNum = req.getParameter("Alternative Phone No");
		String gender = req.getParameter("Gender");
		String address = req.getParameter("Enter Address");
		String qualification = req.getParameter("Qualification");
		String passout = req.getParameter("Year Of Passout");
		String university = req.getParameter("University");
		String[] skills = req.getParameterValues("select");
		
		for (String string : skills) {
			System.out.println("Selected   " + skills);
			
			

		}
		// String skills = req.getParameter("select");
		String salary = req.getParameter("ExceptedSalary");
		String exp = req.getParameter("Experience");
		String proof = req.getParameter("Id Proof");
		String proofNum = req.getParameter("Id Proof Number");

		System.out.println("name".concat(name) + "email".concat(email) + "num".concat(name) + "altNum".concat(name)
				+ "gender".concat(name) + "address".concat(name) + "qualification".concat(name)
				+ "passout".concat(passout) + "university".concat(university) + "skills" + "salary".concat(salary)
				+ "exp".concat(exp) + "proof".concat(proof) + "proofNum".concat(proofNum));

		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.append("<html>").append("<body>").append("<h1 style='color:red';>")
				.append("Registration is success,below is the details").append("</h1>").append("NAME  :").append(name)
				.append("<br>").append("EMAIL  :").append(email).append("<br>").append("PHONE NO  :").append(num)
				.append("<br>").append("ALTERNATIVE PHONE NO   :").append(altNum).append("<br>").append("GENDER  :")
				.append(gender).append("<br>").append("ENTER ADDRESS").append(address).append("<br>")
				.append("QUALIFICATION  :").append(qualification).append("<br>").append("YEAR OF PASSOUT  :")
				.append(passout).append("<br>").append("UNIVERSITY  :").append(university).append("<br>")
				.append("SKILLS  :").append(skills).append("<br>").append("EXPECTED SALARY  :").append(salary)
				.append("<br>").append("EXPERIENCE  :").append(exp).append("<br>").append("ID PROOF  :").append(proof)
				.append("<br>").append("ID PROOF NUMBER  :").append(proofNum).append("<br>").append("</body>")
				.append("</html>");

		JobApplicationServletDTO jobApplicationDTO = new JobApplicationServletDTO(name, email, num, altNum, gender,
				address, qualification, passout, university, skills, salary, exp, proof, proofNum);
		System.out.println(list.add(jobApplicationDTO));

	}

}
