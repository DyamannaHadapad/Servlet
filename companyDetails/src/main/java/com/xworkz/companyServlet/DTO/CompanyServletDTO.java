package com.xworkz.companyServlet.DTO;

public class CompanyServletDTO {

	private String companyName;
	private String founder;
	private String since;
	private String address;
	private String employee;
	private String business;

	public CompanyServletDTO() {
		System.out.println("companyServletDTO defult constr");
	}

	public CompanyServletDTO(String companyName, String founder, String since, String address, String employee,
			String business) {

		super();
		this.companyName = companyName;
		this.founder = founder;
		this.since = since;
		this.address = address;
		this.employee = employee;
		this.business = business;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getFounder() {
		return founder;
	}

	public void setFounder(String founder) {
		this.founder = founder;
	}

	public String getSince() {
		return since;
	}

	public void setSince(String since) {
		this.since = since;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmployee() {
		return employee;
	}

	public void setEmployee(String employee) {
		this.employee = employee;
	}

	public String getBusiness() {
		return business;
	}

	public void setBusiness(String business) {
		this.business = business;
	}

}
