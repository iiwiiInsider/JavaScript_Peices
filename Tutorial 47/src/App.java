import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {

	public static void main(String[] args) {

		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

		// Same as HashMap but has linked list connecting entries & maintains insertion
		// order of keys (as displayed in code).
		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		
		// Same as HashMap but maintains natural order of keys (Sorted Ascending).
		TreeMap<Integer, String> TreeMap = new TreeMap<Integer, String>();

		testMap(TreeMap);
		
	}

	public static void testMap(Map<Integer, String> map) {
		map.put(8, "Buffalo");
		map.put(19, "Elephant");
		map.put(16, "Lion");
		map.put(21, "Wildebeast");
		map.put(9, "Jackel");

		for (Integer key : map.keySet()) {
			String value = map.get(key);

			System.out.println(key + " : " + value);
		}
	}
}
