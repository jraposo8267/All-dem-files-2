import java.util.Scanner;

class Final {

public static void main(String args[]){
 double total, finalg, percent;
 

 Scanner in= new Scanner(System.in);
 
 System.out.println("You just took a final");
 System.out.println("");
 System.out.println("Please enter the total amount of points avalible in the final");
 
 total = in.nextDouble ();
 System.out.println("Please enter your score");
 finalg = in.nextDouble ();

 percent= (finalg/total)*100;

 System.out.println ("your grade is " + percent + "%");
 
  if (percent < 60) {
     System.out.println ("That's an F. You failed LOL");
  } else  if ( percent < 70) {
	 System.out.println ("You got a D. Bad job");
 
  } else  if (percent < 80) {
	 System.out.println ("You got a C. Almost there. You get an award for participation. most room for improvement");
  }
    else if (percent < 90) {
	 System.out.println ("Yay, a B. I'm sure your parents are pround, unless... you're not asian are you?");
 }
    else if (percent <= 100) {
	 System.out.println ("An A. WOW, so proud. Good job");
	}
 
 

}//main
}//gas