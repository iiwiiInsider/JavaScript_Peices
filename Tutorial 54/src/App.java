
public class App {

	public static void main(String[] args) {

		UrlLibrary urlLibrary = new UrlLibrary();

		for (String html : urlLibrary) {

			System.out.println("the amount of characters in this html is: " + html.length());

			// Print out the actual HTML content of the page.
			// System.out.println(html);

		}
	}
}
