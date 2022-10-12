package com.xworkz.hospital.service;

import com.xworkz.hospital.dto.HospitalDTO;
import com.xworkz.hospital.repository.HospitalRepository;
import com.xworkz.hospital.repository.HospitalRepositoryImpl;

public class HospitalServiceImpl implements HospitalService {

	public HospitalServiceImpl() {
		System.out.println("hospitalServiceImpl defult constr ....."+getClass().getSimpleName());
	}

	@Override
	public boolean validateAndSave(HospitalDTO dto) {

		int id = dto.getId();
		String name = dto.getName();
		String founder = dto.getFounder();
		int since = dto.getSince();
		String specialization = dto.getSpecalization();

		if (id > 0 && id < 20) {
			System.out.println("Id IS valid");
			if (name != null && name.length() > 4 && name.length() < 20) {
				System.out.println("name is valid");
				if (founder != null && founder.length() > 4 && founder.length() < 20) {
					System.out.println("founder is valid");
					if (since > 1900 && since < 2023) {
						System.out.println("since is valid");
						if (specialization != null && specialization.length() > 3 && specialization.length() < 10) {
							System.out.println("specialization iS valid");
							HospitalRepository hospitalRepository = new HospitalRepositoryImpl();
							hospitalRepository.save(dto);
						} else {
							System.err.println("specialization is invalid");
						}
					} else {
						System.err.println("since is invalid");
					}

				} else {
					System.err.println("founder is invalid");
				}

			} else {
				System.err.println("name is invalid");
			}

		} else {
			System.err.println("id is invalid");
		}

		return false;
	}
}
