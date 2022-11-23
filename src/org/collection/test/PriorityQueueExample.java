package org.collection.test;

import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> queue=new  PriorityQueue<>();
		
		
		queue.add(123);
		queue.add(124);
		queue.add(125);
		queue.add(126);
		queue.add(127);
		queue.add(128);
		
		PriorityQueue<Integer> queue1=new  PriorityQueue<>();
		
		System.out.println(queue);
		//System.out.println(queue1.element());
		//System.out.println(queue1.peek());
		
		System.out.println(queue1.isEmpty());
		System.out.println(queue.offer(89));

		System.out.println(queue.poll());
		System.out.println(queue);
		
		queue.forEach(x-> System.out.println(x));

	}

}

