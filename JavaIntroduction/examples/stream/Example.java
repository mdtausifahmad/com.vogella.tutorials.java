package com.vogella.java.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Example {
	// examples based on
	// https://www.eclipsecon.org/europe2015/sites/default/files/slides/2015-11-05%20EclipseCon-%20EclipseCollectionsByExample_0.pdf
	private List<Person> people;

	public static void main(String[] args) {
		List<Person> persons = createData();

		// do any of the persons have a cat?
		boolean result = persons.stream().anyMatch(person -> person.hasPet(PetType.CAT));
		// how many people have cats?

		long catCount = persons.stream().filter(person -> person.hasPet(PetType.CAT)).count();
		System.out.println(catCount);

		// who has a cat?
		List<Person> peopleWithCats = persons.stream().filter(person -> person.hasPet(PetType.CAT))
				.collect(Collectors.toList());
		// who does not have a cat
		List<Person> peopleWithoutCats = persons.stream().filter(person -> !person.hasPet(PetType.CAT))
				.collect(Collectors.toList());

		// partition people with/without cats
		Map<Boolean, List<Person>> catsAndNoCats = persons.stream()
				.collect(Collectors.partitioningBy(person -> person.hasPet(PetType.CAT)));

		// get the name of Tims cats
		Person person = persons.stream().filter(each -> each.isNamed("Tim Taller")).findFirst().get();
		boolean test = ("Dolly & Spot")
				.equals(person.getPets().stream().map(Pet::getName).collect(Collectors.joining(" & ")));
		System.out.println("Tim has Dolly & Spot as cats " + test);

		// get the set of all pet types
		Set<PetType> allPetTypes = persons.stream().flatMap(p -> p.getPetTypes().stream()).collect(Collectors.toSet());
		System.out.println(allPetTypes);
		// group people by their last name

		Map<String, List<Person>> byLastName = persons.stream().collect(Collectors.groupingBy(Person::getLastName));
		Map<String, List<Person>> byLastNameTargetBag = persons.stream()
				.collect(Collectors.groupingBy(Person::getLastName));
		System.out.println(byLastName);

		// get the age statistics of pets
		List<Integer> agesList = persons.stream().flatMap(p -> p.getPets().stream()).map(Pet::getAge)
				.collect(Collectors.toList());
		IntSummaryStatistics stats = agesList.stream().collect(Collectors.summarizingInt(i -> i));
		System.out.println("Min " + stats.getMin() + " Max " + stats.getMax() + " Average " + stats.getAverage());

		// counts by pet age
		Map<Integer, Long> counts = Collections.unmodifiableMap(persons.stream().flatMap(p -> p.getPets().stream())
				.collect(Collectors.groupingBy(Pet::getAge, Collectors.counting())));
	}

	private static List<Person> createData() {

		return Arrays.asList(
				new Person("Mary", "Smith").addPet(PetType.CAT, "Tabby", 2),
				new Person("Tim", "Taller").addPet(PetType.CAT, "Dolly", 3).addPet(PetType.DOG, "Spot", 2),
				new Person("Ted", "Smith").addPet(PetType.DOG, "Spike", 4),
				new Person("Jake", "Snake").addPet(PetType.DOG, "Serpy", 1),
				new Person("Lars", "Vogel").addPet(PetType.BIRD, "Twirly", 1),
				new Person("Harry", "Hamster").addPet(PetType.HAMSTER, "Fuzzy", 1).addPet(PetType.HAMSTER, "Wuzzy", 1)
				);
	}

}
