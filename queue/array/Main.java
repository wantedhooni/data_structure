package queue.array;

public class Main {
	public static void main(String[] args) {
		ArrayQueue arrayQueue = new ArrayQueue(5);
		arrayQueue.enqueue(1000);
		arrayQueue.enqueue(2000);
		arrayQueue.enqueue(5000);
		arrayQueue.enqueue(5001);
		arrayQueue.enqueue(5002);

		System.out.println(arrayQueue.isFull());
		System.out.println(arrayQueue.dequeue());
		System.out.println(arrayQueue.dequeue());
//		System.out.println(arrayQueue.dequeue());

	}
}
