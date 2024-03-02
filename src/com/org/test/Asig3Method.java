package com.org.test;

import java.util.Scanner;

public class Asig3Method {

	public static int Checkage(int age) {
		if (age > 18) {
			System.out.println("you are qualified");

		} else
			System.out.println("you are underage please try later");

		age = age + 2;

		return age;
	}

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter age");
			int age = scanner.nextInt();

			System.out.println("After 2 years you will be " + Checkage(age));
		}

	}

}
