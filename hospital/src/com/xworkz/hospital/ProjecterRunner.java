package com.xworkz.hospital;

import com.xworkz.hospital.dto.ProjecterDTO;
import com.xworkz.hospital.service.ProjecterService;
import com.xworkz.hospital.service.ProjecterServiceImpl;

public class ProjecterRunner {

	public static void main(String[] args) {

		ProjecterDTO dto = new ProjecterDTO(4, "Docomo", "projecter", 15000d);

		ProjecterService projectService = new ProjecterServiceImpl();
		projectService.validateAndSave(dto);

	}

}
