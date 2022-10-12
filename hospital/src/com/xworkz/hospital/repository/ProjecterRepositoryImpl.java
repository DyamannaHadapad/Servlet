package com.xworkz.hospital.repository;

import com.xworkz.hospital.dto.ProjecterDTO;

public class ProjecterRepositoryImpl implements ProjecterRepository {

	public ProjecterRepositoryImpl() {
		System.out.println("Creating ProjecterrepositoryImpl defult constrr....." + getClass().getSimpleName());

	}

	@Override
	public boolean save(ProjecterDTO dto) {
		System.out.println("running save method to repository......" + dto);
		return false;
	}

}
