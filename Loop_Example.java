package core_Java_1;

public class Loop_Example {

	public static void main(String[] args) {
		
		//for loop
		for(int i = 1; i<=10;i++) {
			System.out.println(i);
		}
		
		//while
		int j = 1;
		while(j<10) {
			System.out.println(j);
			j++;
		}
		
		// do while
		int a = 5;
		do {
			System.out.println(a);
		}while(a<3);
		
		// for-each
		int arr[] = {1,2,3,4,5,6,7};
		for (int x : arr) {
			System.out.println(x);
		}
	
	}
}
