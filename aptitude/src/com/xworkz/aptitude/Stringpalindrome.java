package com.xworkz.aptitude;

public class Stringpalindrome {

	public static void main(String[] args) {

		String s = "GADAG";
		String reverse = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			reverse = reverse + s.charAt(i);
		}
		if (s.equals(reverse)) {
			System.out.println(s+"   :"+"   Is palindrome");
		} else {
			System.out.println(s+"   :"+"   Is not palindrome");
		}

	}

}
