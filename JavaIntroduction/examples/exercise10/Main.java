package com.vogella.javastarter.exercises1;

public class Main {
	public static void main(String[] args) {
		Person person = new Person("Jim", "Knopf", 21);
		Person p2 = new Person("Jill", "Sanders", 20);
		// Jill gets married to Jim
		// and takes his name
		p2.setLastName("Knopf");
		System.out.println(p2);
	}
}