package Demo3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {

	public static void main(String[] args) {

		try {
			openFile();
		} catch (FileNotFoundException e) {
			
			//P.S This message is to vague (Better to explain why there is an error or bug.)
			System.out.println("Could not open file");
		}

	}

	public static void openFile() throws FileNotFoundException {

		File file = new File("test.txt");
		FileReader fr = new FileReader(file);

	}

}
