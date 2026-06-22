import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {

	private static final int E5 = 0;

	public static void main(String[] args) {

		/*
		 * ArrayList manage arrays internally. [0][1][2][3][4][5][6] ....
		 */

		List<Integer> arraylist = new ArrayList<Integer>();

		/*
		 * LinkedList consists of elements where each element. has a reference to the
		 * previous and next element in the list.
		 * [0]->[1]->[2] ....
		 *    <-   <-
		 */

		List<Integer> linkedList = new LinkedList<Integer>();

		doTimings("ArrayList", arraylist);
		doTimings("LinkedList", linkedList);

	}

	private static void doTimings(String type, List<Integer> list) {

		for (int i = 0; i < E5; i++) {
			list.add(i);

		}

		Long start = System.currentTimeMillis();

		/*
		 * add items end of list
		 * 
		 * for(int i=0; i<E5; i++) { list.add(i);
		 */

		// add items elsewhere in the list

		for (int i = 0; i < E5; i++) {
			list.add(0, i);
		}

		Long end = System.currentTimeMillis();

		System.out.println("Time taken: " + (end - start) + " ms for " + type);

	}
}