package com.xworkz.hospital.service;

import com.xworkz.hospital.dto.GarageDTO;
import com.xworkz.hospital.repository.GarageRepository;
import com.xworkz.hospital.repository.GarageRepositoryImpl;

public class GarageServiceImpl implements GarageService {

	public GarageServiceImpl() {
		System.out.println("creating garegeServiceimpl default constr  " + getClass().getSimpleName());
	}

	GarageRepository garegeRepository = new GarageRepositoryImpl();

	@Override
	public boolean validateAndSave(GarageDTO dto) {

		String name = dto.getName();
		String owner = dto.getOwner();
		String type = dto.getType();
		String place = dto.getPlace();
		int emp = dto.getNoOfEmployes();

		if (name != null && name.length() > 5 && name.length() < 40) {
			System.out.println("name is valid");
			if (owner != null && owner.length() > 5 && owner.length() < 40) {
				System.out.println("owner is valid");
				if (type != null && type.length() > 5 && type.length() < 40) {
					System.out.println("type is valid");
					if (place != null && place.length() > 5 && place.length() < 40) {
						System.out.println("place is valid");
						if (emp > 10 && emp < 50) {
							System.out.println("Employees is valid");

							garegeRepository.save(dto);

						} else {
							System.err.println("Employees is invalid");
						}

					} else {
						System.err.println("place is invalid");
					}
				} else {
					System.err.println("type is invalid");
				}
			} else {
				System.err.println("owner is invalid");
			}
		} else {
			System.err.println("name is invalid");
		}

		return true;
	}

}
