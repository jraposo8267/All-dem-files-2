import java.io.*;
import java.util.Random;
import java.util.Scanner;

class RaposoJLab6 {
	
	public static Scanner in = new Scanner (System.in);
	
	public static void main (String args[]) throws IOException {
		int typed = 1; 
		
		System.out.println("Welcome to my Lab 6");
		System.out.println();
		System.out.println("which program would you like to run?");
		
		while (typed != 0){
			System.out.println();
			System.out.println("1: The guessing game");
			System.out.println("2: Number pattern");
			System.out.println("3: Rectangles");
			System.out.println("4: Fab Factorials");
			System.out.println("5: The 1000th Prime");
			System.out.println("0: Quit");
			
			typed = getMeanInt();
			
			switch (typed){
			case 1: One();
				break;
			
			case 2: Two();
				break;
			
			case 3: Three();
				break;
				
			case 4: Four();
				break;
				
			case 5: Five();
				break;
				
			}
		}
	}// main
	
	public static int getMeanInt() {
		int retval = 0; 
		String dummy = new String();
		boolean goodint = false;
		
		while (!goodint){
			if (in.hasNextInt()){
				retval = in.nextInt();
				goodint = true;
			} else {
				dummy = in.nextLine();
				System.out.println(" Hey that wasn't an integer. Please enter an integer this time");
			}
		}
		
		return retval;
	}// get mean int

	public static void One(){
		int counter , number, guess = 0;
		Random myrand = new Random();
		
		number = myrand.nextInt(1001);
		
		System.out.println("Welcome to my game!");
		System.out.println("");
		System.out.println("I'm thinking of a number between 0 and 1000, can you guess what it is?");
		
		
		for (counter = 0; guess != number; counter++){
			guess = in.nextInt();
			
			if (guess < number){
				System.out.println("Too low!");
				System.out.println();
			}
			
			if (guess > number){
				System.out.println("Too high!");
				System.out.println();
			}
		}
		
		System.out.println("You've guessed my number (" + number + "). Nice job!");
		System.out.println("Number of guesses: " + counter);
			
	} //one
	
	public static void Two(){
		int number2 = 0, number = 0, i = 0, Tom = 0, Jerry = 0;
		
		System.out.println("please enter a whole number");
		
		number = getMeanInt();
		number2 = number;
		
		System.out.println();
		
		for (i = 0; i < number2; i++){
			Tom++;
			Jerry = 0;
			while (Jerry < Tom){
				System.out.print(number + "	");
				Jerry++;
			}
			
			System.out.println();
			number--;
		}
			
	}//two
		
	public static void Three() throws IOException {
		int counter = 0, input = 0, number = 0, width = 0, height = 0, box [] = new int [10];
		
		System.out.println("Welcome to my rectangle printer");
		System.out.println();
		System.out.println("please enter the width and height of the rectangle");
		System.out.println();
		System.out.println("please enter terms in form of #x#");
		System.out.println();
		
		for (number = 0; number < 10; number++) {
			input = System.in.read();
			
			if (input > 47)
				box [number] = input - (int) '0';
				
			if (input == 120 || input == 88)
				box [number] = 10;
			
			if (input == 13){
				while (number < 10){
					box [number] = 11;
					number++;
				}
			}	
		}
		 
		for (number = 0; number < 10; number++){
			
			if (box [number] < 10)
				height = (height * 10) + box [number];
			
			if (box [number] == 11)
				number = 15;
			
			if (number < 15 && box [number] == 10){
				width = height;
				height = 0;
			}	
		}
		
		System.out.println("width = " + width);
		System.out.println("height = " + height);
		System.out.println();
		
		for (number = 0; number < width; number++){
			
			System.out.print("*");
		}
		
		System.out.println();
		
		for (number = 0; number < (height - 2); number ++){
			
			System.out.print("*");
			
			if (width > 1){
				
				for (counter = 0; counter < (width - 2); counter ++){
				
				System.out.print(" ");
				}
			
			System.out.print("*");
			}

			System.out.println();
		}
		
		if (height > 1){
			
			for (number = 0; number < width; number++){
			
				System.out.print("*");
			}
		}
	}
	
	public static void Four () {
		int Tom = 0, total = 1, counter = 0, input = 0;
		
		System.out.println("please enter an integer");
		System.out.println();
		
		input = getMeanInt();
		
		System.out.println();
		
		for (counter = 1; counter <= input; counter++){
			
			System.out.print(counter + "! = " + counter);
			
			for (Tom = (counter - 1); Tom > 0; Tom--)
				System.out.print(" x " + Tom);
			
			total =  total * counter;
			
			System.out.println(" = " + total);
		}
	}
	
	public static void Five () {
		int number = 0, input = 0, prime = 0, counter = 0;
		
		System.out.println("which prime number would you like? ");
		
		input = getMeanInt();
		int box [] = new int [(input + 10)];
		
		box [0] = 2;
		
		for (prime = 3; prime > counter; prime++){
			
			for (number = counter; number > -1; number--){
				
				if (prime % box [number] == 0)
					number = -1;
			
			}
			
			if ( number == -1 ){
				
				counter++;
				box [counter] = prime;
			}
				
			if (box [(input - 1)] > 0)
				counter = prime + 2;
		
			
		}
		
		number = input - 1;
		
		System.out.println("The " + input + "th prime number is " + box [number]);
	}

}//class