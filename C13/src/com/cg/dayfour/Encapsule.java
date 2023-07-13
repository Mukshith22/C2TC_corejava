package com.cg.dayfour;

public class Encapsule {
	private int s_no;
	private String name;
	private int age;
	private String gender;
	private int income;
	
	//GetterAndSetter
	
	public int getS_no() {
		return s_no;
	}
	public void setS_no(int s_no) {
		this.s_no = s_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
	
	//ToString
	public String toString() {
		return "Encapsule [s_no=" + s_no + ", name=" + name + ", age=" + age + ", gender=" + gender + ", income="
				+ income + "]";
	}
	
	
	
	
}
