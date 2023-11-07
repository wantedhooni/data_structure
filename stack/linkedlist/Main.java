package stack.linkedlist;

public class Main {
	public static void main(String[] args) {
		LinkedListStack stack = new LinkedListStack();
		stack.push("1");
		stack.push("2");
		stack.push("3");

		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.empty());
	}
}
