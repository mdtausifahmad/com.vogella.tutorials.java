package com.vogella.java.streams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
	public Person(String firstName, String lastName) {
		this.lastName = lastName ;
		this.firstName = firstName;
	}
	private String firstName;
	private String lastName;
	private List<Pet> pets = new ArrayList<>();

	public Person addPet(PetType cat, String name, int age) {
		pets.add(new Pet(cat,name, age ));
		return this;
	}

	public boolean hasPet(PetType petType) {
		return pets.stream().anyMatch(p-> p.getType().equals(petType));
	}

	public boolean isNamed(String string) {
		return (firstName + " " + lastName).equals(string);
	}

	public List<Pet> getPets() {
		return pets;
	}

	public Collection<PetType> getPetTypes() {
		return pets.stream().map(pet-> pet.getType()).collect(Collectors.toSet());
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	
	
	
}
