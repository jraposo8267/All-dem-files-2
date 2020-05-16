import java.io.*;
import java.util.Scanner;

class RaposoJLab7 {
	
	public static Scanner in = new Scanner (System.in);
	
	public static void main (String args[]){
		int typed = 1; 
		
		System.out.println("Welcome to my Lab 7");
		System.out.println();
		System.out.println("which program would you like to run?");
		
		while (typed != 0){
			System.out.println();
			System.out.println("1: The 10000th prime");
			System.out.println("2: List of primes");
			System.out.println("3: Prime factors");
			System.out.println("0: Quit");
			
			typed = getMeanInt();
			
			switch (typed){
			case 1: Anyprime();
				break;
			
			case 2: List();
				break;
			
			case 3: Primefactors();
				break;
				
			}
		}
	}//main
	
	
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
	
	
	public static void fillprimearray(int [] box){
		int number = 0, prime = 0, counter = 0;
		
		box[0] = 2;
		
		for (prime = 3; prime > counter; prime = prime + 2){
			
			for (number = counter; number > -1; number--){
				
				if (prime % box[number] == 0)
					number = -1;
			
			}
			
			if ( number == -1 ){
				
				counter++;
				box[counter] = prime;
			}
				
			if (box[9999] > 0)
				counter = prime + 2;
	
		}
	}//fillprimearray
	
	
	public static void Anyprime (){
		int number = 0, input = 0, box[] = new int [10000];
		
		System.out.println("which prime number would you like? ");
		
		input = getMeanInt();
		number = input - 1;
		
		fillprimearray(box);
		
		System.out.println("The " + input + "th prime number is " + box[number]);
	
	}//Anyprime

	
	public static void List (){
		int i = 0, number1 = 0, number2 = 0, max = 0, min = 0, box[] = new int [10000];
		
		System.out.println();
		System.out.println("Please enter 2 numbers and I will show you all the primes in between");
		
		number1 = getMeanInt();
		number2 = getMeanInt();
		max = (number1 > number2) ? number1 : number2;
		min = (number1 > number2) ? number2 : number1;
		
		fillprimearray(box);
		
		while (box[i] <= min)
			i++;
		
		while (box[i] < max){
			System.out.print(box [i] + " ");
			i++;
		}
		
		System.out.println();
		
	}//Lists
	
	
	public static void Primefactors(){
		int input = 0, factor = 0, i = 0, box [] = new int [10000];
		
		System.out.println("please enter a number and I will give you its prime factors");
		System.out.println();
		
		input = getMeanInt();
		fillprimearray(box);
		
		System.out.println();
		System.out.print("The prime factors of " + input + " are: ");
	
			
			for (input = input; input > 1; i++){
			
			while (input % box[i] == 0){
				
				System.out.print(box[i] + " ");
				input = input/box[i];
			}
			}
		
	}//primefactors
		
}//class
	
	