package com.collabera.lists;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * The files in the above package concern Lists in Java.
 * 
 * Lists are an ordered sequence of elements which may contain duplicate
 * elements. Lists can be traversed either in a forward or backward direction.
 * 
 * In short: You should use a List when storing non-unique objects in insertion
 * order.
 * 
 * @author RLHul
 *
 */

public class LinkedListDemo {
	/*
	 * LinkedList is a linear data structure but the elements within do not get
	 * stored in contiguous locations like arrays are. Instead, the elements are
	 * linked with each other using pointers. Each element of a LinkedList has the
	 * pointer to the next element in the LinkedList.
	 * 
	 * LinkedList can act as both a List and a Queue--it implements both the List
	 * and Deque interfaces. LinkedLists internally use a doubly linked list to
	 * store elements.
	 * 
	 * LinkedList is better to use when you want to actually manipulate or alter
	 * data due to the doubly linked list, which makes it so no bit-shifting is
	 * required when updating items.
	 */

	public static void main(String[] args) {

		// Create an instance of a LinkedList
		LinkedList<String> hodgesList = new LinkedList<String>();
		
		// Add elements
		hodgesList.add("Carrie");
		hodgesList.add("Mr. Mercedes");
		hodgesList.add("The Shining");
		hodgesList.add("End of Watch");
		hodgesList.add("End of Watch");

		System.out.println(hodgesList);

		//Removes the first occurance of End of Watch.
		hodgesList.removeFirstOccurrence("End of Watch");
		
		//Updates the element at index 2
		hodgesList.set(2, "Finders Keepers");


		// Add an element to the end of the LinkedList
		hodgesList.addLast("The Outsider");

		// Remove first element
		hodgesList.removeFirst();

		// Print out the elements of LinkedList that has the books in the "Hodges
		// Trilogy" of Stephen King
		Iterator<String> iterator = hodgesList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
