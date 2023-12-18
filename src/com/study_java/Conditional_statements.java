/*AGENDA
 *   Conditional Statements
 *    1. if Statement
 *    		if(condition)
 *    		{ 
 *    			statement;
 *    		}
 *    2. if else statement
 *    		if(condition)
 *    		{ 
 *    			true-statement;
 *    		}
 *    		else
 *    		{
 *    			false-statement;
 *    		}
 *    3. else-if statement
 *    		if(condition)
 *    		{ 
 *    			true-statement1;
 *    		}
 *    		else if(condition)
 *    		{
 *    			statement2;
 *    		}
 *    		else
 *    		{
 *    			false-statement;
 *    		}
 *    4. Nested if statement
 *    		if(condition)
 *    		{ 
 *    			if(condition){
 *    				true-statement1;
 *    			}
 *    		}
 *    		else
 *    		{
 *    			false-statement;
 *    		}
 *    
 *    Ternary Operator
 *       condition?true-statement:false-statement
 */
package com.study_java;
import java.util.Scanner;

public class Conditional_statements {

	public static void main(String[] args) {
		// if Statement
		/*int a=20,b=10;
		if(a>b)
		{
			System.out.println("Greater:"+a);
		}
		
		// else Statement
		int a1=20,b1=10;
		if(a1<b1)
		{
			System.out.println("Greater:"+a1);
		}
		else
		{
			System.out.println("Greater:"+b1);
		}
		
		//else if
		int f=10,s=40,l=50;
		if(f>s && f>l)
		{
			System.out.println("f is Greater:"+f);
		}
		else if(s>f && s>l)
		{
			System.out.println("s is Greater:"+s);
		}
		else {
			System.out.println("l is Greater:"+l);
		}
		
		//Nested if 
		int f1=20,s1=70,l1=80;
		if(f1>s1)
		{
			if(f1>l1)
			{
				System.out.println("f1 is Greater:"+f1);
			}
		}
		else if(s1>f1)
		{
			if(s1>l1)
			{
				System.out.println("s1 is Greater:"+s1);
			}
			else {
				System.out.println("l1 is Greater:"+l1);
			}
		}
		//Ternary Operator
		int f2=20,s2=10,res;
		res=(f2<s2)?f2:s2;
		System.out.println("Lesser is "+res);
		*/
		
		//Switch
		Scanner c=new Scanner(System.in);
		System.out.println("Enter first number:");
		int f=c.nextInt();
		System.out.println("Enter second number:");
		int s=c.nextInt();
		System.out.println("Enter a operation:");
		char cal=c.next().charAt(0);
		switch(cal)
		{
		case '+':
			System.out.println("Result of Add: "+(f+s));
			break;
		case '-':
			System.out.println("Result of Sub: "+(f-s));
			break;
		case '*':
			System.out.println("Result of Mul: "+(f*s));
			break;
		case '/':
			System.out.println("Result of Div: "+(f/s));
			break;
		case '%':
			System.out.println("Result of Sub: "+(f%s));
			break;
		default:
			System.out.println("Enter vaild operator");
			break;
		}

	}
}
