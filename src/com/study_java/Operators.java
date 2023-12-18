/*AGENDA
 * Operators
 * Assignment Operators =
 * Arithmetic Operators +,-,*,/,%
 * Relational Operators <,>,<=,>=,==,!=
 * Logical Operators    &&,||,!
 * */
package com.study_java;

public class Operators {

	public static void main(String[] args) {
		// Arithmetic 
		int a=10;
		int b=20;
		int add=a+b;
		int sub=a-b;
		int mul=a*b;
		int div=a/b;
		int mod=a%b;
		System.out.println("Arithmetic Operator");
		System.out.println("Add:"+add);
		System.out.println("Sub:"+sub);
		System.out.println("Mul:"+mul);
		System.out.println("div:"+div);
		System.out.println("mod:"+mod);

		// Relational 
		int f_num=90;
		int s_num=80;
		boolean less_than=f_num<s_num;
		boolean greater_than=f_num>s_num;
		boolean less_equal=f_num<=s_num;
		boolean greater_equal=f_num>=s_num;
		boolean equal=f_num==s_num;
		boolean not_equal=f_num!=s_num;
		System.out.println("Relational Operator");
		System.out.println("Less than: "+less_than);
		System.out.println("Greater than: "+greater_than);
		System.out.println("Less than or equal to: "+less_equal);
		System.out.println("greater than or equal to: "+greater_equal);
		System.out.println("equal to: "+equal);
		System.out.println("not equal to: "+not_equal);
		
		//Logical 
		int c=300,d=400;
		boolean and=c>d && c>=d;
		boolean or= c<d || c>d;
		boolean not= !and ;
		System.out.println("Logical Operator");
		System.out.println("AND : "+and);
		System.out.println("OR : "+or);
		System.out.println("NOT : "+not);
	}

}
