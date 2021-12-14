package batchlft86.junittesting;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import junittesting.Calculator;

@RunWith(Parameterized.class)
public class CalculatorTest {

	@Parameters
    public static Collection<Integer[]> data() {
        return Arrays.asList(new Integer[][] {
                { 5, 2, 7 }, { 7, 2, 10 },{ 11, 2, 13 }
        });
    }
    
    private final Calculator calculator;
    private final int first;
    private final int second;
    private final int expectedSum;
 
    public CalculatorTest(int first, 
                                  int second, 
                                  int expectedSum) {
         
        this.calculator = new Calculator();
        this.first = first;
        this.second = second;
        this.expectedSum = expectedSum;
    }
 
    @Test
    public void shouldReturnCorrectSum() {
        int actualSum = calculator.sum(first, second);
        assertEquals(expectedSum, actualSum);
    }
    
    public static <T extends Comparable<T>> T findMax(ArrayList<T> array) {

		T max = array.get(0);
		for (T key : array) {
			if (key.compareTo(max) > 0)
				max = key;
		}
		return max;
	}
    
}
