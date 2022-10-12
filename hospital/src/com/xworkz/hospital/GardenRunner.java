package com.xworkz.hospital;

import com.xworkz.hospital.dto.GardenDTO;
import com.xworkz.hospital.service.GardenService;
import com.xworkz.hospital.service.GardenServiceImpl;

public class GardenRunner {

	public static void main(String[] args) {

		GardenDTO dto= new GardenDTO(250, "Nandesh", "JP NAGAR", 7d, 1500d) ;
		
		GardenService gardenService = new GardenServiceImpl();
		gardenService.validateAndSave(dto);

	}

}
