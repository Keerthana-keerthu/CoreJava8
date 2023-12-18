/*AGENDA 
 * while loop
		while(conditon){
		statement;
		increment/decrement(updation);
		}
 * do while loop
 		do{
 		statement;
 		increment/decrement(updation);
 		}while(condition);
 * for loop
 * 		for(initialization;condition;increment/decrement)
 *		{
 			statement;
 		}
 	Jump Statements
 		break;
 		continue;
 */

package com.study_java;

public class Loops {

	public static void main(String[] args) {
		//while loop
		System.out.println("While Loop");
		int i=1,n=5;
		while(i<=n)
		{
			System.out.println("Hello  "+i);
			i++;
		}
		System.out.println("\n");
		System.out.println("Do while Loop");
		//do while loop
		int start=1,end=5;
		do
		{
			System.out.println("hi "+start);
			start++;
		}while(start>=end);
		System.out.println("\n");
		System.out.println("For loop");
		
		//for loop
		for(int i1=0;i1<5;i1++)
		{
			System.out.print("* ");
		}
		System.out.println("\n");
		System.out.println("Nested For Loop");
		//Nested for loop
		for(int i1=0;i1<5;i1++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
