public class Queue<T> {
	private int N; // Number of elements in queue
	private Node<T> head;
	private Node<T> tail;

	public Queue() {
		N = 0;
		head = null;
		tail = null;
	}

	public boolean isEmpty() {return N == 0;}

	public int size() {return N;}

	public void enqueue(T val) {
		if (this.isEmpty()) {
			head = new Node(val);
			tail = head;
		}

		else {
			tail.next = new Node(val);
			tail = tail.next;
		}

		N++;
	}

	public T dequeue() {
		T val = head.val;

		head = head.next;
		return val;
	}
}