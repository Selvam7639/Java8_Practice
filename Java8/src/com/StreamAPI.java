package com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {

	public static void main(String[] args) 
	{
		List<Integer> list = Arrays.asList(1,2,3,2,1,2,3,4,2);
		
		list.forEach(i -> System.out.println(i));
		//anyMatch
		boolean isAnyMatch = list.stream().anyMatch(i -> i == 5);
		System.out.println(isAnyMatch);
		//allMatch
		boolean isAllMatch = list.stream().allMatch(i -> i == 1);
		System.out.println(isAllMatch);
		//builder
		Stream<Object> st = Stream.builder().add("Tamil").add("Selvam").build();
		st.forEach(System.out::println);
		//collect
		int sum = list.stream().collect(Collectors.summingInt(i -> i));
		System.out.println(sum);
		
		
		
		
		
		
	}

}
