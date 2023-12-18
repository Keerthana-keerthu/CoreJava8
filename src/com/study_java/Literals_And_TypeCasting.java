/*AGENDA
 *  Literals
 *    --> here value is the literals 
 *  Type conversion and casting
 *    --> Explicit => Type casting (By our says computer will change )
 *    --> Implicit => conversion => computer itself change the lower data type into higher data type */
package com.study_java;

public class Literals_And_TypeCasting {

	public static void main(String[] args) {
		//Implicit
		byte b=127;
		int a=12;
		//b=a; // error : cannot convert from int to byte
		a=b;
		System.out.println("Implicit");
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		
		//Explicit syntax var_name = (data type) var_name; 
		byte b1=127;
		int a1=12;
		//b=a; // error : cannot convert from int to byte
		System.out.println("Before b1 val:"+b1);
		b1=(byte)a1;
		System.out.println("Explicit");
		System.out.println("a1:"+a);
		System.out.println("b1:"+b);
		
		//Type promotions 
		// When it promoted from small data type to higher data type due to out of range of value
		byte s=10;
		byte h=30;
		int result=s*h;
		System.out.println("Type promotions");
		System.out.println("Result:"+result);
	}

}
