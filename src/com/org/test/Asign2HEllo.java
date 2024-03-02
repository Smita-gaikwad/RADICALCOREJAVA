/**
 * 
 */
package com.org.test;
import java.util.Scanner;

/**
 * 
 */
public class Asign2HEllo {

	/**
	 * @param args
	 */
	
	public static void add (int x,int y)
	{
		int c=x+y;
		System.out.println("Addition =5"+c);
				
	}
	
	public static void subst (int c,int d)
	{
		int e=c-d;
		System.out.println("substration ="+e);
	}
	
	public static void multi(int f,int g)
	{
		int h=f*g;
		System.out.println("multiplication="+h);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		System.out.println("Hello World");
		System.out.println("Enter first number for addition=");
		int a=scanner.nextInt();
		System.out.println("Enter second number for addition=");
		int b=scanner.nextInt();
		add(a,b);
		
		System.out.println("Enter first number for substrationn");
		int c=scanner.nextInt();
		System.out.println("Enter second number for substration");
		int d=scanner.nextInt();
		subst(c,d);
		
		System.out.println("Enter first number for multiplication");
		int f=scanner.nextInt();
		System.out.println("Enter second number for substration");
		int g=scanner.nextInt();
		multi(f,g);
		
		
		
		
	}

}



