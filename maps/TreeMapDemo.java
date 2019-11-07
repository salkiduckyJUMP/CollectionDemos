package com.collabera.maps;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * The package above contains demo of Maps.
 * 
 * A Map is an object that maps keys to values. The keys must be unique from
 * each other, but there can be duplicate values.
 * 
 * @author RLHul
 * 
 */

public class TreeMapDemo {

	/*
	 * TreeMap stores elements in a red-black tree, ordering elements based on
	 * values. Slower than HashMap as a result.
	 */

	public static void main(String[] args) {

		// Declare a new TreeMap
		// ID(Key), Name(Value)
		TreeMap<Integer, String> pokemon = new TreeMap<Integer, String>();

		// Add Elements to the List
		pokemon.put(158, "Totodile");
		pokemon.put(255, "Torchic");
		pokemon.put(7, "Squirtle");
		pokemon.put(252, "Treecko");
		pokemon.put(4, "Charmander");
		pokemon.put(155, "Cyndaquil");
		pokemon.put(258, "Mudkip");
		pokemon.put(1, "Bulbasaur");
		pokemon.put(25, "Pikachu");
		pokemon.put(152, "Chickorita");

		// Prints out elements; note that it sorted them in ascending key value
		// despite the elements having been inserted in a random order.
		System.out.println(pokemon);

		// Our list has an element that doesn't fit the rest. Removing that element.
		pokemon.remove(25);

		// Get a single element.
		System.out.println(pokemon.get(258));

		// Will return true if the specified key is found in the TreeMap
		System.out.println(pokemon.containsKey(4));

		// Will return true if the specified value is found in the TreeMap
		System.out.println(pokemon.containsValue("Sandshrew"));

		// Returns a set of the keys only from the TreeMap
		System.out.println("Keys: " + pokemon.keySet());

		// Display elements using an iterator.
		Set set = pokemon.entrySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry mapEntry = (Map.Entry) iterator.next();
			System.out.print("key is: " + mapEntry.getKey() + " & Value is: ");
			System.out.println(mapEntry.getValue());
		}

	}

}
