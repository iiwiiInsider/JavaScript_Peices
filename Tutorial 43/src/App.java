
public class App {

	public static void main(String[] args) {

		App app = new App();

		
		//show method must have added unique identifier next to method due to same int method used in the same class.
		
		int LeftMouseClick = 01;
		app.show11(LeftMouseClick);

		int RightMouseClick = 00;
		app.show1(RightMouseClick);

		int MouseScroll = 02;
		app.show(MouseScroll);

	}

	public void show11(int LeftMouseClick) {
		System.out.println("Value: " + LeftMouseClick);

	}

	public void show1(int RightMouseClick) {
		System.out.println("Value: " + RightMouseClick);

	}

	public void show(int MouseScroll) {
		System.out.println("Value: " + MouseScroll);

	}
}