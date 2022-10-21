package com.xworkz.hospital.enumClass;

import lombok.Getter;

@Getter
public enum MySQLDBHospitalStore {

	URL("jdbc:mysql://localhost:3306/jdbc"), USERNAME("root"), HIDE("Xworkzodc@123");

	private String values;

	private MySQLDBHospitalStore(String values) {
		this.values = values;
	}

}
