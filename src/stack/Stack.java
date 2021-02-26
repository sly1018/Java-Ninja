package stack;

import java.util.*;

public class Stack {

	// method
	static void showPush(Stack st, int a) {
		st.push(new Integer(a));
		System.out.println("Push(" + a + ")");
		System.out.println("Stack: " + st);
	}

	private void push(Integer integer) {
		// TODO Auto-generated method stub

	}

	static void showPop(Stack st) {
		System.out.println("Pop ->");
		Integer a = (Integer) st.pop();
		System.out.println("Stack" + st);
	}

	// main
	private Integer pop() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) {
		Stack st = new Stack();
		System.out.println("Stack: " + st);
		showPush(st, 12);
		showPush(st, 50);
		showPush(st, 60);
		// delete
		showPop(st);
		showPop(st);
		showPop(st);

		try {
			showPop(st);
		} catch (EmptyStackException e) {
			System.out.println("Empty Stack");
		}
	}
}
