package com.collabera.lists;

import java.util.ArrayList;
import java.util.List;

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

public class ArrayListDemo {
	/*
	 * ArrayList class implements the List interface but is based on an Array data
	 * structure. It implements all List operations and allows for all elements
	 * including null.
	 * 
	 * ArrayLists store data in the form of a dynamically-sized array and implement
	 * the list interface. When ArrayLists elements are updated, bits have to be
	 * shifted in memory, making data manipulation slow. For this and other reasons,
	 * ArrayLists are more popular overall than Arrays due to the flexibility they
	 * offer.
	 * 
	 * ArrayList is better to use when you want to store and access data
	 */

	public static void main(String[] args) {

		// Declares the List as an ArrayList instance
		List<String> catList = new ArrayList<String>();

		// Add elements to our ArrayList
		catList.add("Ellie");
		catList.add("Izzy");
		catList.add("Kovu");
		catList.add("Simba");
		catList.add("Sneaky");

		// Prints out the entire ArrayList
		// Note that the ArrayList is stored in order of insertion.
		System.out.println("ArrayList before adding a new element:" + catList);

		// Prints out a single cat, Kovu
		// You call the index like you do in an Array, so the ArrayList is from 0 with
		// the first element and so on.
		System.out.println(catList.get(2));

		// I adopted a new cat, add the new element to index 0 because her name is
		// alphabetically above everyone elses'
		catList.add(0, "Bonkers");
		System.out.println("ArrayList after adding a new element:" + catList);

		// Let's say I got a clone of Izzy, adding it at the index after the first Izzy
		// element...
		catList.add(3, "Izzy");
		// It's allowed because ArrayList allows for duplicate values.
		System.out.println("'Clone' added to ArrayList: " + catList);

		// The clone went evil; let's remove that element by calling it's index.
		catList.remove(3);

		// Let's display the ArrayList elements more properly this time by iterating
		// through them.
		System.out.println("'Clone' has been removed. ArrayList elements displayed correctly:");
		for (String str : catList)
			// Prints out each element on a separate line.
			System.out.println(str);
	}
}
