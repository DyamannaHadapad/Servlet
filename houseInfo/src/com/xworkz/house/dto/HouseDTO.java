package com.xworkz.house.dto;

import com.xworkz.house.OwningType;
import com.xworkz.house.Type;

public class HouseDTO {

	private Integer id;
	private String name;
	private String ownerName;
	private Type type;
	private Integer noOfFloors;
	private Boolean loan;
	private OwningType owningType;
	private Double sqFeet;

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public int getNoOfFloors() {
		return noOfFloors;
	}

	public void setNoOfFloors(int noOfFloors) {
		this.noOfFloors = noOfFloors;
	}

	
	public Boolean getLoan() {
		return loan;
	}

	public void setLoan(Boolean loan) {
		this.loan = loan;
	}

	public OwningType getOwningType() {
		return owningType;
	}

	public void setOwningType(OwningType owningType) {
		this.owningType = owningType;
	}

	public double getSqFeet() {
		return sqFeet;
	}

	public void setSqFeet(double sqFeet) {
		this.sqFeet = sqFeet;
	}

	public HouseDTO(Integer id, String name, String ownerName, Type type, Integer noOfFloors, Boolean loan,
			OwningType owningType, Double sqFeet) {
		super();
		this.id = id;
		this.name = name;
		this.ownerName = ownerName;
		this.type = type;
		this.noOfFloors = noOfFloors;
		this.loan = loan;
		this.owningType = owningType;
		this.sqFeet = sqFeet;
	}

	@Override
	public String toString() {
		return "HouseDTO [id=" + id + ", name=" + name + ", ownerName=" + ownerName + ", type=" + type + ", noOfFloors="
				+ noOfFloors + ", loan=" + loan + ", owningType=" + owningType + ", sqFeet=" + sqFeet + "]";
	}

}
