package com.xworkz.hospital.repository;

import com.xworkz.hospital.dto.GarageDTO;

public class GarageRepositoryImpl implements GarageRepository {

	public GarageRepositoryImpl() {
		System.out.println("creating garageRepositoryImpl default constr   " + getClass().getSimpleName());
	}

	@Override
	public boolean save(GarageDTO dto) {
		System.out.println("running save method to repository...." + dto);
		return false;
	}

}
