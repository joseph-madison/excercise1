package com.coderscampus.excercise1;

import java.util.Scanner;

public class Exercise1 {
	
	public static void main (String[] args) {
		
	
		
		System.out.println("Type a number between 50 and 300");
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		Integer convertedInput = Integer.parseInt(input);
		System.out.println(input);
		
		if(convertedInput > 300 | convertedInput < 50 ){
			System.out.println("NO");
		} else {
			System.out.println("YES");
		}
		
	
		scanner.close();
		
	}
	

}
