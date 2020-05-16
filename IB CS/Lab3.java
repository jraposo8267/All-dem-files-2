import java.util.Scanner;

class Lab3 {
	
	public static void main (String args[]) {
		int typed;
		Scanner in = new Scanner (System.in);
		
		System.out.println("Welcome to my pythag and Quadratic calculator");
		System.out.println();
		System.out.println("please enter 1 for pythag calculator and 2 for quadratic calculator");
		
		typed = in.nextInt();
		
		if (typed == 1)
			Pythag();
		
		else if (typed == 2)
			Quad();
		
	}// main
	
	public static void Quad (){
		double imagine, dimagin, a, b, c, d, root1, root2;
		Scanner in = new Scanner (System.in);
		
		System.out.println ("Welcome to my Quadratic formula calculator");
		System.out.println("Please enter your a-value");
		
		a = in.nextDouble();
		
		System.out.println ("Please enter your b-value");
		
		b = in.nextDouble ();
		
		System.out.println("please enter your c-value");
		
		c = in.nextDouble ();
		d = ((b * b) - 4 * a * c);
		dimagin = (Math.sqrt(-((b * b) - 4 * a * c))) / (2 * a);
		imagine = (-1 *  b) / (2 * a);
		
		root1 = (-b + Math.sqrt(d))/( 2 * a);
		root2 = (-b - Math.sqrt(d))/( 2 * a);
		
		if (d > 0) 
			System.out.println("the roots of your quadratic equation are " + root1 + " and " + root2 );
		
		else if (d == 0) 
			System.out.println("the root of your quadratic equation is " + root1);
		
		else 
			System.out.println("the imaginary roots of your quadratic equation are " + imagine + " +/- " + dimagin + "i" );
			
	}//quad
	
	public static void Pythag (){
		double anglea, angleb, a, b, c;
		Scanner in = new Scanner (System.in);
		
		System.out.println("welcome to my Pythagrean theorem calculator");
		System.out.println();
		System.out.println("please enter your unknown value as a negative");
		System.out.println();
		
		System.out.println ("please enter your a value");
		
		a = in.nextDouble ();
		
		System.out.println ("please enter your b value");
		
		b = in.nextDouble ();
		
		System.out.println("please enter hypotenuse, or c");
		
		c = in.nextDouble ();
		
		if (a < 0) {
			a = Math.sqrt((c * c) - (b * b));
			System.out.println("your unknown value is " + a);
			
		
		}	else if (b < 0) {
				b = Math.sqrt((c * c) - (a * a));
				System.out.println("your unknown value is " + b);
				
		}	else if (c < 0) {
				c = Math.sqrt((b * b) + (a * a));
				System.out.println("your unknown value is " + c);
		}
			
		anglea = (180 /Math.PI) * (Math.asin(a / c));
		angleb = 90 - anglea;
		
		System.out.println("Your unknown angles are " + anglea + "and " + angleb);
		
	}//pythag
	
	
	
}// lab3
		
		
		
	
		
		