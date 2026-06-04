class Frog {
    private int id;
    private String name;

    // Proper constructor
    public Frog(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Correct toString() method
    @Override
    public String toString() {
        return id + ": " + name;
    }

    public int getId() {
        return id;
    }
}

public class App {
    public static void main(String[] args) {
        Frog frog1 = new Frog(1, "Jack");
        System.out.println(frog1);
    }
}
