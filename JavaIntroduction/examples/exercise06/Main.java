package com.vogella.javastarter.exercises1;

public class Main {
	public static void main(String[] args) {
		Person p1 = new Person("Jim", "Knopf" , 12 );
		System.out.println(p1);

		// reuse the same variable and assign a new object to it
		Person p2 = new Person("Henry", "Ford", 104);
		System.out.println(p2);
	}
}