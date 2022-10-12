package com.xworkz.hospital.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PropertyDTO {

	private int id;
	private String propertyOwnedBy;
	private String type;
	private double price;

}
