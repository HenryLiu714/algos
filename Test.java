public class Test {

	static void stackTests() {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(2);

		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}

	public static void main(String [] args) {
		stackTests();
	}
}