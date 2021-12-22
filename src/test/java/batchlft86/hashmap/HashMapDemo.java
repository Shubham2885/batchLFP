package batchlft86.hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class HashMapDemo {

	public static void main(String[] args) {
		
		int x[] = {6,3,8,4,6,8,9,12,32,14,52,16,71};
		
		String splitedString[] = "To be or not to be".split(" ");
		
		Map<String, Integer> map2 = new HashMap<String, Integer>();
		
		for(int i =0;i<splitedString.length;i++) {
			map2.put(splitedString[i].toLowerCase(),0);
		}
		
		System.out.println(map2);
		
		Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
		
		for(int i=0;i<5; i++) {
			map.put(i, new ArrayList<Integer>());
		}
		
		for(int i=0;i<x.length;i++) {
			int key = getKey(x[i]);
			putValue(map, key, x[i]);
		}
		
		for(int i=0;i<5; i++) {
			List<Integer> integers = map.get(i);
			System.out.print(i+"==>");
			integers.forEach(data->System.out.print(data+"->"));
			System.out.println();
		}
		
		List<String> list = new ArrayList<String>(Arrays.asList(splitedString));
		System.out.println(list);
		System.out.println(list.stream().distinct().collect(Collectors.toList()));
//		for(String str : list) {
//			list.
//			//
//			
//			//
//			
//			//
//		}
		
	}
	
	public static int getKey(int input) {
		return input%5;
	}
	
	public static void putValue(Map map, int key, int value) {
		List<Integer> list = (List<Integer>) map.get(key);
		list.add(value);
	}
}
