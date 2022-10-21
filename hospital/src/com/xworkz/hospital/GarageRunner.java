package com.xworkz.hospital;

import com.xworkz.hospital.dto.GarageDTO;
import com.xworkz.hospital.service.GarageService;
import com.xworkz.hospital.service.GarageServiceImpl;

public class GarageRunner {

	public static void main(String[] args) {

		GarageDTO dto=new GarageDTO(15, "NcarMotars", "Ningappa", "Car Repair", "Guledgudd");
		GarageService garageService = new GarageServiceImpl();
		garageService.validateAndSave(dto);
	}

}
