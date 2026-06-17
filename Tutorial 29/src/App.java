import java.util.ArrayList;

class Machine {

    @Override
    public String toString() {
        return "I am a machine.";
    }

    public void start() {
        System.out.println("Machine started.");
    }
}

class Camera extends Machine {

    @Override
    public String toString() {
        return "I am a camera.";
    }

    public void Recorded() {
        System.out.println("Recording taken.");
    }
}

public class App {

    public static void main(String[] args) {

        ArrayList<Machine> list1 = new ArrayList<Machine>();
        list1.add(new Machine());

        ArrayList<Camera> list2 = new ArrayList<Camera>();
        list2.add(new Camera());

        showList(list2);  // Cameras
        showList(list1);  // Machines
    }

    public static void showList(ArrayList<? extends Machine> list) {
        for (Machine value : list) {
            System.out.println(value);

            if (value instanceof Camera) {
                ((Camera) value).Recorded();
            } else {
                value.start();
            }
        }
    }
}
