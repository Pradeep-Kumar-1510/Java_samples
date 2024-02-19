package demo;

import java.util.*;

public class Priorityqueue {

	public static void main(String[] args) {
		
		PriorityQueue<String> priorityqueue = new PriorityQueue<String>();
		priorityqueue.add("Ram");
		priorityqueue.add("Tom");
		priorityqueue.add("Ram");
		priorityqueue.add("Sam");
		
		System.out.println(priorityqueue.isEmpty());
		System.out.println();
		System.out.println(priorityqueue);
		
		priorityqueue.removeAll(priorityqueue);
		
		System.out.println(priorityqueue);
		
		

	}

}
