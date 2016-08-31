package com.vogella.javastarter.exercises1;


class Person {
	String firstName;
	String lastName;
	int age;

	public Person(String a, String b, int value) {
		firstName = a;
		lastName = b;
		age=value;
	}
	
	@Override
	public String toString() {
		return firstName + " " + lastName;
	}

}
