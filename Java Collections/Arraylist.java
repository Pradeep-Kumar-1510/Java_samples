package demo;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList<String> arrlist = new ArrayList<String>();
		arrlist.add("Raj");
		arrlist.add("");
		arrlist.add("Tom");
		arrlist.add("Tom");
		arrlist.add("Ram");
		arrlist.add("Sam");
		
		System.out.println(arrlist);
		
		for(String names : arrlist) {
			
			System.out.println(names);
		}
		
	Iterator<String> iterator = arrlist.iterator();
		while(iterator.hasNext()){
			String i = iterator.next();
			System.out.print(i+ " ");
			
		}

	}

}
