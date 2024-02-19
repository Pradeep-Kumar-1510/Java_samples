//Last in first out

package demo;

import java.util.*;

public class Stackexample {

	public static void main(String[] args) {

		Stack<String> books = new Stack<>();

		// push element from top of stack
		books.push("Harry Potter");
		books.push("Animal Farm");
		books.push("Fairy tale");
		books.push("The dino");
		books.push("Ecosysytem");
		books.push("The Universe");
		System.out.println(books);

		books.pop();
		System.out.println(books);

		System.out.println(books.peek());

		// search -returns the position of the element from the top of the stack
		// from top it calculates the position
		System.out.println(books.search("The dino"));

		System.out.println(books.empty());

	}

}
