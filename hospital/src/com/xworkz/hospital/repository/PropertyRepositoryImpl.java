package com.xworkz.hospital.repository;

import com.xworkz.hospital.dto.ProjecterDTO;
import com.xworkz.hospital.dto.PropertyDTO;

public class PropertyRepositoryImpl implements PropertyRepository {
	public PropertyRepositoryImpl() {
		System.out.println("creating PropertyRepositoryImpl default constr....." + getClass().getSimpleName());
	}

	@Override
	public boolean save(PropertyDTO dto) {
		System.out.println("running save method to repository ....." + dto);
		return true;
	}

}
