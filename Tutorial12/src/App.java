class Peoples {
	
	// Instance variables (data or "state")
	String name;
	int age;

	// Classes can contain
	
	// 1. Data
	// 2. Subroutines (methods) 
}


public class App {

	public static void main(String[] args) {

		Peoples people1 = new Peoples();
		
		people1.name = "Bob Frank";
		people1.age = 27;
		
		Peoples people2  = new Peoples();
		
		people2.name = "Gavin Smuts";
		people2.age = 24;
		
		System.out.println(people2.age);
	}

}
