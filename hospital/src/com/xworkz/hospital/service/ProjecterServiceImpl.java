package com.xworkz.hospital.service;

import com.xworkz.hospital.dto.ProjecterDTO;
import com.xworkz.hospital.repository.ProjecterRepository;
import com.xworkz.hospital.repository.ProjecterRepositoryImpl;

public class ProjecterServiceImpl implements ProjecterService {

	public ProjecterServiceImpl() {
		System.out.println("Creating ProjecterServiceImpl defult constrr....." + getClass().getSimpleName());
	}

	@Override
	public boolean validateAndSave(ProjecterDTO dto) {
		int id = dto.getId();
		String brand = dto.getBrand();
		String color = dto.getColor();
		double price = dto.getPrice();

		if (id > 2 && id < 10) {
			System.out.println("id is valid");
			if (brand != null && brand.length() > 5 && brand.length() < 15) {
				System.out.println("brand is valid");
				if (color != null && color.length() > 5 && color.length() < 15) {
					System.out.println("color is valid");
					if (price > 1000d && price < 20000d) {
						System.out.println("price is valid");

						ProjecterRepository projecterRepository = new ProjecterRepositoryImpl();
						projecterRepository.save(dto);
					} else {
						System.err.println("price is invalid");
					}

				} else {
					System.err.println("color is invalid");
				}

			} else {
				System.err.println("brand is invalid");
			}

		} else {
			System.err.println("id is invald");
		}

		return false;
	}

}
