
public class App {


	public static void main(String[] args) {
		
		
		//E.g 4!(Factorial 4) = 4*3*2*1 = 24
		
		System.out.println("The Factorial of 4 is: " + calculate(4));
	}

	private static int calculate(int value) {
		
		System.out.println("The value is: " + value);
		
		if (value == 1) {
			
		return 1;
		
		}
		
			return calculate(value -1) * value;

		}
		
	}
	
