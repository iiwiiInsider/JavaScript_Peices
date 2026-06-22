import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<Integer>();

		// Adding items to the ArrayList
		numbers.add(10);
		numbers.add(100);
		numbers.add(40);

		// Retrieving items from the ArrayList
		System.out.println(numbers.get(0));

		System.out.println("Iteration #1: ");
		// Indexed for loop iteration
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}

		// Removing items from the ArrayList
		numbers.remove(numbers.size() - 1);

		// This is very slow
		numbers.remove(0);

		System.out.println("Iteration #2: ");
		for (Integer value : numbers) {
			System.out.println(value);
			
		//List interface ...
			
		List<String> values = new ArrayList<String>();

		}
	}
}
