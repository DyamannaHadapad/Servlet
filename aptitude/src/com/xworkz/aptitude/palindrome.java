package com.xworkz.aptitude;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int temp = num;
		int rev = 0, rem;

		while (temp != 0) {
			rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;

		}

		if (rev == num) {
			System.out.println(num + ":" + "given number is palindrome");
		} else {
			System.out.println(num + ":" + "Given number is not palindrome");
		}

	}

}
