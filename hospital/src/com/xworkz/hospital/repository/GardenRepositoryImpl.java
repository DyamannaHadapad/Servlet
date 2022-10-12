package com.xworkz.hospital.repository;

import com.xworkz.hospital.dto.GardenDTO;

public class GardenRepositoryImpl implements GardenRepository {

	public GardenRepositoryImpl() {
		System.out.println("creating default gardenRepositoryImpl constr...." + getClass().getSimpleName());
	}

	@Override
	public boolean save(GardenDTO dto) {
		System.out.println("running save method to repository :" + dto);
		return true;
	}

}
