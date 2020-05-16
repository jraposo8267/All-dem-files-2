import java.util.Scanner;

class Num {

public static void main(String args[]){
 double firstnumber, secondnumber, sum, difference, product, quotient;
 

 
 Scanner in= new Scanner(System.in);
 
 System.out.println("Welcome to my number adding machine");
 System.out.println("Please enter a number");
 
 firstnumber = in.nextDouble ();
 secondnumber = in.nextDouble ();
 
 sum=firstnumber+secondnumber;
 difference=firstnumber-secondnumber;
 product=firstnumber*secondnumber;
 quotient= firstnumber/secondnumber;
 
 System.out.println("The sum of " + firstnumber +" and " + secondnumber + " is " + sum);
 System.out.println("The difference of " + firstnumber +" and " + secondnumber + " is " + difference);
System.out.println("The product of " + firstnumber +" and " + secondnumber + " is " + product);
System.out.println("The quotient of " + firstnumber +" and " + secondnumber + " is " + quotient);

}//main
}//num