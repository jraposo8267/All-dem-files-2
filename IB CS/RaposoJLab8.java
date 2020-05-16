
import java.util.Scanner;
import java.io.*;

class student {
	
	int studentnumber;
	int grade;
	String lastname;
	String firstname;
	String gender;
	
	
	student(int studentnumber, int grade, String lastname, String firstname, String gender) {
		this.studentnumber = studentnumber;
		this.grade         = grade;
		this.lastname      = lastname;
		this.firstname     = firstname;
		this.gender        = gender;	
	}//constructor for student
	
}//class student

public class RaposoJLab8 {
	public static void main (String args[]) throws IOException {
		int j = 0, inttemp = 0, grade = 0, alphabet, idd = 0, i = 0, lastname = 0, firstname = 0, gender = 2, everything[] = new int [32], numofstudents = 0;
				
		Scanner in = new Scanner(new File("classlist.txt"));
		 
		while (in.hasNext()) {
				 
			idd = in.nextInt();
			grade = in.nextInt();
		 
			everything[(grade - 9)]++; // array cells # 0,1,2,3 are the years of HS
					 
			lastname = in.next().charAt(0);
		 
			everything[(lastname - 61)]++; //array cells 3-29 represent the letters of the alphabet
		 
			firstname = in.next().charAt(0);
			gender = in.next().charAt(0);
		
			if (gender == 70)
				everything[30]++; //array cell for female
			else everything[31]++; // array cell for male
		 
				numofstudents++;
		}//fills up one array with all the information needed

		System.out.println("# students: " + numofstudents);
		 
		System.out.println("Freshman: " + everything[0]);
		System.out.println("Sophomores: " + everything[1]);
		System.out.println("Juniors: " + everything[2]);
		System.out.println("Seniors: " + everything[3]);
		 
		for (alphabet = 65; alphabet < 91; alphabet++)
			System.out.print((char)alphabet + ": " + everything[(alphabet - 61)] + "	");
		 
		System.out.println("Females: " + everything[30] + "	Males: " + everything[31]);
		 
		String temp;
			 
		Scanner sc = new Scanner(new File("classlist.txt"));

		student array[] = new student [numofstudents];
			  
		for (i=0; i < numofstudents; i++) {
				 
			int id = sc.nextInt();
			System.out.print(id + " ");
			int studentgrade = sc.nextInt();
			System.out.print(studentgrade + " ");
			String last = sc.next();
			System.out.print(last + " ");
			String first = sc.next();
			System.out.print(first +" ");
			String studentgender = sc.next();
			System.out.println(studentgender);
		 
		array[i] = new student(id, studentgrade, last, first, studentgender);
		}
		 
		for (i = 0; i < numofstudents; i++){ 
			for (j = i + 1; j < numofstudents; j++){
					 
				if (array[i].studentnumber > array[j].studentnumber){
					inttemp = array[i].studentnumber;
					array[i].studentnumber = array[j].studentnumber;
					array[j].studentnumber = inttemp;
				}
			}
		}// bubblesorting by student id
			 
		try (FileWriter fw = new FileWriter("C:\\Users\\Jorge Alberto\\IB CS\\myclasslist.txt")) {
						
				for (i=0; i< numofstudents; i++) {
							 
					fw.write(Integer.toString(array[i].studentnumber));
					fw.write(" ");
					fw.write(Integer.toString(array[i].grade));
					fw.write(" ");
					fw.write(array[i].lastname);
					fw.write(" ");
					fw.write(array[i].firstname);
					fw.write(" ");
					fw.write(array[i].gender);
					fw.write(" \n");
				}
					   
			 } catch (IOException exc) {
				 System.out.println("Write error.");
				 return;
			 }//file 1
		 
		for (i = 0; i < numofstudents; i++){
				 
			for (j = i + 1; j < numofstudents; j++){
					 
				if ((array[i].lastname).compareTo(array[j].lastname) > 0){
					temp = array[i].lastname;
					array[i].lastname = array[j].lastname;
					array[j].lastname = temp;
				}
			}
		}// bubblesorting by last name
			 
		try (FileWriter fw = new FileWriter("C:\\Users\\Jorge Alberto\\IB CS\\myclasslist2.txt")) {
						
				for (i= 0; i< array.length; i++) {
							 
					fw.write(Integer.toString(array[i].studentnumber));
					fw.write(" ");
					fw.write(Integer.toString(array[i].grade));
					fw.write(" ");
					fw.write(array[i].lastname);
					fw.write(" ");
					fw.write(array[i].firstname);
					fw.write(" ");
					fw.write(array[i].gender);
					fw.write(" \n");
				}
					   
			 } catch (IOException exc) {
				 System.out.println("Write error.");
				 return;
			 }// file 2
			}//main
			 
		 
		}//class