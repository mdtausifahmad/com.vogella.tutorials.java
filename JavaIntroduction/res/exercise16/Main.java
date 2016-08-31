package com.vogella.javastarter.exercises1;

public class Main {
	public static void main(String[] args) {
		// I create a person
		Person pers = new Person("Jim", "Knopf", 31);
		// set the age of the person to 32
		pers.setAge(32);

		// just for testing I write this to the console
		System.out.println(pers);
		/*
		 * actually System.out.println always calls toString, if you do not
		 * specify it so you could also have written System.out.println(pers);
		 */
		// create an address
		Address address = new Address();
		// set the values for the address
		address.setCity("Heidelberg");
		address.setCountry("Germany");
		address.setNumber("104");
		address.setPostalCode("69214");
		address.setStreet("Musterstr.");

		// assign the address to the person
		pers.setAddress(address);

		// dispose reference to address object
		address = null;

		// person is moving to the next house in the same street
		pers.getAddress().setNumber("105");

	}

}