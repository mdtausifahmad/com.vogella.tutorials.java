package com.vogella.java.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class IntStreamExample {

	public static void main(String[] args) {
		// printout the numbers from 1 to 100
		IntStream.range(1, 101).forEach(s -> System.out.println(s));
		
		// create a list of integers for 1 to 100
		List<Integer> list = new ArrayList<>();
		IntStream.range(1, 101).forEach(it -> list.add(it));
		System.out.println("Size " + list.size());
	}

}
