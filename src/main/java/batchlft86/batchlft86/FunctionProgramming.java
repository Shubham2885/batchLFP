package batchlft86.batchlft86;

import java.time.LocalDate;

public class FunctionProgramming {

	static public String firstName = "Shubham";
	private String lastName;
	public static int id;
	
	public static void main(String[] args) {
		
		FunctionProgramming functionProgramming = new FunctionProgramming();
//		
//		functionProgramming.printWelcomeMessage();
//		functionProgramming.printWelcomeMessageWithName("Shubham");
		System.out.println(functionProgramming.findLengthOfString("Shubham"));
//		System.out.println(functionProgramming.getCurrentDay());
		
		printWelcomeMessage();
		printWelcomeMessageWithName("Shubham");
		
		for(int i=1;i<=5;i++) {
			System.out.print((1)+"/"+i+" + ");
		}
//		System.out.println(findLengthOfString("Shubham"));
		System.out.println();
		
		String date = getCurrentDay();
	}
	
	int findLengthOfString(String str){
		id = 6;
		this.firstName = str;
		return firstName.length();
	}
//	
//	void printWelcomeMessage() {
//		System.out.println("Welcome...");
//	}
//	
//	void printWelcomeMessageWithName(String str) {
//		System.out.println("Welcome... "+str);
//	}
//	
//	String getCurrentDay() {
//		return LocalDate.now().getDayOfWeek().toString();
//	}

//	static int findLengthOfString(String str){
//		firstName
//		return str.length();
//	}
	
	static void printWelcomeMessage() {
		id = 5;
		System.out.println("Welcome...");
	}
	
	static void printWelcomeMessageWithName(String str) {
		System.out.println("Welcome... "+str);
	}
	
	static String getCurrentDay() {
		return LocalDate.now().getDayOfWeek().toString();
	}
}
