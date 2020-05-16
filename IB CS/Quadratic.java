import java.io.*;
import java.util.Random;
import java.util.Scanner;

class main {

	public static void Quad (){
		double dimagin, a, a1, b, b1, c, d, root1, root2;
		Scanner in= new Scanner (System.in);
		
		System.out.println ("Welcome to my Quadratic formula calculator");
		System.out.println("Please enter your a-value");
		
		a = in.nextDouble();
		a1 = a * 2;
		
		System.out.println ("Please enter your b-value");
		
		b = in.nextDouble ();
		b1 = b * -1;
		
		System.out.println("please enter your c-value");
		
		c = in.nextDouble ();
		d = ((b * b) - 4 * a * c);
		dimagin = -((b * b) - 4 * a * c);
		
		root1 = (-b + Math.sqrt(d))/( 2 * a);
		root2 = (-b - Math.sqrt(d))/( 2 * a);
		
		
		if (d > 0) 
			System.out.println("the roots of your quadratic equation are " + root1 + " and " + root2 );
		
		else if (d == 0) 
			System.out.println("the root of your quadratic equation is " + root1);
		
		else 
			System.out.println("the imaginary roots of your quadratic equation are (" + b1 + " +/- the square root of " + dimagin + "i)/" + a1);
		
	}
	
}
		
		
		
	
		
		