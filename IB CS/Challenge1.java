import java.util.Scanner;

class Challenge1 {

	public static void main (String args []) {
		int number, first, second, fourth,third, fifth;
		Scanner in= new Scanner (System.in);
	
		System.out.println("Hello, please enter a 5 digit whole number");
		
		number = in.nextInt();
		
		first = number % 10;
		second = (number / 10) % 10;
		third = (number / 100) % 10;
		fourth = (number / 1000) % 10;
		fifth = (number / 10000) % 10;
		
		System.out.println(+ fifth + " " + fourth + " " + third + " " + second + " " + first);
		
	}//main

}//Challenge	