package com.xworkz.hospital.service;

import com.xworkz.hospital.dto.ProjecterDTO;
import com.xworkz.hospital.dto.PropertyDTO;
import com.xworkz.hospital.repository.PropertyRepository;
import com.xworkz.hospital.repository.PropertyRepositoryImpl;

public class PropertyServiceImpl implements PropertyService {
	public PropertyServiceImpl() {
		System.out.println("creating PropertyServiceImpl default constr..." + getClass().getSimpleName());
	}

	
	@Override
	public boolean validateAndSave(PropertyDTO dto) {
		int id = dto.getId();
		String own = dto.getPropertyOwnedBy();
		String type = dto.getType();
		double price = dto.getPrice();

		if (id > 1 && id < 10) {
			System.out.println("id is valid");
			if (own != null && own.length() > 3 && own.length() < 20) {
				System.out.println("own is valid");
				if (type != null && type.length() > 3 && type.length() < 20) {
					System.out.println("type is valid");
					if (price > 100000d && price < 2000000d) {
						System.out.println("price is valid");

						PropertyRepository propertyRepository=new PropertyRepositoryImpl();
						propertyRepository.save(dto);

					} else {
						System.err.println("price is invalid");
					}
				} else {
					System.err.println("type is invalid");
				}
			} else {
				System.err.println("own is invalid");
			}
		} else {
			System.err.println("id is invalid");
		}
		return false;
	}

}
