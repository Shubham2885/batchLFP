package batchlft86.lambdaexpression;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

@FunctionalInterface
interface IMathFunction {
	int cal(int x, int y);
}

@FunctionalInterface
interface IDrawPaint {
	void draw();
}


interface IPIValue {
	double getPI();
}

interface Demo {
	void draw();
}

public class LambdaExpression {
	public static void main(String[] args) {
		
		IMathFunction add = (x, y) -> x + y;
		IMathFunction multiply = (x, y) -> x * y;
		
		System.out.println(add.cal(5, 10));
		System.out.println(multiply.cal(5, 10));
		
		//IDrawPaint  drawPaint = () -> System.out.println("I am painting..");
		
		IDrawPaint  drawPaint = () -> System.out.println("I am painting..");
		
		IPIValue pi = () -> 3.14;
		
		drawPaint.draw();
		
		System.out.println(pi.getPI());
		
		List<Integer> integers = new ArrayList<Integer>();
		for(int i=1;i<=10;i++) {
			integers.add(i*5);
		}
		
		//Method 2 using lambda ex.
		integers.forEach((x)->System.out.println(x));
		
		//Method 1 using iterator
		Iterator<Integer> iterator = integers.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		integers.forEach( new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.println("Consummer = "+t);
			}
		});
		
		Consumer<Integer> consumer = n -> System.out.println(n);
		integers.forEach(consumer);
		
		Function<Integer, Double> doubleValue = Integer::doubleValue;
		integers.forEach(n->{
			System.out.println("Double Values :: "+doubleValue.apply(n));
		});
		
		Predicate<Integer> isEven = n -> n%2 == 0;
		integers.forEach(n->{
			if(isEven.test(n)) {
				System.out.println("Even = "+n);
			}
		});
}
}