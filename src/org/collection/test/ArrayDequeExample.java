package org.collection.test;

import java.util.ArrayDeque;

public class ArrayDequeExample {

	public static void main(String[] args) {
		
		ArrayDeque<String> queue=new ArrayDeque<>();
		queue.add("A");
		queue.add("B");
		queue.add("C");
		queue.add("D");
		queue.add("E");
		queue.add("F");
		
		
		System.out.println(queue);
		
		queue.addFirst("X");
		queue.addLast("Y");
		
		System.out.println(queue);
		
		queue.forEach(z -> System.out.println(z));
		queue.removeFirst();
		queue.removeLast();
		System.out.println(queue);
		
		
	}

}

