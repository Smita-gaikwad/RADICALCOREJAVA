package com.org.test;

import java.util.Scanner;

public class StudentSave {
	
	static int id,i;
	static String studName="smita";
	static int sub1,sub2,sub3,total;
	static float percentage;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Asign4Student asign4Student = new Asign4Student();
		Scanner scanner = new Scanner(System.in);
		
		for(i=1;i<=2;i++)
		{
		
		System.out.println("Please Enter Student ID");
		id = scanner.nextInt();
		
		//System.out.println("Please Enter Student Name");
		studName=scanner.nextLine();

		System.out.println("Please Enter Students Marks for SUB1 ");
		sub1=scanner.nextInt();
		
		System.out.println("Please Enter Students Marks for SUB2 ");
		sub2=scanner.nextInt();
		
		System.out.println("Please Enter Students Marks for SUB3 ");
		sub3=scanner.nextInt();
		
		total=sub1+sub2+sub3;
		percentage= (100*total)/300;
		
		System.out.println(studName+"s Total = "+total);
		System.out.println(studName+"s Percentage = "+percentage);
		
		if(percentage<40)
		{
			System.out.println("FAIL");
			
		}
		else if(percentage>=40 &&  percentage<=50)
		{
			System.out.println("Third class");
		}
		else if(percentage>=50 && percentage<=60)
		{
			System.out.println("Second class");
		}
		else if(percentage>=60 &&  percentage <=70)
		{
			System.out.println("First class");
		}
		
		else if(percentage>=70 &&  percentage <=100)
		{
			System.out.println("First classwith  Destinction");
		}
		
		
	}
	}

}
