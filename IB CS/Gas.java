import java.util.Scanner;

class Gas {

public static void main(String args[]){
 double start, end, startfuel, endfuel, mpg;
 

 Scanner in= new Scanner(System.in);
 
 System.out.println("Welcome to my miles per gallon calculator");
 System.out.println("Please enter your initial  and final odometer readings (in miles), and initial and final gas readings (in gallons");
 
 start = in.nextDouble ();
 end = in.nextDouble ();
 startfuel = in.nextDouble ();
 endfuel = in.nextDouble ();
 
 mpg= (end-start)/(startfuel-endfuel);
 
 System.out.println("The milage per gallon of your car is " + mpg);
 

}//main
}//gas