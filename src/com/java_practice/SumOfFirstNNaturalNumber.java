package com.java_practice;

import java.util.Scanner;

public class SumOfFirstNNaturalNumber {
	public static void main(String[] args) {
		Scanner N=new Scanner(System.in);
		System.out.println("Enter input:");
		int num=N.nextInt();
		int sum=0,i;
		for(i=1;i<=num;i++) {
			sum=sum+i;
		}
		System.out.println("Sum of First N Natural Number is : "+sum);
	}

}
