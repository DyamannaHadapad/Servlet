package com.xworkz.lambda;

import java.util.ArrayList;
import java.util.List;

public class Collection {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("karnataka");
		list.add("Andra pradesh");
		list.add("Arunacal pradesh");
		list.add("Assam");
		list.add("Bihar");
		list.add("Chhattisgarha");
		list.add("Goa");
		list.add("Gujarath");
		list.add("Haryana");
		list.add("Himachala pradesh");
		list.add("Jharkhanda");
		list.add("Kerala");
		list.add("Madhya pradesh");
		list.add("Maharashtra");
		list.add("Manipur");
		list.add("Meghalaya");
		list.add("Mizoram");
		list.add("Nagaland");
		list.add("Odhisha");
		list.add("Panjab");
		list.add("Rajastan");
		list.add("Sikkim");
		list.add("West bengal");
		list.add("Tamilnadu");
		list.add("Telangana");
		list.add("Tripura");
		list.add("Uttara pradesh");
		list.add("Uttarakanda");

		list.stream().filter(state -> state.endsWith("a")).forEach((elements) -> {
			System.out.println(elements);
		});

		System.out.println("=====================================");

		list.stream().filter(state -> state.startsWith("k")).forEach((elements) -> {
			System.out.println(elements);
		});

		System.out.println("=====================================");

		list.stream().filter(state -> state.contains("l")).forEach((elements) -> {
			System.out.println(elements);
		});
		System.out.println("=====================================");
		list.stream().filter(state -> state.contains("d")).forEach((elements) -> {
			System.out.println(elements);
		});
		System.out.println("=====================================");
		list.stream().filter(state -> state.contains("r")).forEach((elements) -> {
			System.out.println(elements);
		});
		System.out.println("=====================================");
		list.stream().filter(state -> state.contains("h")).forEach((elements) -> {
			System.out.println(elements);
		});
		System.out.println("=====================================");
		list.stream().map(state -> state.toUpperCase()).forEach((elements) -> {
			System.out.println(elements);
		});
		System.out.println("=====================================");
		list.stream().map(state -> state.toLowerCase()).forEach((elements) -> {
			System.out.println(elements);
		});
		System.out.println("=====================================");

		list.stream().filter(state -> state.length() > 10).forEach((elements) -> {
			System.out.println(elements);
		});
		System.out.println("=====================================");
		list.stream().filter(state -> state.length() < 5).forEach((elements) -> {
			System.out.println(elements);
		});
		System.out.println("=====================================");

		list.stream().map(state -> new StringBuilder(state).reverse()).forEach((elements) -> {
			System.out.println(elements);
		});
		System.out.println("=====================================");
		
		
	}

}
