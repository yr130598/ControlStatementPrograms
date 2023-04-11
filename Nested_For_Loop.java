package com.Control_Statements;

public class Nested_For_Loop {
	public static void main(String[] args) {
		for (int price = 10; price>=7; price--) {
		for (int rate =8; rate<=10; rate++) {
		System.out.println("&" +price +"  " + "*" +rate);
		}
		}
	}

}
