
public class Keyboard extends Machine {

	public void start() {
		System.out.println("The Keys on the Keyboard Bouce Undulatey.");
	}

	@Override
	public void doStuff() {
		System.out.println("Key: H, has been pressed 10x");
	}

	@Override
	public void switchOff() {
		System.out.println("The Keyboards keys no longer bounce undulatey.");
	}

}
