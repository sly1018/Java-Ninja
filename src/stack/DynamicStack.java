package stack;

public class DynamicStack {
	private int stackSize;
	private int[] stackArray;
	private int top;

	// constructor
	public DynamicStack(int size) {
		this.stackSize = size;
		this.stackArray = new int[stackSize];
		this.top = -1;
	}

	public void push(int entry) {
		if (this.isStackFull()) {
			System.out.println("Stack is full. Increasing the capacity");
			this.increaseStackCapacity();
		}
		System.out.println("Adding " + entry);
		this.stackArray[++top] = entry;
	}

	// remove from the top of the stack
	public int pop() throws Exception {
		if (this.isStackEmpty()) {
			throw new Exception("Stack is empty, can not remove element");
		}
		int entry = this.stackArray[top--];
		System.out.println("Remove entry " + entry);
		return entry;
	}

	private boolean isStackEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	public long peek() {
		return stackArray[top];
	}

	private void increaseStackCapacity() {
		int[] newStack = new int[this.stackSize * 2];
		for (int i = 0; i < stackSize; i++) {
			newStack[i] = this.stackArray[i];
		}
		this.stackArray = newStack;
		this.stackSize = this.stackSize * 2;
	}

	public boolean isStackFull() {
		return (top == stackSize - 1);
	}

	// main
	public static void main(String[] args) {
		DynamicStack stack = new DynamicStack(2);
		// loops
		for (int i = 1; i < 10; i++) {
			stack.push(i);
		}
		for (int i = 1; i < 4; i++) {
			try {
				stack.pop();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
