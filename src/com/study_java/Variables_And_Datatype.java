/* AGENDA 
 *   --> Variables 
 *          It is a container which used to store the value 
 *       Syntax    DataType Variable_name AssignmentOperator Value ; 
 *   --> Data Types 
 *          it specify the different sizes and values that can be stored in the variable (how much space is need to store variable in memory) 
 *           1. Primitive data type 
 *           2. Reference data type */
package com.study_java;

public class Variables_And_Datatype {

	public static void main(String[] args) {
		// boolean
		/*   --> it is used to store only two possible values True and False. 
		 *   --> It is used for simple flags that track true?false conditions.
		 *   --> This data type specifies one bit
		 *   Syntax  boolean var_name = value  */
		boolean t=true; 
		boolean f=false;
		System.out.println("Boolean Data Type");
		System.out.println("True:"+t);
		System.out.println("False:"+f);
		
		// Byte --> 1 byte (8 bit), range=> -128 to +127 , default value is 0.
		byte a=10,b=-20;
		System.out.println("Byte DataType");
		System.out.println("a b:"+a +b);
		
		// Short --> 2 bytes(16 bits) , range=> -32k to +32k , default value is 0
		short s=32000,s1= -1000;
		System.out.println("Short Data type");
		System.out.println("s:"+s);
		System.out.println("s1:"+s1);
		
		//int --> 4 bytes (32 bits) , range=> -2B to +2B 
		int i=100000000, i1=-2000000000;
		System.out.println("Int Data type");
		System.out.println("i:"+i);
		System.out.println("i1:"+i1);
		
		//Long --> 8 bytes(64 bits), range=> 
		long l=1000000000000000L, l1=800000000000000000L;
		System.out.println("Long Data Type");
		System.out.println("l:"+l);
		System.out.println("l1:"+l1);
		
		// Float --> 4 bytes 
		float F=0.15f, f1=-1.5555f;
		System.out.println("Float Data Type");
		System.out.println("f:"+F);
		System.out.println("f1:"+f1);
		
		// Double --> 8 bytes , it is default in java
		double d=83572047, d1=-38284761;
		System.out.println("Double Data Type");
		System.out.println("d:"+d);
		System.out.println("d1:"+d1);
		
		//char --> 2 bytes(16 bits) ,range => 0('\u0000' to 65,6535('\uffff')
		char c='K';
		System.out.println("Character Data Type");
		System.out.println("c:"+c);
		
	}

}
