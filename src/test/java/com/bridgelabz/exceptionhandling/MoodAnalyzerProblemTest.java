package com.bridgelabz.exceptionhandling;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class MoodAnalyzerProblemTest {

	MoodAnalyzerProblem problem;
	
	@Before
	public void setUp() {
		problem = new MoodAnalyzerProblem();
	}
	
	@Test
	public void test1() {
		assertEquals(7, problem.findLengthOfMyName(null));
	}
	
	@Test
	public void test2() {
		List<Integer> arrayList =  Arrays.asList(1,2,3,4,5,7);
		assertEquals(7, problem.getSizeOfArray(arrayList));
	}
	
	@Test
	public void test3() {
		List<Integer> arrayList =  Arrays.asList(1,2,3,4,5,7);
		assertEquals(4, problem.getValueAtPosition(arrayList,8));
	}
}
