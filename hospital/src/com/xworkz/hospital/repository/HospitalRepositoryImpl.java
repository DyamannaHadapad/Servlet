package com.xworkz.hospital.repository;

import java.sql.*;
import com.xworkz.hospital.dto.HospitalDTO;
import com.xworkz.hospital.enumClass.MySQLDBHospitalStore;

public class HospitalRepositoryImpl implements HospitalRepository {

	public HospitalRepositoryImpl() {
		System.out.println("hodpital difult constr...." + getClass().getSimpleName());
	}

	@Override
	public boolean save(HospitalDTO dto) {
		System.out.println("running save method to repository   :" + dto);

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(MySQLDBHospitalStore.URL.getValues(),
					MySQLDBHospitalStore.USERNAME.getValues(), MySQLDBHospitalStore.HIDE.getValues());
			String sql = "insert into hospital values(" + dto.getId() + ",'" + dto.getName() + "','"
					+ dto.getFounder() + "'," + dto.getSince() + ",'" + dto.getSpecalization() + "')";
//			String sql = "insert into jdbc.hospitalinfo values(" + dto.getId() + ",'" + dto.getName() + "'," + ",'"
//					+ dto.getFounder() + "'," + dto.getSince() + ",'" + dto.getSpecalization() + "')";
			Statement statement = connection.createStatement();
			System.out.println(statement);
			int execute = statement.executeUpdate(sql);
			if (execute > 0) {
				System.out.println("Genarated data   :" + sql);
				return true;
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return true;
	}

}
