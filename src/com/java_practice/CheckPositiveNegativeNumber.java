package com.java_practice;

import java.util.Scanner;

public class CheckPositiveNegativeNumber {

	public static void main(String[] args) {
		
		Scanner user=new Scanner(System.in);
		// Get input from the user
		System.out.println("Enter the Number:");
		int input=user.nextInt();
		
		//condition to check whether it is positive or negative
		if(input>0)
		{
			System.out.println(input+" It is a Positive Number");
		}
		else if(input<0)
		{
			System.out.println(input+" It is Negative Number");
		}
		else
		{
			System.out.println(input+" It is zero");
		}
	}

}
