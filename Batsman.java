package labc6;

import java.util.HashMap;
import java.util.Scanner;

public class Batsman {

	public static void main(String[] args) {
		// Create a HashMap
		HashMap<String , Integer> map = new HashMap<>();
		
		// Add Batsman name and Score  pairs to HashMap
		map.put("Dhoni",85 );
		map.put("Virat", 95);
		map.put("Hardik", 87);
		map.put("Jadeja", 95);
		map.put("Rohit", 95);
		
		// Display The Map
		System.out.println("Hashap :" +map);
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The name of batsman from the map: ");
		String key = s.next(); // read the input from user and assign it to "Key" variable
		
		// print the score of Batsman whose name is present in "key" variable
		
		if (map.containsKey(key)) {
			
			Integer a = map.get(key);
			
			System.out.println("Value for Key   " + key + " is " + a );
		}
		
		s.close();

	}

}
