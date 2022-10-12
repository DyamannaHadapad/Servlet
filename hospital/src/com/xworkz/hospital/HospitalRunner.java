package com.xworkz.hospital;

import com.xworkz.hospital.dto.HospitalDTO;
import com.xworkz.hospital.service.HospitalService;
import com.xworkz.hospital.service.HospitalServiceImpl;

public class HospitalRunner {

	public static void main(String[] args) {

		HospitalDTO dto = new HospitalDTO(1, "jay deva", "KLRAHUL", 1972, "Heart");

		HospitalService hospitalService = new HospitalServiceImpl();
		hospitalService.validateAndSave(dto);

	}

}
