import java.util.HashMap;
import java.util.Map;

public class App {

	public static void main(String[] args) {

		
		// Hashmap can introduce bugs as it sometimes does not keep order.
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "One");
		map.put(2, "Two");
		map.put(9, "Nine");
		map.put(8, "Eight");
		map.put(7, "Seven");
		map.put(3, "Three");
		map.put(4, "Four");

		map.put(6, "hello your part of the top 1%.");

		String text = map.get(6);

		System.out.println(text);
		
		for (Map.Entry<Integer, String> entry: map.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println(key + " : " + value);
		}
	}
}
