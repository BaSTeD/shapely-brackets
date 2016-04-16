import java.io.*;
import java.util.*;

public class Brackets {
	
	boolean validString = false;
	Scanner input = new Scanner(System.in);
	Stack myStack = new Stack();
	String bracket; 
	
//This Method proofs the String	
	public void proof(){
		System.out.println("Please enter a bracket-combination: ");
		String[] s1 = (input.next()).split("");
		
		for(int i = 0; i<s1.length; i++){
			if((s1.length%2)!=0){
				validString = false;
				break;
			}else if(s1[i].equals("{")||s1[i].equals("[")||s1[i].equals("(")){
				myStack.push(s1[i]);
			}else{
				String help = myStack.pop() + s1[i];
				if(help.equals("[]")||help.equals("()")||help.equals("{}")){
					validString = true;
				}else{
					validString = false;
					break;
				}
			}
		}
		isValid();
	}

//Helping-method	
	private void isValid(){
		if(validString){
			System.out.println("Valid String");
		}else{
			System.out.println("Invalid String");
		}
	}
	
//Main-Method	
	public static void main(String[] args) {
		Brackets b1 = new Brackets();
		b1.proof();
		
		
	}
}
