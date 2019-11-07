package com.collabera.maps;

import java.util.Iterator;
import java.util.LinkedHashMap;
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

public class LinkedHashMapDemo {
	
	/*
	 * LinkedHashMap order the elements based on insertion order.
	 */
	
	public static void main(String[] args) {
		
		//Declare a new LinkedHashMap
		//VoiceActor(Key), Character(Value)
		LinkedHashMap<String, String> voiceActors = new LinkedHashMap<String, String>();
		
		//Add elements to the LinkedHashMap
		voiceActors.put("Matthew Broderick", "Adult Simba");
		voiceActors.put("Mandy Moore", "Repunzel");
		voiceActors.put("Jodie Benson", "Ariel");
		voiceActors.put("Jim Cummings", "Winnie The Pooh");
		voiceActors.put("John Goodman", "Sully");
		voiceActors.put("Joan Cusack", "Jessie");
		voiceActors.put("Joseph Gordon-Levitt", "Jim Hawkins");
		voiceActors.put("Sterling Hollaway", "Winnie The Pooh");
		voiceActors.put("Kathryn Beaumont", "Wendy Darling");
		voiceActors.put("Idris Elba", "Chief Bogo");
		
		//Prints out the elements from the LinkedHashMap
		//Returns in insertion order; note that "Winnie the Pooh" appears as a value twice.
		System.out.println(voiceActors);
		
				// Get a single element.
				System.out.println("Main Star of Tangled: " + voiceActors.get("Mandy Moore"));

				// Remove an element
				voiceActors.remove("Idris Elba");

				// Will return true if the specified key is found in the LinkedHashMap
				System.out.println(voiceActors.containsKey("Joqaquin Phoenix"));

				// Will return true if the specified value is found in the LinkedHashMap
				System.out.println(voiceActors.containsValue("Sully"));
				
				//Returns a set of the keys only from the HashMap
				System.out.println("Keys: " + voiceActors.keySet());

				// Display elements using an iterator.
				Set set = voiceActors.entrySet();
				Iterator iterator = set.iterator();
				while (iterator.hasNext()) {
					Map.Entry mapEntry = (Map.Entry) iterator.next();
					System.out.print("key is: " + mapEntry.getKey() + " & Value is: ");
					System.out.println(mapEntry.getValue());
				}
	}

}
