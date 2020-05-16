import java.util.*;

public class club {
	public static Scanner in = new Scanner(System.in);
	public static String target;
	public static Boolean completed = false;
	
	public static void getParams(){
		target = in.nextLine();
	}
		
		
	public static void main(String[]args) {
		getParams();
		initiGA();

	}

	public static void initiGA(){
		createGeneration();
		while(!completed){
			evaluate();
			createNewGeneration();
		}
		

	}

	public static void evaluate(){
		
	}
	
	public static void createGeneration(){;
	
	}

	public static void createNewGeneration(){;
	
	}
	
}

class Child {
	public String genome;
	private int length;
	public static Random rand = new Random();
	
	public Child (int length){
		this.length = length;
	}
	
	public Child(String genome){
		this.genome = genome;
		this.length = genome.length();
		
	}
	
	public void createGenome(){
		genome = new String();
		
		for(int i = 0; i < length; i++){
			genome += (char) rand.nextInt(94) + 32;
		}
		
		System.out.println("genome");
	}
	
}