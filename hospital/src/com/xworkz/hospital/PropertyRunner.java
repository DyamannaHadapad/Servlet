package com.xworkz.hospital;

import com.xworkz.hospital.dto.PropertyDTO;
import com.xworkz.hospital.service.PropertyService;
import com.xworkz.hospital.service.PropertyServiceImpl;

public class PropertyRunner {

	public static void main(String[] args) {

		PropertyDTO dto = new PropertyDTO(5, "Nandesh", "landType", 1500000d);

		PropertyService propertyService = new PropertyServiceImpl();
		propertyService.validateAndSave(dto);

	}

}
