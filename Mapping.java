package labc6;

import java.util.HashMap;

public class Mapping {

	public static void main(String[] args) {
		// Create a HashMap
		HashMap<String , Integer> map = new HashMap<>();
		
		// Add Key-Value pairs to the HashMap
		map.put("Apple", 10);
		map.put("Banana", 20);
		map.put("Orange", 30);
		map.put("Lemon", 40);
		
		//Check if the HashMap is empty or not
		if(map.isEmpty()) {
			System.out.println("The HashMap is empty.");
		}else {
			System.out.println("The HashMap is not Empty.");
		}
		
		System.out.println();
		
		// Display The Map
		System.out.println("Hashap :" +map);
		
		System.out.println();
		
		// Check if specific Key-Value pair exist or not
		String key = "Lemon";
		int value = 40;
		
		if(map.containsKey(key) && map.get(key).equals(value)) {
			System.out.println("The key-value pair " + key + "=" + value + "is present in the HashMap.");
		}else {
			System.out.println("The key-value pair " + key + "=" + value + "is not present in the HashMap.");
		}

	}

}
