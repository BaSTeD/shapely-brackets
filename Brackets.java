import java.io.*;
import java.util.*;

public class Brackets {
	boolean validString = false;
	Scanner input = new Scanner(System.in);
	Stack myStack = new Stack();
	String bracket; 
	
	
	public void proof(){
		System.out.println("Please enter a bracket-combination: ");
		bracket = input.next();
		String[] s1 = bracket.split("");
		
		for(int i = 0; i<s1.length; i++){
			if((s1.length%2)!=0){
				validString = false;
				break;
			}
			
			if(s1[i].equals("{")||s1[i].equals("[")||s1[i].equals("(")){
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
	
	private void isValid(){
		if(validString == true){
			System.out.println("Valid String");
		}else{
			System.out.println("Invalid String");
		}
	}
	
	
	public static void main(String[] args) {
		Brackets b1 = new Brackets();
		b1.proof();
		
		
	}
}