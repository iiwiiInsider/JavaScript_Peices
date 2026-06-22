import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class App {

	public static String[] vehicles = { "Ambulance", "Helicopter", "Lifeboat", };

	public static String[][] drivers = { { "Fred", "Asha", "Peter" }, { "Bob", "Sienna", "Matthew", "Bob" },
			{ "Frank", "Kyle", "Daniel" }

	};

	public static void main(String[] args) {

		Map<String, Set<String>> personnel = new HashMap<String, Set<String>>();

		for (int i = 0; i < vehicles.length; i++) {
			String vehicle = vehicles[i];
			String[] driversList = drivers[i];

			Set<String> driversSet = new LinkedHashSet<String>();

			for (String driver : driversList) {
				driversSet.add(driver);
			}

			personnel.put(vehicle, driversSet);
		}
		{ // Brackets just to scope driverList Variable so can be reused in the next loop
			// Example usage
			Set<String> driverList = personnel.get("Helicopter");

			for (String driver : driverList) {
				System.out.println(driver);

			}
		}
		// iterate through all

		for (String vehicle : personnel.keySet()) {

			System.out.print(vehicle);
			System.out.print(": ");
			Set<String> driversList = personnel.get(vehicle);

			for (String driver : driversList) {
				System.out.print(driver);
				System.out.print(" ");

			}
			
			System.out.println();
			
		}
	}
}
