package com.org.test;

import java.util.Objects;
import java.util.Scanner;

public class Springvalley {

	private int flatNum ;
	private int flatNumppl;
	private String flatsirname;

	public Springvalley(int flatNum, int flatNumppl, String flatsirname) {
		super();
		this.flatNum = flatNum;
		this.flatNumppl = flatNumppl;
		this.flatsirname = flatsirname;
	}

	public Springvalley() {
		super();

	}

	public int getFlatNum() {
		return flatNum;
	}

	public void setFlatNum(int flatNum) {
		this.flatNum = flatNum;
	}

	public int getFlatNumppl() {
		return flatNumppl;
	}

	public void setFlatNumppl(int flatNumppl) {
		this.flatNumppl = flatNumppl;
	}

	public String getFlatsirname() {
		return flatsirname;
	}

	public void setFlatsirname(String flatsirname) {
		this.flatsirname = flatsirname;
	}

	@Override
	public int hashCode() {
		return Objects.hash(flatNum, flatNumppl, flatsirname);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Springvalley other = (Springvalley) obj;
		return flatNum == other.flatNum && flatNumppl == other.flatNumppl
				&& Objects.equals(flatsirname, other.flatsirname);
	}
	
	

	@Override
	public String toString() {
		return "Springvalley [flatNum=" + flatNum + ", flatNumppl=" + flatNumppl + ", flatsirname=" + flatsirname + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		Springvalley springvalley = new Springvalley();

		System.out.println("Enter Flat number");
		int flatNum = scanner.nextInt();

		System.out.println("Enter number of people per flat");
		int flatNumppl = scanner.nextInt();

		System.out.println("Enter the flat owner sirname");
		String flatsirname = scanner.nextLine();

		springvalley.setFlatNum(flatNum);
		
		System.out.println(springvalley.toString());

	}

}
