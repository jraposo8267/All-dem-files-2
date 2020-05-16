//Jorge Alberto
//Jorge Alberto
import java.io.*;
import java.util.Random;
import java.util.Scanner;

class RaposoJLab4 {
	
	public static Scanner in = new Scanner (System.in);
	
	public static void main (String args[]) {
		int typed = 1; 
		
		System.out.println("Welcome to my lab4");
		
		while (typed != 0) {
		System.out.println();
		System.out.println("which program would you like to run?");
		System.out.println();
		System.out.println("1: Sequential Number calculator");
		System.out.println("2: Class Average calculator");
		System.out.println("3: Reciprocal Sum calculator");
		System.out.println("4: GCD and LCM calculator");
		System.out.println("5: Square Root calculator");
		System.out.println("0: Quit");
		
		typed = in.nextInt();
		
		if (typed == 1) {
			Loop();
		}
		
		else if (typed == 2) {
			Grading();
		}
		
		else if (typed == 3) {
			Reciprocal();
		}
		
		else if (typed == 4) {
			GCD();
		}
		
		else if (typed == 5) {
			Hero();
		}
		}
		
	
	}//main
	
	public static int getMeanInt() {
		int retval = 0;
		boolean goodint = false;

	while (!goodint) {
		if (in.hasNextInt()) {
			retval = in.nextInt();
			goodint = true;
		} else {
			System.out.println(" BrUh that wasn't an integer. Please enter an integer this time");
			}
		}
		
		return retval;
		
	}// getMeanInt
	
	
	public static void Loop (){
		int sum = 0, counter = 1, imput;
		
		System.out.println();
		System.out.println("Welcome to my sequential number calculator, please enter a whole number");
		
		imput = getMeanInt();

		while (counter < imput) {
			
			System.out.print(counter + " + ");
			
			sum = sum + counter;
			counter++;			
		}
		
		sum = sum + imput;
		
		System.out.println(+ imput + " = " + sum);
			
	}//loop
	
	public static void Grading (){
		int  A = 0, B = 0, C = 0, D = 0, F = 0, grade, average, total = 0, denom = 0;
	
		System.out.println("welcome to my class average calculator");
		System.out.println();
		System.out.println("please enter a grade");
		
		
		if (in.hasNextInt()) {
			grade = getMeanInt();
			
			while (grade > -1) {
				System.out.println("please enter another value, or enter -1 to find the average");
				
				if (grade < 0) {
				} 
				
				else if (grade < 60)
					F++;
				
				else if (grade < 70)
					D++;
				
				else if (grade < 80)
					C++;
				
				else if (grade < 90)
					B++;
				
				else if (grade <= 100)
					A++;
				
				denom++;
				total = total + grade;
				grade = getMeanInt();
				
			}
			
		} else {
			System.out.println("that was not an interger, please enter an interger");
		}
		
		average = total / denom;
		
		System.out.println("your class' grade average is " + average);
		System.out.println(+ A + " student(s) got an A");
		System.out.println(+ B + " student(s) got a B ");
		System.out.println(+ C + " student(s) got a C ");
		System.out.println(+ D + " student(s) got a D ");
		System.out.println(+ F + " student(s) got an F ");
		
	}//grading1
	
	
	public static void Reciprocal () {
		String answer;  
		int n = 0,  d = 1, LCM = 0, GCD = 0, min = 0, max = 0, n1 = 1, d1, counter = 1, max2 = 0;
		double sum = 0, n2, d2;
		
		System.out.println("Welcome to my reciprical sum calculator !");
		System.out.println();
		
		while (counter <= 10) {
			System.out.println("please enter a number and I'll find the reciprical, or enter 0 to finish");
			
			d1 = getMeanInt();
			
			if (d1 != 0) {
				max = (d1 > d) ? d1 : d;
				min = (d1 < d) ? d1 : d;
				LCM = 0;
				max2 = max;
                				
				while (max != LCM) {
					if (max % min == 0){
						LCM = max;
					}
				
					else {
						max = max + max2;
					}
				}
				
				n = ((LCM / d) * n) + ((LCM / d1) * n1);
				d = LCM;
				counter++;
			} else {
				System.out.println("would you like to stop adding? (yes or no)");
				
				answer = in.next();
				
				if (answer.equals("yes")){
					counter = 11;
				} else {
				
				}
			}
			
		}
		
		max = (n > d) ? n : d;
		min = (n < d) ? n : d;
		counter = max;
		
		while (counter != GCD) {
			if (min % counter == 0 && max % counter == 0){
					GCD = counter;
				}
				
			else {
				counter--;
			}
		}
		
		n = n / GCD;
		d = d / GCD;
		d2 = d;
		n2 = n;
		sum = (n2 / d2);
		
		System.out.println();
		System.out.println("The sum of your reciprocals is " + sum + ", or " + n + "/" + d);	
				
			
	}
	
	public static void GCD (){
		int max, min, a, b, counter, GCD = 0, LCM = 0;
		
		System.out.println("welcome to my GCD and LCM calculator");
		System.out.println();
		System.out.println("please enter 2 integers");
		
		a = getMeanInt();
		b = getMeanInt();
		
		max = (a > b) ? a : b;
		min = (a < b) ? a : b;
		counter = max;
		
		while (counter != GCD) {
			if (min % counter == 0 && max % counter == 0){
					GCD = counter;
				}
				
			else {
				counter--;
			}
		}
		
		LCM = ( min * max ) / GCD;
		
		System.out.println("The GCD of " + min + " and " + max + " is " + GCD);
		System.out.println("The LCM of " + min + " and " + max + " is " + LCM);
	}
	
	public static void Hero (){
		double sqrt = 0, number, guess = 2;
		int counter = 0, digits = 0, iterations, input, guessdigits = 1;
		
		System.out.println("Welcome to my square root calculator");
		System.out.println();
		System.out.println("Please enter a number");
		
		input = getMeanInt();
		number = input;
		
		System.out.println();
		System.out.println("Please enter a the amount of iterations");
		
		iterations = in.nextInt();
		if (iterations < 0) {
			iterations = -1 * iterations;
		}
		
		System.out.println();

		while (number >= 1){
			number = number / 10;
			digits++;
		}
		
		digits = (digits % 2 == 0) ? digits : digits + 1;
		
		while (guessdigits != (digits / 2)){
			guessdigits++;
			guess = guess * 10;
		}
		
		while (counter != iterations){
			guess = (guess + (input / guess)) / 2;
			counter++;
			sqrt = guess;
			System.out.println(sqrt);
			System.out.println();
		}
		
		System.out.println();
		System.out.println("the square root of " + input + " is " + sqrt);
		
	}



		
		
	

}// RaposoJLab4
		
		
		
	
		
		