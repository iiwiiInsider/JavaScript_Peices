
class Thing {

	public final static int LUCKY_NUMBER = 7;
	public String name;
	public static String description;

	public static int count = 0;

	public int id;

	public Thing() {

		id = count;

		count++;
	}

	public void showName() {
		System.out.println("Object ID:" + id + ", " + description + ": " + name);

	}

	public static void showInfo() {
		System.out.println(description);
		// wont work: sysout.println(name);
	}
}

public class App {

	public static void main(String[] args) {

		System.out.println("Befor creating objects, count is: " + Thing.count);

		Thing thing1 = new Thing();
		Thing thing2 = new Thing();

		thing1.name = "Bob";
		thing2.name = "Sue";

		System.out.println("After creating objects, count is: " + Thing.count);

		Thing.description = "I am a anchor";

		thing1.showName();
		thing2.showName();

		System.out.println((int) Math.PI);
		System.out.println(Thing.LUCKY_NUMBER);

	}

}
