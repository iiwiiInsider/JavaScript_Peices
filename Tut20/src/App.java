
public class App {

	public static void main(String[] args) {

		// Innefficient way to create a string
		String info = "";

		info += "My name is John Doe.\n";
		info += "I am a software developer.\n";
		info += "I enjoy coding and learning new technologies.\n";

		System.out.println(info);

		// More efficient.
		StringBuilder sb = new StringBuilder("");

		sb.append("My name is Kyle Blackburn.\n");
		sb.append("I am a cybersecurity anaylyst\n");
		sb.append("I enjoy securing web processes.\n");

		System.out.println(sb.toString());

		StringBuilder s = new StringBuilder();

		s.append("The Roger network works.\n").append("The Roger network is a secure network.\n")
				.append("The Roger network is a fast network.\n");

		System.out.println(s.toString());

		///// Formatting ///////////

		System.out.println(String.format("My name is %s and I am %d years old.", "John Doe", 30));

		System.out.println(String.format("The value of pi is approximately %.2f", Math.PI));

		System.out.println(String.format(""));

		for (int i = 1; i <= 5; i++) {
			System.out.println(String.format("Number: %d", i));
			System.out.println(String.format("Hexadecimal: %x", i));
			System.out.println(String.format("Binary: %s", Integer.toBinaryString(i)));
			System.out.println(String.format("Octal: %o", i));
			System.out.println(String.format("Floating-point: %.2f", (double) i));
			System.out.println(String.format(""));
		}
	}

}
