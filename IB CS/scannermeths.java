import java.io.*;
import java.util.Scanner;



class scannermeths {
 public static void main(String args[]) {
  int id;
  int grade;
  String lastname;
  String firstname;
  String gender;
  Scanner in;
  
  
  try {
       in = new Scanner(new File ("classlist.txt"));
 
	  //in.useDelimiter("\t");
	  
	  id = Integer.parseInt(in.next());
	  System.out.println(id);
	  grade = Integer.parseInt(in.next());
	  System.out.println(grade);
	  lastname = in.next();
	  System.out.println(lastname);
	  firstname = in.next();
	  System.out.println(firstname);
	  gender = in.next();
	  System.out.println(gender);
	  
    } 
   catch (IOException excep) {
	   System.out.println("Can't find file");
   }
 
 } //main
 }//num  
