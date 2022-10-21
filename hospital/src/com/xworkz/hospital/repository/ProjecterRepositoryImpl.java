package com.xworkz.hospital.repository;
import java.sql.*;
import com.xworkz.hospital.dto.ProjecterDTO;

public class ProjecterRepositoryImpl implements ProjecterRepository {
	public String url = "jdbc:mysql://localhost:3306/jdbc";
	public String userName = "root";
	public String hide = "Xworkzodc@123";

	public ProjecterRepositoryImpl() {
		System.out.println("Creating ProjecterrepositoryImpl defult constrr....." + getClass().getSimpleName());

	}

	@Override
	public boolean save(ProjecterDTO dto) {
		System.out.println("running save method to repository......" + dto);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url, userName, hide);
			String sql = "insert into projecterinfo values(" + dto.getId() + ",'" + dto.getBrand() + "','"
					+ dto.getColor() + "'," + dto.getPrice() + ")";
			Statement statement = connection.createStatement();
			System.out.println(statement);
			int execute = statement.executeUpdate(sql);
			if (execute > 0) {
				System.out.println("Genarated data  ;" + sql);
				return true;

			}

		} catch (ClassNotFoundException |SQLException e) {

			e.printStackTrace();
		}

		return true;
	}

}
