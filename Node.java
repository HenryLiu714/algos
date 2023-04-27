public class Node<T> {
	public T val;
	public Node<T> next;

	public Node() {
		val = null;
		next = null;
	}

	public Node(T val) {
		this.val = val;
		next = null;
	}

	public Node(T val, Node<T> next) {
		this.val = val;
		this.next = next;
	}
}