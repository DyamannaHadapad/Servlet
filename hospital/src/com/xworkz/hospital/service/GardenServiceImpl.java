package com.xworkz.hospital.service;

import com.xworkz.hospital.dto.GardenDTO;
import com.xworkz.hospital.repository.GardenRepository;
import com.xworkz.hospital.repository.GardenRepositoryImpl;

public class GardenServiceImpl implements GardenService {

	public GardenServiceImpl() {
		System.out.println("creating default gardenServiceImpl constr...." + getClass().getSimpleName());
	}

	@Override
	public boolean validateAndSave(GardenDTO dto) {
		int people = dto.getNoOfPeople();
		String name = dto.getName();
		String located = dto.getLocated();
		Double sqFeet = dto.getSqFeet();
		Double time = dto.getTimings();

		if (people > 100 && people < 500) {
			System.out.println("NoOFPeople is valid");
			if (name != null && name.length() > 5 && name.length() < 10) {
				System.out.println("Name is valid");
				if (located != null && located.length() > 3 && located.length() < 10) {// btm layout
					System.out.println("Location is valid ");
					if (sqFeet > 1000d && sqFeet < 10000d) {
						System.out.println("sqFeet is valid");
						if (time > 6d && time < 9d) {
							System.out.println("time is valid");

							GardenRepository gardenRepository = new GardenRepositoryImpl();
							gardenRepository.save(dto);

						} else {
							System.err.println("time is invalid");
						}

					} else {
						System.err.println("sqFeet is invalid");
					}
				} else {
					System.err.println("NoOFPeople is invalid");
				}

			} else {
				System.err.println("Name is invalid");
			}
		} else {
			System.err.println("NoOFPeople is invalid");
		}

		return false;
	}

}
