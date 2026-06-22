import java.util.Iterator;
import java.util.LinkedList;

public class App {

	public static void main(String[] args) {

		LinkedList<String> animals = new LinkedList<String>();

		animals.add("Dog");
		animals.add("Cat");
		animals.add("Horse");
		animals.add("Cow");

		Iterator<String> it = animals.iterator();

		while (it.hasNext()) {

			String value = it.next();
			System.out.println(value);
			System.out.println(" ");

			if (value.equals("Cat")) {
				it.remove();
			}

			// Modern iteration method, Java 5 and later

			for (String animal : animals) {

				System.out.println(animal);
			}
		}
	}
}
