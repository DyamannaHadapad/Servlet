package com.xworkz.hospital.repository;

import java.sql.*;

import com.xworkz.hospital.dto.ProjecterDTO;
import com.xworkz.hospital.dto.PropertyDTO;

public class PropertyRepositoryImpl implements PropertyRepository {
	public String url = "jdbc:mysql://localhost:3306/jdbc";
	public String userName = "root";
	public String hide = "Xworkzodc@123";

	public PropertyRepositoryImpl() {
		System.out.println("creating PropertyRepositoryImpl default constr....." + getClass().getSimpleName());
	}

	@Override
	public boolean save(PropertyDTO dto) {
		System.out.println("running save method to repository ....." + dto);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url, userName, hide);
			String sql = "insert into propertyinfo values(" + dto.getId() + ",'" + dto.getPropertyOwnedBy() + "','"
					+ dto.getType() + "'," + dto.getPrice() + ")";
			Statement statement = connection.createStatement();
			System.out.println(statement);
			int execute = statement.executeUpdate(sql);
			if (execute > 0) {
				System.out.println("Genarated data  ;" + sql);
				return true;

			}

		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}

		return true;
	}

}
