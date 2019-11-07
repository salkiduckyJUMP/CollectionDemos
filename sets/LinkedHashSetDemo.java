package com.collabera.sets;

import java.util.Iterator;
import java.util.LinkedHashSet;

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

public class LinkedHashSetDemo {

	/*
	 * LinkedHashSets are implemented as a hash table with a linked list running
	 * through it. It orders its elements in insertion order.
	 */

	public static void main(String[] args) {

		// Declare a new LinkedHashSet
		LinkedHashSet<String> animals = new LinkedHashSet<String>();

		// Add elements to the LinkedHashSet
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

		// Note that when we return the LinkedHashSet, we see the elements returned in
		// insertion order.
		System.out.println(animals);

		// Returns the number of elements in the LinkedHashSet.
		System.out.println("Length of LinkedHashSet: " + animals.size());

		// Returns true if LinkedHashSet is empty, false if it is not
		System.out.println(animals.isEmpty());

		// Remove the element from the LinkedHashSet
		animals.remove("Tiger");

		// Correct way to iterate through a LinkedHashSet and return the elements
		System.out.println("Elements after Tiger is removed:");
		Iterator<String> iterator = animals.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("Updated Length: " + animals.size());

	}

}
