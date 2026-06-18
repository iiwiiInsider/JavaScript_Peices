class Machine {
	public void start() {
		System.out.println("Machine starting...");
	}
}

interface Plant {
	public void grow();
}
	
public class App {

	public static void main(String[] args) {

		Machine machine1 = new Machine() {
			public void start() {
				System.out.println("Camera is on and recording...");
			}
		};
		
		machine1.start();
		
		Plant plant1 = new Plant() {
			public void grow() {
				System.out.println("Title of recording: Plant growing at 10x Speed.");
			}
		};	
		
		plant1.grow();
	}

}
