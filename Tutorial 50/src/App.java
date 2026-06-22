import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {

	private int id;
	private String name;

	public Person(int id, String name) {
		this.id = id;
		this.name = name;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return id + ": " + name;

	}
}

class StringLengthComparator implements java.util.Comparator<String> {

	public int compare(String s1, String s2) {

		int len1 = s1.length();
		int len2 = s2.length();

		if (len1 < len2)
			return 1;
		else if (len1 > len2) {
			return -1;
		}

		return 0;

	}
}

class ReverseAlphabeticalComparator implements java.util.Comparator<String> {

	public int compare(String s1, String s2) {

		return s2.compareTo(s1);

	}
}

public class App {

	public static void main(String[] args) {

		//////////////////// Sorting Strings ////////////////////////
		List<String> animals = new ArrayList<String>();

		animals.add("Ferret");
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Lion");
		animals.add("Hyena");
		animals.add("Mongoose");

		// sorting in natural order
		// Collections.sort(animals, new StringLengthComparator());
		Collections.sort(animals, new ReverseAlphabeticalComparator());

		for (String animal : animals) {
			System.out.println(animal);
			System.out.println("");
		}

		//////////////////// Sorting Numbers ////////////////////////
		List<Integer> numbers = new ArrayList<Integer>();

		numbers.add(8);
		numbers.add(73);
		numbers.add(20);
		numbers.add(45);
		numbers.add(36);
		numbers.add(17);

		// sorting in natural order
		Collections.sort(numbers, new Comparator<Integer>() {

			@Override
			public int compare(Integer num1, Integer num2) {

				return -num1.compareTo(num2);

			}

		});

		for (Integer number : numbers) {
			System.out.println(number);
			System.out.println("");
		}

		//////////////////// Sorting Arbitary Objects ////////////////////////

		List<Person> people = new ArrayList<Person>();

		people.add(new Person(1, "Ricky"));
		people.add(new Person(2, "Rachael"));
		people.add(new Person(4, "Hannah"));
		people.add(new Person(3, "Rhys"));

		Collections.sort(people, new Comparator<Person>() {

			public int compare(Person p1, Person p2) {

				if (p1.getId() < p2.getId()) {
					return -1;
				} else if (p1.getId() > p2.getId()) {
					return 1;
				}

				return 0;

			}

		});

		for (Person person : people) {
			System.out.println(person);
			System.out.println("");
		}

	}
}
