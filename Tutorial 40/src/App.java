
public class App {

	public static final int DOG = 0;
	public static final int CAT = 1;
	public static final int MOUSE = 2;

	public static void main(String[] args) {

		Mammal mammal = Mammal.DOG;
		switch (mammal) {

		case CAT:
			System.out.println("Cat");
			break;
		case DOG:
			System.out.println("Dog");
			break;
		case MOUSE:
			System.out.println("Mouse");
			break;
		default:
			System.out.println(mammal);
			break;

		}

		System.out.println(Mammal.DOG);
		System.out.println("Enum name as a string: " + Mammal.DOG.name());

		System.out.println(Mammal.DOG.getClass());

		System.out.println(Mammal.DOG instanceof Enum);

		System.out.println(Mammal.MOUSE.getName());

		Mammal mammal2 = Mammal.valueOf("CAT");
		System.out.println(mammal2);
	}
}
