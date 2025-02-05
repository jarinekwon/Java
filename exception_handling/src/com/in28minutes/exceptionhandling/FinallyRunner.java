package com.in28minutes.exceptionhandling;

import java.util.Scanner;

public class FinallyRunner {

	public static void main(String[] args) {

		Scanner scanner = null;

		try {
			scanner = new Scanner(System.in);
			int[] numbers = { 12, 3, 4, 5 };
//			int number = numbers[5];
			int number = numbers[2];

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Before Scanner Close");
			if (scanner != null) {
				scanner.close();
			}
		} //finally는 무조건 실행(catch가 없어도 finally 실행)

			System.out.println("Just before closing out main");
		}
	}