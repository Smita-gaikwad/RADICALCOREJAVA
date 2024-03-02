package com.org.test;
import java.util.Scanner;

public class Asign4Student {
	
	static int id;
	static String studName="smita";
	static int sub1,sub2,sub3,total;
	static float percentage;
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Asign4Student asign4Student = new Asign4Student();
		Scanner scanner = new Scanner(System.in);
		
		
	    		
		System.out.println("Please Enter Student ID");
		id = scanner.nextInt();
		
		System.out.println("Please Enter Student Name");
		studName=scanner.next();
		
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
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}




	public static int getId() {
		return id;
	}




	public static String getStudName() {
		return studName;
	}




	public static int getSub1() {
		return sub1;
	}




	public static int getSub2() {
		return sub2;
	}




	public static int getSub3() {
		return sub3;
	}




	public static int getTotal() {
		return total;
	}




	public static float getPercentage() {
		return percentage;
	}




	public static void setId(int id) {
		Asign4Student.id = id;
	}




	public static void setStudName(String studName) {
		Asign4Student.studName = studName;
	}




	public static void setSub1(int sub1) {
		Asign4Student.sub1 = sub1;
	}




	public static void setSub2(int sub2) {
		Asign4Student.sub2 = sub2;
	}




	public static void setSub3(int sub3) {
		Asign4Student.sub3 = sub3;
	}




	public static void setTotal(int total) {
		Asign4Student.total = total;
	}




	public static void setPercentage(float percentage) {
		Asign4Student.percentage = percentage;
	}
	public Asign4Student() {
		
	}




	@Override
	public String toString() {
		return "Asign4Student [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	

}
