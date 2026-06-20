import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteObjects {

	public static void main(String[] args) {
		System.out.println("Writting objects to file.");

		Person[] people = { new Person(123, "Urclia"), new Person(543, "Mike"), new Person(00, "Han Solo") };

		ArrayList<Person> peopleList = new ArrayList<Person>(Arrays.asList(people));

		try (FileOutputStream fs = new FileOutputStream("test.ser")) {

			ObjectOutputStream os = new ObjectOutputStream(fs);

			os.writeObject(people);
			os.writeObject(peopleList);
			os.writeInt(peopleList.size());
			
			for(Person person: people) {
				System.out.println(person);
			}
			
			for(Person person: peopleList) {
				System.out.println(person);
			}
			
			os.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}