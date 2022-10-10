package com.xworkz.house.runner;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.house.OwningType;
import com.xworkz.house.Type;
import com.xworkz.house.dto.HouseDTO;

public class HouseRunner {

	public static void main(String[] args) {

		HouseDTO houseDTO1 = new HouseDTO(1, "Shobha", "DKC", Type.APARTMENT, 50, false, OwningType.OWN, 2000d);
		HouseDTO houseDTO2 = new HouseDTO(2, "Mantri", "BSY", Type.INDIVIDUAL, 20, true, OwningType.LEASE, 1000d);
		HouseDTO houseDTO3 = new HouseDTO(5, "Shriram Infinity", "JAGGESH", Type.VILLA, 30, false, OwningType.RENT,
				500d);
		HouseDTO houseDTO4 = new HouseDTO(4, "Neo Town", "DARSHAN", Type.APARTMENT, 80, true, OwningType.OWN, 200d);
		HouseDTO houseDTO5 = new HouseDTO(3, "Green Bay", "SUDDEP", Type.INDIVIDUAL, 30, false, OwningType.LEASE,
				2400d);
		HouseDTO houseDTO6 = new HouseDTO(7, "Simponi", "DANAVEER", Type.VILLA, 25, false, OwningType.RENT, 2360d);
		HouseDTO houseDTO7 = new HouseDTO(8, "Infinity", "SACHIN", Type.VILLA, 35, true, OwningType.OWN, 1200d);
		HouseDTO houseDTO8 = new HouseDTO(10, "Mantri Elite", "BASAVARAJ", Type.INDIVIDUAL, 40, false, OwningType.LEASE,
				1300d);
		HouseDTO houseDTO9 = new HouseDTO(6, "Elite ", "DADA", Type.APARTMENT, 45, true, OwningType.RENT, 1250d);
		HouseDTO houseDTO10 = new HouseDTO(9, "Durga", "MANOJ", Type.VILLA, 55, true, OwningType.LEASE, 1215d);
		HouseDTO houseDTO11 = new HouseDTO(16, "Kalbirava", "HANAMANTH", Type.INDIVIDUAL, 60, false, OwningType.OWN,
				1599d);
		HouseDTO houseDTO12 = new HouseDTO(11, "Dx max", "PRAJWAL", Type.APARTMENT, 65, true, OwningType.LEASE, 1434d);
		HouseDTO houseDTO13 = new HouseDTO(12, "Laxmi Nivas", "GURU", Type.VILLA, 70, true, OwningType.RENT, 1232d);
		HouseDTO houseDTO14 = new HouseDTO(15, "Ganesh", "PRATAP", Type.INDIVIDUAL, 75, false, OwningType.OWN, 1311d);
		HouseDTO houseDTO15 = new HouseDTO(18, "Maruthi", "NAGESH", Type.APARTMENT, 85, true, OwningType.LEASE, 1100d);
		HouseDTO houseDTO16 = new HouseDTO(17, "Brundavana", "SHARATH", Type.VILLA, 90, false, OwningType.RENT, 1313d);
		HouseDTO houseDTO17 = new HouseDTO(14, "Jain", "CHANDRU", Type.INDIVIDUAL, 6, true, OwningType.OWN, 450d);
		HouseDTO houseDTO18 = new HouseDTO(13, "Neeyattaa", "NANDESH", Type.APARTMENT, 5, true, OwningType.LEASE,
				1266d);
		HouseDTO houseDTO19 = new HouseDTO(19, "Jai ganesh", "MODI", Type.VILLA, 9, true, OwningType.RENT, 1600d);
		HouseDTO houseDTO20 = new HouseDTO(20, "Dada", "SWAMIJI", Type.INDIVIDUAL, 14, false, OwningType.OWN, 1800d);

		List<HouseDTO> houseDTOs = new ArrayList<HouseDTO>();

		houseDTOs.add(houseDTO1);
		houseDTOs.add(houseDTO2);
		houseDTOs.add(houseDTO3);
		houseDTOs.add(houseDTO4);
		houseDTOs.add(houseDTO5);
		houseDTOs.add(houseDTO6);
		houseDTOs.add(houseDTO7);
		houseDTOs.add(houseDTO8);
		houseDTOs.add(houseDTO9);
		houseDTOs.add(houseDTO10);
		houseDTOs.add(houseDTO11);
		houseDTOs.add(houseDTO12);
		houseDTOs.add(houseDTO13);
		houseDTOs.add(houseDTO14);
		houseDTOs.add(houseDTO15);
		houseDTOs.add(houseDTO16);
		houseDTOs.add(houseDTO17);
		houseDTOs.add(houseDTO18);
		houseDTOs.add(houseDTO19);
		houseDTOs.add(houseDTO20);

		houseDTOs.stream().sorted((c1, c2) -> {
			return Integer.compare(c1.getId(), c2.getId());
		}).forEach((e) -> System.out.println(e));

		System.out.println("=========================================================================================");

		houseDTOs.stream().sorted((c1, c2) -> {
			return Integer.compare(c2.getId(), c1.getId());
		}).forEach((e) -> System.out.println(e));

		System.out.println("=========================================================================================");

		houseDTOs.stream().sorted((c1, c2) -> c1.getName().compareTo(c2.getName()))
				.forEach((e) -> System.out.println(e));

		System.out.println("=========================================================================================");

		houseDTOs.stream().sorted((c1, c2) -> c2.getName().compareTo(c1.getName()))
				.forEach((e) -> System.out.println(e));

		System.out.println("=========================================================================================");

		houseDTOs.stream().sorted((c1, c2) -> c2.getType().compareTo(c1.getType()))
				.forEach((e) -> System.out.println(e));

		System.out.println("=========================================================================================");

		houseDTOs.stream().sorted((c1, c2) -> {
			return Double.compare(c2.getSqFeet(), c1.getSqFeet());
		}).forEach((e) -> System.out.println(e));

		System.out.println("=========================================================================================");

		houseDTOs.stream().filter((ref) -> ref.getLoan())
				.sorted((c1, c2) -> c2.getOwnerName().compareTo(c1.getOwnerName()))
				.forEach((e) -> System.out.println(e));

		System.out.println("=========================================================================================");

		houseDTOs.stream().filter((ref) -> ref.getLoan() == false)
				.sorted((c1, c2) -> c2.getOwnerName().compareTo(c1.getOwnerName()))
				.forEach((e) -> System.out.println(e));

		System.out.println("=========================================================================================");

		houseDTOs.stream().filter((ref) -> ref.getOwningType() == OwningType.LEASE)
				.forEach((e) -> System.out.println(e));

		System.out.println("=========================================================================================");

		houseDTOs.stream().filter((ref) -> ref.getType() == Type.APARTMENT).forEach((e) -> System.out.println(e));

		System.out.println("=========================================================================================");

		houseDTOs.stream().filter((ref) -> ref.getType() == Type.VILLA).forEach((e) -> System.out.println(e));

		System.out.println("=========================================================================================");

		houseDTOs.stream().sorted((c1, c2) -> {
			Integer a = c1.getType().compareTo(c2.getType());
			if (a == 0) {
				return c1.getOwningType().compareTo(c2.getOwningType());
			}

			return a;
		}).forEach((e) -> System.out.println(e));

		System.out.println("=========================================================================================");

		houseDTOs.stream().sorted((c1, c2) -> {
			int a = c2.getName().compareTo(c1.getName());
			if (a == 0) {
				return c2.getId().compareTo(c1.getId());
			}
			return a;
		}).forEach((e) -> System.out.println(e));
		
		System.out.println("=========================================================================================");

	}

}
