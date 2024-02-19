package demo;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlists {

	public static void main(String[] args) {
		LinkedList<Integer> linkedlist = new LinkedList<Integer>();
		linkedlist.add(null);
		linkedlist.add(22);
		linkedlist.add(55);
		linkedlist.add(22);
		linkedlist.add(86);
		linkedlist.add(46);
		System.out.println(linkedlist);

		linkedlist.remove(5);
		linkedlist.removeFirst();

		System.out.println(linkedlist);

		LinkedList<Integer> newlist = new LinkedList<Integer>();
		newlist.addAll(linkedlist);
		System.out.println(newlist);
		newlist.addFirst(33);
		newlist.addLast(5);
		System.out.println(newlist);
		System.out.println(newlist.peek());
		System.out.println(newlist.poll());
		System.out.println();
		
		Iterator<Integer> iterator = newlist.iterator();
		while(iterator.hasNext()) {
			Integer i = iterator.next();
			System.out.println(i);
			
		}

	}

}
