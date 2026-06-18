class Temp implements AutoCloseable {

	public void close() throws Exception {
		System.out.println("Closing!");
		throw new Exception("Oh no!");
	}
	

}
public class App {

	public static void main(String[] args) {

		try(Temp temp = new Temp()) {
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
