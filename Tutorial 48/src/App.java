import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {

	public static void main(String[] args) {

		// HashSet function does not retain any particular order.
		//
		// Set<String> set1 = new HashSet<String>();

		// LinkedHashset function do retain particular order.
		//
		// Set<String> set1 = new LinkedHashSet<String>();

		// TreeSet function does not retain any particular order but it sorts the items
		// in natural (Ascending/alphabetical/Numerically) order.
		//
		Set<String> set1 = new TreeSet<String>();

		// Wont output "Set is empty." because the set has items/elements in it and if
		// function is placed before the set1.add() functions.
		if (set1.isEmpty()) {
			System.out.println("Set is empty.");
		}

		set1.add("Hello");
		set1.add("You");
		set1.add("Sexy");
		set1.add("Valumtious");
		set1.add("Human");
		set1.add("And");
		set1.add("Welcome");
		set1.add("To");
		set1.add("The");
		set1.add("Himalayan");
		set1.add("Salt");
		set1.add("Caves");

		// Adding duplicate items does nothing.
		set1.add("Hello");

		// Wont output "Set is empty." because the set has items/elements in it and if
		// function is placed after the set1.add() functions.
		if (set1.isEmpty()) {
			System.out.println("Set is empty.");
		}

		System.out.println(set1);

		/////////// Iteration ////////////

		for (String element : set1) {
			System.out.println(element);

		}

		///////// Does set contain a particular item? //////////

		if (set1.contains("Salt")) {
			System.out.println("Set contains the word: Salt");
		}

		if (set1.contains("Gemstone")) {
			System.out.println("Set contains the word: Gemstone");

		}

		if (set1.contains("Himalayan")) {
			System.out.println("Set contains the word: Himalayan");
		}

		//////////// Set2 contains some common elements with set1 , and some new  ////////////

		Set<String> set2 = new TreeSet<String>();

		set2.add("Bye");
		set2.add("They");
		set2.add("Ugly");
		set2.add("Extravegant");
		set2.add("Beast");
		set2.add("And");
		set2.add("Welcome");
		set2.add("from");
		set2.add("The");
		set2.add("Gemstone");
		set2.add("River");
		set2.add("Bend");

		/////////// Intersection ////////////

		Set<String> intersection = new HashSet<String>(set1);

		intersection.retainAll(set2);
		
		System.out.println("Intersection of set1 and set2: " + intersection);
		
		/////////// Difference ////////////

		Set<String> Difference = new HashSet<String>(set1);
		
		Difference.removeAll(set2);
	
	}
}
