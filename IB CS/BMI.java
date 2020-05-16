import java.util.Scanner;

class BMI {

public static void main(String args[]){
 double BMI, height, weight;
 

 Scanner in= new Scanner(System.in);
 
 System.out.println("Welcome to my  BMI calculator");
 System.out.println("");
 System.out.println("Please enter your weight in pounds");
 
 weight = in.nextDouble ();
 System.out.println("Please enter your height in inches");
 height = in.nextDouble ();

 BMI= (weight * 703)/(height * height);

 System.out.println ("your BMI is " +BMI);
 
  if (BMI < 18.5) {
      System.out.println ("you are underweight");
  } else  if ( BMI < 25) {
	 System.out.println ("your weight is normal");
 
  } else  if (BMI < 30) {
	 System.out.println ("you are overweight");
  }
    else if (BMI >= 30) {
	 System.out.println ("you are obese");
 }
 

}//main
}//gas