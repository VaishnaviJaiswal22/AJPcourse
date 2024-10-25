package oct23;
import java.util.Scanner;

public class Sum_of_Digits {
		// method to sum the digits of integer
		public void sumofdigits(int n) {
			int sum = 0;
			while(n>0) {
				sum=sum+(n%10);
				n=n/10;
			}
			System.out.println("Sum of the digits of integer is  " + sum);
		}
		
		// main method
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = s.nextInt();
		Sum_of_Digits c = new Sum_of_Digits();
		c.sumofdigits(num);
		s.close();
	}

}
