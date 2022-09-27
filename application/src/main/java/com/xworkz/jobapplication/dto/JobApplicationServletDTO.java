package com.xworkz.jobapplication.dto;

public class JobApplicationDTO {

	private String name;
	private String email;
	private String num;
	private String altNum;
	private String gender;
	private String address;
	private String qualification;
	private String passout;
	private String university;
	private String skills;
	private String salary;
	private String exp;
	private String proof;
	private String proofNum;

	public JobApplicationDTO(String name, String email, String num, String altNum, String gender, String address,
			String qualification, String passout, String university, String skills, String salary, String exp,
			String proof, String proofNum) {
		super();
		this.name = name;
		this.email = email;
		this.num = num;
		this.altNum = altNum;
		this.gender = gender;
		this.address = address;
		this.qualification = qualification;
		this.passout = passout;
		this.university = university;
		this.skills = skills;
		this.salary = salary;
		this.exp = exp;
		this.proof = proof;
		this.proofNum = proofNum;
	}

	@Override
	public String toString() {
		return "JobApplicationDTO [name=" + name + ", email=" + email + ", num=" + num + ", altNum=" + altNum
				+ ", gender=" + gender + ", address=" + address + ", qualification=" + qualification + ", passout="
				+ passout + ", university=" + university + ", skills=" + skills + ", salary=" + salary + ", exp=" + exp
				+ ", proof=" + proof + ", proofNum=" + proofNum + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

}
