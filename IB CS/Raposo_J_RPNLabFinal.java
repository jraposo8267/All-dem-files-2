import java.util.*;

import java.io.*;

enum StackToken {naem, value, operator};


class StackItem{
	private String name; 
	private double val; 
	StackToken stackelementtype;
	
	StackItem(String p_id_string) {
		
		name = p_id_string;
		stackelementtype = StackToken.naem;
	}//StackItem(String p_id_string)

	StackItem(double p_id_val) {
		
		val = p_id_val;
		stackelementtype = StackToken.value;
	}//StackItem(double p_id_val)

	public String getstringval() {
		
		return name;
	}//getstringval

	public double getdoubleval(){

		return val;
	}//getdoubleval

	public String toString() {

		String tempname;

		if (stackelementtype == StackToken.naem) {
			tempname = name;
		} else tempname = "" + val;
		return tempname;
	}//toString
}//StackItem


class Stack {

	private StackItem ar_stack [];
	private StackItem retval;
	private int tos = -1;
	private int temp2;
	private int stacksize;


	Stack(int numitems){

		ar_stack = new StackItem [numitems];
		stacksize = numitems;
	}//Stack

	public void Push(StackItem item) {

		if (tos < stacksize){

			tos++;
			ar_stack[tos] = item;
		} 
		
		else System.out.println("Sorry, no more space in the stack");
	}//Push()

	public StackItem Pop() {

		if (tos < 0){

			System.out.println("Sorry no pop, stack is empty");
			retval = null;
		}

		else {

			retval = ar_stack[tos];
			tos--;
		}
		return retval;
	}//Pop()

	public void Dumpstack() {

		for (temp2 = 0; temp2 <= tos; temp2++)
			System.out.print(ar_stack[temp2] + " ");
	}//Dumpstack

	public void Printtos() {
		System.out.println(ar_stack[tos]);
		System.out.println();
	}//Printtos

	public void Clearstack(){
		tos = -1;
	}//Clearstack
}//Stack

class Symbol {

	public String symbtxt;
	public double symbval;

	
	public String getSymbtxt() {
		return symbtxt;
	}

	public double getSymbval() {
		return symbval;
	}

	public void setSymbval(double symbval) {
		this.symbval = symbval;
	}

	Symbol(String name){
		this.symbtxt = name;
		this.symbval = 0;
	}
}//Symbol


class SymbolTable{

	public Symbol Table [];
	public Symbol temp;
	public int tracker = 0;
	public int i;
	public int numofsymbles;

	SymbolTable(int numitems){

		Table = new Symbol [numitems];
		numofsymbles = numitems;
	}//SymbolTable

	public Symbol whatsInTable(String id) {

		for (i = 0; i < tracker; i++){

			if ((Table[i].symbtxt).equals(id)){
				temp = Table[i];
				i = tracker;
			}
			
			else {
				temp = null;
			}
		}
		return temp;
	}//isItInTable

	public void insertInSymbletable(String id_string){
		
		Table[tracker] = new Symbol(id_string);
		tracker++;
	}//insertInSymbletable

	public void DumpTable() {

		for (i = 0; i < tracker; i++)
			System.out.println(Table[i].symbtxt + " = " + Table[i].symbval);
	}//DumpTable
}//SymbolTable


class Raposo_J_RPNLabFinal {

	public static void processInput() throws IOException {
		int loop = 1;
		char token;
		String intoken;
		String Symbolname;
		Double temp;
		Double sum = 1.0;

		Stack mystack = new Stack(100);
		SymbolTable myTable = new SymbolTable(100);

		Scanner in = new Scanner(System.in);

		System.out.println("Type 'Z' to exit program");
		System.out.println(" 'P' to view stack");
		System.out.println(" 'C' to clear stack");
		System.out.println(" 'D' to view Symbol Table");
		System.out.println(" '^x' for exponents where x is exponent (INTERGER)");
		System.out.println(" '%' for modulo");

		
		while (loop == 1) {

			if (in.hasNextDouble())
				mystack.Push(new StackItem(in.nextDouble()) );
			
			else{ 

				intoken = in.next();

				if (intoken.length() == 1){

					token = intoken.charAt(0);

					//temp1 = getultimatevalue( Stack.Pop() );
					//temp2 = getultimatevalue( Stack.Pop() ); not using temps because program would break whenever doing a not arithmetic process (P,Z,C)

		
					switch (token) {

						case '+': mystack.Push(new StackItem(getultimatevalue( mystack.Pop(), myTable ) + getultimatevalue( mystack.Pop(), myTable ))); mystack.Printtos();
							break;

						case '-': mystack.Push(new StackItem(-(getultimatevalue( mystack.Pop(), myTable) ) + getultimatevalue( mystack.Pop(), myTable ))); mystack.Printtos();
							break;

						case '*': mystack.Push(new StackItem(getultimatevalue( mystack.Pop(), myTable ) * getultimatevalue( mystack.Pop(), myTable ))); mystack.Printtos();
							break;

						case '/': mystack.Push(new StackItem( (1 / getultimatevalue( mystack.Pop(), myTable )) * getultimatevalue( mystack.Pop(), myTable )) ); mystack.Printtos();
							break;

						case '=':
							temp = getultimatevalue( mystack.Pop(), myTable );
							Symbolname = (mystack.Pop()).toString();
							myTable.whatsInTable( Symbolname ).symbval = temp;
							System.out.println(Symbolname + " = " + temp);
							break;
						
						case '%':
							temp = getultimatevalue( mystack.Pop(), myTable );

							mystack.Push(new StackItem( getultimatevalue( mystack.Pop(), myTable ) % temp ));
							mystack.Printtos();
							break;

						case 'P': mystack.Dumpstack();
							break;

						case 'Z': loop++;
							break;

						case 'C': mystack.Clearstack();
							break;

						case 'D': myTable.DumpTable();
							break;

					} //switch
				}//if
					
				else {

					if (intoken.charAt(0) == '^'){

						temp = getultimatevalue( mystack.Pop(), myTable );

						for (loop = 0; loop < (int) (intoken.charAt(1)) - 48; loop++)
							sum = sum * temp;
						
						mystack.Push(new StackItem(sum));
						mystack.Printtos();
					}

					else if (myTable.whatsInTable(intoken) == null) {
						myTable.insertInSymbletable(intoken);
						mystack.Push(new StackItem(intoken));

					}else mystack.Push(new StackItem(myTable.whatsInTable(intoken).symbval));

					loop = 1;
				}//else
			} //else
		}// while loop

		System.out.println();
		System.out.println("Over and out.");
	} // processInput


	public static double getultimatevalue(StackItem item, SymbolTable myTable){
		double retval;
		Symbol tempSymbol;

		if (item.stackelementtype == StackToken.value)
			retval = item.getdoubleval();

		else {
			tempSymbol = myTable.whatsInTable(item.getstringval());
			retval = tempSymbol.getSymbval();
		}
		return retval;
	}//getultimatevalue

	public static void main(String args[]) throws IOException {

		processInput();
	} // main

} // RPNcalculator