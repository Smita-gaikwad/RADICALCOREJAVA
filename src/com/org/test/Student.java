/**
 * 
 */
package com.org.test;

import java.util.Objects;

/**
 * 
 */
public class Student {

	private int id;
	private String name;
	private int sub1, sub2,sub3;
	private int totalMarks;
	private float percentage;

	public Student() {
		super();
	}

	public Student(int id, String name, int sub1, int sub2, int totalMarks, float percentage) {
		super();
		this.id = id;
		this.name = name;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.totalMarks = totalMarks;
		this.percentage = percentage;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSub1() {
		return sub1;
	}

	public void setSub1(int sub1) {
		this.sub1 = sub1;
	}

	public int getSub2() {
		return sub2;
	}

	public void setSub2(int sub2) {
		this.sub2 = sub2;
	}

	public int getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}

	public float getPercentage() {
		return percentage;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", sub1=" + sub1 + ", sub2=" + sub2 + ", totalMarks="
				+ totalMarks + ", percentage=" + percentage + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, percentage, sub1, sub2, totalMarks);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return id == other.id && Objects.equals(name, other.name)
				&& Float.floatToIntBits(percentage) == Float.floatToIntBits(other.percentage) && sub1 == other.sub1
				&& sub2 == other.sub2 && totalMarks == other.totalMarks;
	}
	
	
	

}
