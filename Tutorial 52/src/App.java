import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class App {

	public static void main(String[] args) {

		// (Head) <- oooooooooooooooooooooooooooooooooo <- (Tail) FIFO (First in, First
		// Out)

		Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(3);

		// Throws NoSuchElementException -- no items in queue yet.
		// System.out.println("Queue is full. Too many items/elements were added to the
		// queue.");

		q1.add(10);
		q1.add(20);
		q1.add(30);

		System.out.println("Head of Queue is: " + q1.element());

		try {

			q1.add(40);

		} catch (IllegalStateException e) {

			System.out.println("Queue is full. Too many items/elements were added to the queue.");

		}

		for (Integer value : q1) {
			System.out.println("First Queue value: " + value);

		}

		System.out.println("Removed from queue: " + q1.remove());
		System.out.println("Removed from queue: " + q1.remove());
		System.out.println("Removed from queue: " + q1.remove());

		try {

			System.out.println("Removed from queue: " + q1.remove());

		} catch (NoSuchElementException e) {

			System.out.println("Queue is empty. No more items/elements to remove from the queue.");

		}

		///////////////////////////////////////////////////////////////////////////////

		Queue<Integer> q2 = new ArrayBlockingQueue<Integer>(2);

		q2.offer(10);
		q2.offer(20);
		q2.offer(30);

		System.out.println("Head of Queue is: " + q2.peek());

		if (q2.offer(30) == false) {
			System.out.println("Offer failed to add third item/element to the queue. Queue is full.");
		}

		for (Integer value : q2) {
			System.out.println("Second Queue Value: " + value);

		}

		System.out.println("Queue 2 first Integer removed: " + q2.poll());
		System.out.println("Queue 2 first Integer removed: " + q2.poll());
		System.out.println("Queue 2 first Integer removed: " + q2.poll());

	}
}
