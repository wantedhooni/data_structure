package queue.circleArray;

/**
 * 선형 큐 배열의 공간 제약을 보완하기 위한 원형 큐
 * front, rear를 구할 때, ((front |rear) + 1) % MAX_QUEUE_SIZE 이용하여 삽입과 삭제가 순환되도록 함
 */
public class CircleArrayQueue {
	private Object arr[];
	private int MAX_QUEUE_SIZE;
	private int front = 0;
	private int rear = 0;

	CircleArrayQueue(int size) {
		this.MAX_QUEUE_SIZE = size + 1;
		this.arr = new Object[this.MAX_QUEUE_SIZE];
	}

	public void enqueue(Object v) {
		if ((rear + 1) % MAX_QUEUE_SIZE == front) {
			throw new ArrayIndexOutOfBoundsException();
		}

		rear = (rear + 1) % MAX_QUEUE_SIZE;
		arr[rear] = v;
	}

	public Object dequeue() {
		if (empty()) {
			throw new ArrayIndexOutOfBoundsException();
		}

		front = (front + 1) % MAX_QUEUE_SIZE;
		Object value = arr[front];
		arr[front] = null;

		return value;
	}

	public boolean empty() {
		return front == rear;
	}
}
