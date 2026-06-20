
public enum Mammal {
	CAT("Winter"), DOG("Bobby"), MOUSE("Bobbert");

	private String name;

	Mammal(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		return "This mammal is named " + name;
	}

}
