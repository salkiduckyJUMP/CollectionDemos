package com.collabera.maps;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * The package above contains demo of Maps.
 * 
 * A Map is an object that maps keys to values. The keys must be unique from
 * each other, but there can be duplicate values.
 * 
 * @author RLHul
 * 
 */

public class HashtableDemo {

	/*
	 * Hashtable is similar to a HashMap except that it is synchronized. This means
	 * that it can be shared between multiple threads. It also differs from HashMap
	 * in that it will not allow any null keys or values.
	 */

	public static void main(String[] args) {

		// Declare a new Hashtable
		// Year(Key), Movie Title(Value)
		Hashtable<Integer, String> bestMovies = new Hashtable<Integer, String>();

		// Add elements into Hashtable
		// *NOTE: Took these from a list online based on IMDB ratings, please don't
		// message me to argue :)
		bestMovies.put(2000, "Gladiator");
		bestMovies.put(2001, "A Beautiful Mind");
		bestMovies.put(2002, "The Pianist");
		bestMovies.put(2003, "The Lord of the Rings: The Return of the King");
		bestMovies.put(2004, "Eternal Sunshine of the Spotless Mind");
		bestMovies.put(2005, "Batman Begins");
		bestMovies.put(2006, "The Departed");
		bestMovies.put(2007, "No Country for Old Men");
		bestMovies.put(2008, "The Dark Knight");
		bestMovies.put(2009, "Up");
		bestMovies.put(2010, "Inception");

		// Prints out the Hashtable.
		//Note that we're not allowed any null keys or null values.
		System.out.println(bestMovies);

		// Get a single element.
		System.out.println("Best Movie of 2009: " + bestMovies.get(2009));

		// Remove an element
		bestMovies.remove(2002);

		// Will return true if the specified key is found in the HashMap
		System.out.println(bestMovies.containsKey(2011));

		// Will return true if the specified value is found in the HashMap
		System.out.println(bestMovies.containsValue("Batman Begins"));

		// Returns a set of the keys only from the HashMap
		System.out.println("Keys: " + bestMovies.keySet());

		// Display elements using an iterator.
		Set set = bestMovies.entrySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry mapEntry = (Map.Entry) iterator.next();
			System.out.print("key is: " + mapEntry.getKey() + " & Value is: ");
			System.out.println(mapEntry.getValue());
		}

	}

}
