package com.collabera.sets;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * The package above contains demos of Sets. A Set is a distinct list of
 * elements which doesn't maintain any order; no duplicate elements are allowed.
 * If a duplicate element is added to the Set, it will only replace the existing
 * value instead of creating a new one like it does in a List. Sets can also
 * only be traversed in a forward direction.
 * 
 * In total, Sets should be used to store unique objects where order is not
 * important.
 * 
 * @author RLHul
 *
 */

public class TreeSetDemo {
	/*
	 * TreeSets store elements in a red-black tree structure and orders its elements
	 * based on their values in an ascending order. It can tend to be slower than
	 * HashSet as a result. TreeSets also differ from HashSet in the fact that it
	 * does not allow null values.
	 */

	public static void main(String[] args) {

		// Create a new instance of a TreeSet
		TreeSet<String> animals = new TreeSet<String>();

		// Add elements to the TreeSet
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Wolf");
		animals.add("Parrot");
		animals.add("Fox");
		animals.add("Tiger");
		animals.add("Rabbit");
		animals.add("Gecko");
		animals.add("Armadillo");
		animals.add("Rat");

		// Note that the TreeSet is stored in ascending alphabetic order.
		System.out.println(animals);

		System.out.println("Length of HashSet: " + animals.size());

		// Returns true if TreeSet is empty, false if it is not
		System.out.println(animals.isEmpty());

		// Remove the element from the TreeSet
		animals.remove("Tiger");

		// Correct way to iterate through a TreeSet and return the elements
		System.out.println("Elements after Tiger is removed:");
		Iterator<String> iterator = animals.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("Updated Length: " + animals.size());

	}

}
