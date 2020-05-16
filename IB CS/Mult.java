import java.io.*;
import java.util.Random;
import java.util.Scanner;
 
class Mult {
 
	public static void main (String args[]){
		double firstnumber, m, secondnumber;
		Scanner in= new Scanner (System.in);
	 
		System.out.println ("Welcome to my multiple calculator");
		System.out.println ();
		System.out.println ("I'll figure out if your first number is a multiple of your second number");
		System.out.println ();
		System.out.println ("please enter your first number");
	 
		firstnumber = in.nextDouble();
		
		System.out.println ("please enter your second number");
		
		secondnumber = in.nextDouble();
		
		m = firstnumber % secondnumber;
	 
	 if (m == 0) {
		 System.out.println ("yes " + firstnumber + " IS a multiple of " + secondnumber);
	 } else {
		 System.out.println ("no " + firstnumber + " is NOT a multiple of " + secondnumber);
		}
	 
    }//main
	
}//odd
     