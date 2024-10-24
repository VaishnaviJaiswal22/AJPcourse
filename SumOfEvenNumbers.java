package labc5;

import java.util.ArrayList;
import java.util.List;

public class SumOfEvenNumbers {

	public static void main(String[] args) {
		
		//Create an arrayList of Integers
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		
		// Calculate the sum of all even numbers
		int sum = 0;
		for(int num : numbers) {
			if(num%2 == 0) {
				sum += num;
			}
		}
		
		// Print the sum of even Numbers
		System.out.println("The sum of all even numbers in the ArrayList : " + sum);
	}

}
