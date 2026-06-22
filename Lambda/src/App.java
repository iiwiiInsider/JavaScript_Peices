//Functional Interface.

interface Executable {
	int execute();
}

class Runner {
	public void run(Executable e) {
		System.out.println("Executing code block...");
		int value = e.execute();
		System.out.println("Return value: " + value);
	}
}

public class App {
	public static void main(String[] args) {

		Runner runner = new Runner();
		runner.run(new Executable() {
			public int execute() {
				System.out.println("Hello from the anonymous class!");
				return 7;

			}
		});

		System.out.println("======================================");

		runner.run(() -> {

			System.out.println("This is code passsed in a lambda expression!");
			System.out.println("Hello from the lambda expression! Watch how 7 eats 9.");
			return 9;
		});

	}

}
