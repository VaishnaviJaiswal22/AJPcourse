package labc4;

public class PrintElements {

	public static void main(String[] args) {
		
		int [] arr = new int[100];
		
		
		//Initialise the Array
		for(int i = 0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		
		
        // Print all the elements of the array from 1 to 100
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i + ": " + arr[i]);
        }


	}

}
