package com.learningds.modules.stack.ac;

import java.util.ArrayList;

public class StackExample {

	public static <T> void reverseStack(StackEx<T> stack) {
		// This method can use only the methods of the StackEx class
	}
	
	public static void main(String[] args) {
		StackEx<Integer> stack = new StackEx();
		stack.push(5);
		reverseStack(stack);
	}		
}

class StackEx<T> {
	
	private ArrayList<T> stack;
	
	public StackEx() {
		stack = new ArrayList<>();
	}
	
	public void push(T element) {
		
	}
	
	public T pop() {
		return null;
	}
	
	public boolean isEmpty() {
		return false;
	}
	
	public T top() {
		return null;
	}
	
}