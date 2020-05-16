import java.io.*;
import java.util.Random;
import java.util.Scanner;
 
 class Odd {
 
	public static void main (String args[]){
		int number, m;
		Scanner in= new Scanner (System.in);
	 
		System.out.println ("I'll figure out if the number you chose is even or odd");
		System.out.println ();
		System.out.println ("Please enter a whole number");
	 
		number = in.nextInt ();
		m = number%2;
	 
	 if (m == 0) 
		 System.out.println ("your number is even");
	  else 
		 System.out.println ("your number is odd");
		 
	 
    }//main
	
}//odd
     