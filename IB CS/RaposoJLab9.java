import java.util.Scanner;
import java.util.Random;
import java.io.IOException;

public class RaposoJLab9 {

	public static Scanner in = new Scanner(System.in);

	public static void main(String args[]) throws IOException {
		int typed = 1;

		System.out.println("Welcome to my Lab 9");
		System.out.println();
		System.out.println("which program would you like to run?");

		while (typed != 0) {
			System.out.println();
			System.out.println("1: From 7 to 70000");
			System.out.println("2: Multiplication Table");
			System.out.println("3: The nth Fibonacci number");
			System.out.println("4: Interest Calculator");
			System.out.println("5: Picture pattern");
			System.out.println("6: X and Diamond pictures");
			System.out.println("7: Finding Pi");

			System.out.println("0: Quit");

			typed = getMeanInt();

			switch (typed) {
				case 1:
					Loopsum();
					break;
				case 2:
					Multtable();
					break;
				case 3:
					Fibonacci();
					break;
				case 4:
					Stonks();
					break;
				case 5:
					Picturepattern();
					break;
				case 6:
					Diamond();
					break;
				case 7:
					Pi();
					break;
			}
		}
	}// main

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

	public static void Loopsum() throws IOException {
		long i = 0, sum = 0;

		for (i = 7; i < 70001; i++) {
			sum = sum + i;
		}

		System.out.println(sum);

	}// Loopsum

	public static void Multtable() throws IOException {
		int j = 0, i = 0, number1 = 0, number2 = 0, number = 0;

		System.out.println("Please enter 2 integers");

		number1 = getMeanInt();
		number2 = getMeanInt();

		for (i = 1; i <= number1; i++) {
			System.out.println();
			for (j = 1; j <= number2; j++) {
				number = i * j;
				System.out.print(number);
				
				if (number < 10)
					System.out.print("    ");
				
				else if (number < 100)
					System.out.print("   ");
				
				else if (number < 1000)
					System.out.print("  ");
				
				else if (number < 10000)
					System.out.print(" ");
			}
		}
	}/// Mult. Table

	public static void Fibonacci() throws IOException {
		int i = 0;

		System.out.println("Which Fibonacci number would you like ?");

		int fib[] = new int[getMeanInt() + 1];

		fib[0] = 1;
		fib[1] = 1;

		for (i = 2; i < fib.length; i++)
			fib[i] = fib[i - 1] + fib[i - 2];

		for (i = 0; i < (fib.length - 1); i++)
			System.out.print(fib[i] + "	");

	}// Fibonacci

	public static void Stonks() throws IOException {
		double initial = 0, rate = 0, total = 0;

		System.out.println();
		System.out.println("Welcome to my Stonks calculator");
		System.out.println("please enter the starting amount of money in your account");

		initial = in.nextDouble();

		System.out.println("Now enter the interest rate (in %)");

		rate = in.nextDouble();
		rate = (1 + (rate / 100));

		System.out.println("rate = " + rate);

		total = Math.pow(rate, 30);
		total = total * initial;

		System.out.println("The final amount of money in 30 years will be $" + (float) total);
	}// Interest rate calc

public static void Picturepattern() throws IOException{
	int height = 0, width = 0, i = 0, w = 0, h = 0;


	System.out.println("This is another picture pattern");
	System.out.println("Please enter a height");

	height = in.nextInt();

	System.out.println("Now enter a width");

	width = in.nextInt();
	
	System.out.println();

	for(h=0; h < height; h++){

		for(w = 0; w < width; w++)
			System.out.print("*");

		System.out.println();
		h++;
		
		if (h % 2 == 0 || h<height){
		
			for(i=0; i < width/2 ; i++){
				System.out.print("0*");
			}
			
			System.out.println();
		}
	
	}
}

public static void Diamond(){
	int height = 0, i = 0, j = 0, k = 0, space = 0, answer = 0;
	
	System.out.println("Please enter the hight of your shape (odd #)");
	
	height = getMeanInt();
	j = height;

	System.out.println("Would you like to draw an X (1) or Diamond (2)?");

	answer = getMeanInt();

	if (answer == 1){
		
		for(i=0; i < height-1; i = i+2){
			
			for(k=0; k < space; k++)
				System.out.print(" ");
			
			System.out.print("*");
			
			j = j - 2;
			for(k=0; k < j; k++)
				System.out.print(" ");
	
			System.out.println("*");
			space++;
		}

		for(k=0; k < space; k++)
			System.out.print(" ");

		System.out.println("*");
		space--;

		for(i=0; i < height-1; i = i+2){
			
			for(k=0; k < space; k++)
			System.out.print(" ");
			
			System.out.print("*");
			
			for(k=0; k < j; k++)
				System.out.print(" ");

			j = j + 2;
	
			System.out.println("*");
			space--;
		}
	}	else {

		space = height - 2;
		j = 1;

		for(k=0; k < space; k++)
			System.out.print(" ");

		System.out.println("*");

		for(i=0; i < height-1; i = i+2){
			
			space--;
			for(k=0; k < space; k++)
				System.out.print(" ");
			
			System.out.print("*");
			
			for(k=0; k < j; k++)
				System.out.print(" ");

			j = j + 2;
	
			System.out.println("*");
		}

		j = j - 2;

		for(i=0; i < height-3; i = i+2){
			
			space++;
			for(k=0; k < space; k++)
			System.out.print(" ");
			
			System.out.print("*");
			
			j = j - 2;
			for(k=0; k < j; k++)
				System.out.print(" ");
	
			System.out.println("*");
		}

		space++;
		for(k=0; k < space; k++)
			System.out.print(" ");

		System.out.print("*");
	}
}//Diamond

	public static void Pi() {
		Double dartx, darty, pi = 0.;
		long answer = 0, totalDartsInCircle = 0, i = 0;
		Random rand = new Random();

		System.out.println("How many darts would you like to throw?");
		answer = in.nextLong();

		for(i = 0; i < answer; i++){
			dartx = rand.nextDouble();
			darty = rand.nextDouble();

			if( (dartx * dartx) + (darty * darty) <= 1.0)
				totalDartsInCircle++;
		}

		pi = (((double) totalDartsInCircle/ (double) answer)*(4.));

		System.out.println(totalDartsInCircle + " darts made it to the circle. Pi is " + pi);
	}// Pi


}//class
