package com.collabera.sets;

import java.util.HashSet;
import java.util.Iterator;

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

public class HashSetDemo {

	/*
	 * HashSet stores elements in a hash table but makes no gurantees concerning the
	 * order of iteration. HashSets will also allow for one null value.
	 */
	public static void main(String[] args) {

		// Declare a new HashSet
		HashSet<String> animals = new HashSet<String>();

		// Add elements to the HashSet
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Wolf");
		animals.add("Parrot");
		animals.add("Fox");
		animals.add("Tiger");
		animals.add("Rabbit");
		animals.add("Gecko");
		animals.add("Armadillo");
		animals.add("Gecko");
		animals.add("Rat");

		// Note that when we view the HashSet Gecko is only returned once; duplicate
		// values are not allowed.
		// Also note that insertion order is not followed; it's randomly ordered.
		System.out.println(animals);

		// Returns the number of elements in the HashSet.
		System.out.println("Length of HashSet: " + animals.size());
		
		// Returns true if HashSet is empty, false if it is not
		System.out.println(animals.isEmpty());
		
		//Remove the element from the HashSet
		animals.remove("Tiger");
		
		//Correct way to iterate through a HashSet and return the elements
		System.out.println("Elements after Tiger is removed:");
		 Iterator<String> iterator = animals.iterator();
	     while(iterator.hasNext()){
	        System.out.println(iterator.next());
	     }
	     System.out.println("Updated Length: " + animals.size());

	}

}
