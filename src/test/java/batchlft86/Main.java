package batchlft86;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> strings = new ArrayList<String>();
		
		strings.add("sdf1");
		strings.add("sdf2");
		strings.add("sdf3");
		strings.add("sdf4");
		strings.add("sdf5");
		strings.add("sdf6");
		strings.add("sdf7");
		strings.add("sdf8");
		strings.add("sdf8");
		
		System.out.println(strings);
		
		Set<String> strings2 = new HashSet<String>();
		
		strings2.add("sdf1");
		strings2.add("sdf2");
		strings2.add("sdf3");
		strings2.add("sdf4");
		strings2.add("sdf5");
		strings2.add("sdf6");
		strings2.add("sdf7");
		strings2.add("sdf8");
		strings2.add("sdf8");
		
		System.out.println();
		System.out.println(strings2);
		
		Queue<String> strings3 = new PriorityQueue<String>();
		
	}

}
