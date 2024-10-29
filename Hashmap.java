package labc6;

import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
		// Create a HashMap
		HashMap<String , Integer> map = new HashMap<>();
		
		// Associate Specified Value with specified Key
		map.put("XYZ", 87);
		map.put("PQR", 97);
		map.put("ABC", 85);
		
		//print size of of the map
		System.out.println("Size of map is: " +map.size());
		
		// Display the map
		System.out.println("Initial HashMap: " +map);
		
		//update the value associated with a key
		map.put("ABC", 95);
		
		// Display the updated  map
		System.out.println("Updated HashMap: " +map);
	}

}
