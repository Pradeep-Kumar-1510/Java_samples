package demo;

import java.util.*;

public class Arraydeque {

	public static void main(String[] args) {

		Deque<Integer> a = new ArrayDeque<>();

		a.add(223);
		a.add(11);
		a.add(24);
		System.out.println("Initial queue is :" + a);
		System.out.println();
		
		a.addLast(2);
		a.addFirst(34);
		System.out.println("Queue after adding 2 new elements :" + a);
		System.out.println();
		
		System.out.println("Element which is going to be removed is :" + a.poll());
		System.out.println();
		System.out.println(a);
		
		System.out.println("Performing removing of elements in first and last ");
		a.removeFirst();
		a.removeLast();
		System.out.println("Final Queue is :");
		
		Iterator<Integer> i = a.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());

		}

	}
}
