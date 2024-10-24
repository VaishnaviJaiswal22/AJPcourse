package labc4;

public class ArrayExceptionExample {

	public static void main(String[] args) {
		int [] arr = {10,20,30,40,50};
		
		try {
		for(int i = 0; i<=arr.length;i++) {
			System.out.println("Elements at index " + i + ":" + arr[i] );
		}
		}catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("You tried to access an index that is out of bounds.");
            e.printStackTrace();  // Optionally print the stack trace for debugging

		}

	}

}
