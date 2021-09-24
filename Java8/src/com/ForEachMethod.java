package com;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ForEachMethod {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		/*
		 * for(int i = 0; i <= list.size(); i++) { System.out.println(i); }
		 */
		
		/*
		 * for(int i : list) { System.out.println(i); }
		 */
		
		/*
		 * Iterator<Integer> it = list.iterator(); while(it.hasNext()) {
		 * System.out.println(it.next()); }
		 */
		
		/*
		 * Iterator<Integer> lit = list.listIterator(); while(lit.hasNext()) {
		 * System.out.println(lit.next()); }
		 */
		
		list.forEach(i -> System.out.println(i));
		

	}

}
