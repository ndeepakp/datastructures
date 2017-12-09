package com.learningds.modules.stack;

import java.util.NoSuchElementException;
import java.util.Stack;

public class StackImplementingLinkedList<T> extends Stack<T> {

	private int length;
	private Node first;

	private class Node<T> {
		private T ele;
		private Node next;
	}

	public StackImplementingLinkedList() {

	}

	public StackImplementingLinkedList<T> pushes(T ele) {
		Node next = first;
		first = new Node();
		first.ele = ele;
		first.next = next;
		length++;
		return this;
	}

	public T pop() {
		if (first == null) {
			throw new NoSuchElementException("Seems, the stack is empty.");
		}
		T ele = (T) first.ele;
		first = first.next;
		length--;
		return ele;
	}

	public int size() {
		return length;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Node temp = first;
		while (temp != null) {
			sb.append(temp.ele).append(",");
			temp = temp.next;
		}
		return sb.toString();
	}

	public void reverse() {
		Node current, previous, temp;
		current = previous = first;
		current = current.next;
		previous.next = null;

		while (current != null) {
			temp = current.next;
			current.next = previous;
			previous = current;
			current = temp;
		}

		first = previous;
	}

	public static void main(String... ar) {
        StackImplementingLinkedList<String> greeting = new StackImplementingLinkedList<>();

        greeting.pushes("!").pushes("World").pushes("Hello, ");
        System.out.println(greeting);
        greeting.reverse();
        //System.out.println(">>" + greeting.pop().toString());
        System.out.println("--" + greeting);
    }
}
