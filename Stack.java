import java.util.Iterator;

public class Stack<T> {
	private int N; // size of the stack
	private Node<T> head;

	public Stack() {
		N = 0;
		head = null;
	}

	public void push(T val) {
		head = new Node<T>(val, head);
		N++;
	}

	public T pop(){
		T val = head.val;

		head = head.next;
		N--;

		return val;
	}

	public int size() {
		return N;
	}

	public boolean isEmpty() {
		return N == 0;
	}
}