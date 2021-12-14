package com.bridgelabz.exceptionhandling;

import java.util.List;

public class MoodAnalyzerProblem {

	public int findLengthOfMyName(String name) {
		if(name == null) {
			return 0;
		}
		return name.length();
	}
	
	public int getSizeOfArray(List<Integer> arrayList) {
		
		if(arrayList == null) {
			return 0;
		}
		
		return arrayList.size();
	}
	
	public int getValueAtPosition(List<Integer> arrayList, int position) {
		int result = 0;
		try {
			result = arrayList.get(position);
		}catch(NullPointerException | ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println("I am happy");
		return result;
	}
	
	/*
	 * public void writeFile() { File file = new File("filename.txt");
	 * 
	 * PrintWriter printWriter; try { printWriter = new PrintWriter(file);
	 * printWriter.write("sdfl"); } catch (FileNotFoundException e) {
	 * e.printStackTrace(); } }
	 */
}
