package com.xworkz.hospital;

import com.xworkz.hospital.dto.GarageDTO;
import com.xworkz.hospital.service.GarageService;
import com.xworkz.hospital.service.GarageServiceImpl;

public class GarageRunner {

	public static void main(String[] args) {

		GarageDTO dto = new GarageDTO("Ncar Motars", "Ningappa", "car garage", "Guledgudda", 15);

		GarageService garageService = new GarageServiceImpl();
		garageService.validateAndSave(dto);
	}

}
