package com.xworkz.hospital.repository;

import com.xworkz.hospital.dto.HospitalDTO;

public class HospitalRepositoryImpl implements HospitalRepository {

	public HospitalRepositoryImpl() {
		System.out.println("hodpital difult constr...."+getClass().getSimpleName());
	}

	@Override
	public boolean save(HospitalDTO dto) {
		System.out.println("running save method to repository   :" + dto);
		return true;
	}

}
