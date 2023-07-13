package com.cg.daytwo;

public class IfElseifElse {

	public static void main(String[] args) {
		int age=19;
		if((age>15) && (age<18))
		{
			System.out.println("Few years to go for voting");
		}
		else if((age>=18) && (age<=88)) {
			System.out.println("You are eligible to voting");
		}
		else {
			System.out.println("Invalid");
		}

	}

}
