
public class CarEngine extends Machine {

	public void start() {
		System.out.println("The pistons are Oscillating.");
			
	}

	@Override
	public void doStuff() {
		System.out.println("The 8 pistions hit the lowest vertical 50x in 1 second.");
	}

	@Override
	public void switchOff() {
		System.out.println("The pistions of the CarEngine have stopped.");
	}

}
