//fro oop 
//for (i = initial condition; 1<=1000; i++){

import java.io.*;
import java.util.Scanner;

class RaposoJLab5 {
	
	public static Scanner in = new Scanner (System.in);
	
	public static void main (String args[]) throws IOException {
		int typed = 1; 
		
		System.out.println("Welcome to my Lab 5");
		System.out.println();
		System.out.println("which program would you like to run?");
		
		while (typed != 0){
			System.out.println();
			System.out.println("1: Character reader");
			System.out.println("2: Sequence of characters");
			System.out.println("3: Simple addition");
			System.out.println("0: Quit");
			
			typed = getMeanInt();
			
			switch (typed){
			case 1: One();
				break;
			
			case 2: Two();
				break;
			
			case 3: Three();
				break;
			}
		}
	}// main
	
	public static int getMeanInt() {
		int retval = 0, counter = 0; 
		String dummy = new String();
		boolean goodint = false;
		
		while (!goodint){
			if (in.hasNextInt()){
				retval = in.nextInt();
				goodint = true;
			} else {
				dummy = in.nextLine();
				System.out.println(" BrUh that wasn't an integer. Please enter an integer this time");
			}
		}
		
		return retval;
		
	}

	public static void One() throws IOException {
		int charval = 0;
		char mychar = 2;
		
		System.out.println("Please enter a character, or enter 0 to stop");
		
		while (charval != 48){
			charval = System.in.read();
			
			if (charval > 32){
				mychar = (char) charval;
				System.out.println("Letter value read was " + charval + " character is "+ mychar);
				System.out.println();
			}
		}
		
	} //one
	
	public static void Two() throws IOException {
		int charval = 0, charval2 = 0, counter = 0, max = 0, min = 0;
		char mychar;
		
		System.out.println("please enter your first character");
			
			while (counter != 1){
				charval = System.in.read();
				if (charval > 32){
					mychar = (char) charval;
					counter = 1;
				}	
			}
			
			System.out.println("please enter second character");
			
			while (counter != 0){
				charval2 = System.in.read();
				if (charval2 > 32){
					mychar = (char) charval;
					counter = 0;
				}	
			}
		System.out.println();
		
		max = (charval > charval2) ? charval : charval2;
		min = (charval < charval2) ? charval : charval2;
		
		while (min <= max){
			mychar = (char) min;
			System.out.println(mychar + " : " + min);
			min++;
		}
	
	}//two
		
	public static void Three() throws IOException {
		int sum = 0, sum1 = 0, input = 0, number = 0, box [] = new int [16];
		
		System.out.println("please enter two numbers, up to 6 digits long, separated by a space");
		
		for (number = 0; number < 16; number++) {
			input = System.in.read();
			
			if (input > 47)
				box [number] = input - (int) '0';
			
			if (input == 45)
				box [number] = -1;
				
			if (input == 32)
				box [number] = 10;
			
			if (input == 13){
				while (number < 16){
					box [number] = 11;
					number++;
				}
			}	
		}
		 
		for (number = 0; number < 15; number++){
			
			if (box [number] == -1){
				number++;
				
				while  (number < 15 && box [number] < 10) {
					sum = (sum * 10) - box [number];
					number++;
				}
			}
			
			if (box [number] < 10 && box [number] >= 0)
				sum = (sum * 10) + box [number];
			
			if (box [number] == 11)
				number = 15;
			
			if (number < 15 && box [number] == 10){
				sum1 = sum;
				sum = 0;
			}	
		}
		
		sum = sum + sum1;
		
		System.out.println();
		System.out.println("The sum is: " + sum);
	}
		
	
}//class