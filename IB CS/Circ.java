import java.util.Scanner;

class Circ {

public static void main(String args[]){
 double firstnumber, circumference, area;
 
 Scanner in= new Scanner(System.in);
 
 System.out.println("Welcome to my number adding machine");
 System.out.println("Please the radius of your circle");
 
 firstnumber = in.nextDouble ();
 circumference=  2 * Math.PI * firstnumber;
 area= Math.PI * firstnumber * firstnumber;
 
 System.out.println("The circumference of your circle is " + circumference);
 System.out.println("The area of your circle is " + area);


}//main
}//circ