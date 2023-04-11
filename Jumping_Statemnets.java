package com.Control_Statements;

public class Jumping_Statemnets {
	public static void main(String[] args) {
		for(int a = 1; a<=10; a++) {
			if (a == 5) {
		
				break;
			
			}
			System.out.println(a);
		}
		
		System.out.println();
		
		for(int b = 1; b<=10; b++) {
			if(b==2) {
				continue;// skip
			}
			System.out.println(b);
			
		}
	}

}
