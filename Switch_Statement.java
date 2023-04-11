package com.Control_Statements;

public class Switch_Statement {
	public static void main(String[] args) {
		int salary = 60000;
		switch(salary) {
		case 30000:
			System.out.println("Analyst");
			//break;
		case 40000:
			System.out.println("Software Engineer");
			//break;
		case 60000:
			System.out.println("Senior Software Engineer");
			//break;
		case 70000:
			System.out.println("Senior Consultant");
			//break;
		default:
			System.out.println("Manager");
		}
	}

}
