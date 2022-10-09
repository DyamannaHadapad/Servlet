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
		for (String ref : list) {
			System.out.println("All State Names  : " + "  " + ref);

		}
		System.out.println("All State Names  : " + "  " + list);

		list.stream().filter(state -> state.endsWith("a")).forEach((elements) -> {
			System.out.println("states endswith 'a' letter   :" + "  " + elements);
		});

		System.out.println("=====================================");

		list.stream().filter(state -> state.startsWith("k")).forEach((elements) -> {
			System.out.println("states startswith 'k' letter   :" + "  " + elements);
		});

		System.out.println("=====================================");

		list.stream().filter(state -> state.contains("l")).forEach((elements) -> {
			System.out.println("state contains 'l' letter    :" + "  " + elements);
		});
		System.out.println("=====================================");
		list.stream().filter(state -> state.contains("d")).forEach((elements) -> {
			System.out.println("state contains 'd' letter    :" + "  " + elements);
		});
		System.out.println("=====================================");
		list.stream().filter(state -> state.contains("r")).forEach((elements) -> {
			System.out.println("state contains 'r' letter    :" + "  " + elements);
		});
		System.out.println("=====================================");
		list.stream().filter(state -> state.contains("h")).forEach((elements) -> {
			System.out.println("states contains  'h' letter   :" + "  " + elements);
		});

		System.out.println("=====================================");

		list.stream().filter(state -> state.length() > 10).forEach((elements) -> {
			System.out.println("above 10 charecters    :" + "  " + elements);
		});
		System.out.println("=====================================");
		list.stream().filter(state -> state.length() < 5).forEach((elements) -> {
			System.out.println("below 5 charecters   :" + "  " + elements);
		});
		System.out.println("=====================================");

		list.stream().forEach((elements) -> {
			System.out.println("LowerCase   :" + "  " + elements.toLowerCase());
		});
		System.out.println("=====================================");
		list.stream().forEach((elements) -> {
			System.out.println("UpperCase   :" + "  " + elements.toUpperCase());
		});

		System.out.println("=====================================");

		list.stream().forEach((elements) -> {
			System.out.println("reversed   :" + "  " + new StringBuilder(elements).reverse());
		});

		System.out.println("=====================================");
	}

}
