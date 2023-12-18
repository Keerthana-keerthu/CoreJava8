package com.java_practice;

import java.util.Scanner;

public class CheckEvenOrOddNumber {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Number to check even or odd: ");
		int num=in.nextInt();
		if(num%2==0) {
			System.out.println(num+" It is Even number");
		}
		else {
			System.out.println(num+" It is Odd number");
		}
	}

}
