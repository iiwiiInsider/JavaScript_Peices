class Peoples {

	// Instance variables (data or "state")
	String name;
	int age;

	// Classes can contain

	// 1. Data
	// 2. Subroutines (methods)
	void speak() {
		for (int i=0; i<3; i++) {
			System.out.println("My name is: " + name + "and I am " + age + " years old.");
		}
	}
	
	void sayHello() {
		System.out.println("Hello there!");
	}
}

public class App {

	public static void main(String[] args) {

		Peoples people1 = new Peoples();

		people1.name = "Bob Frank";
		people1.age = 27;
		people1.speak();
		people1.sayHello();
		
		Peoples people2 = new Peoples();

		people2.name = "Gavin Smuts";
		people2.age = 24;
		people2.speak();

		System.out.println(people2.age);
	}

}
