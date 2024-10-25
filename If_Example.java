package core_Java_1;

public class If_Example {

	public static void main(String[] args) {
		
		
		int n = -5;
		
		if(n>0) {
			System.out.println("greter than");
		}else {
			System.out.println("Less than");
		}
		
		int m = 95;
		
		if(m>90) {
			System.out.println("Grade A");
		}else if(m>80 && m<=90) {
			System.out.println("Grade B");
		}else {
			System.out.println("Fail");
		}
		
		int num = 41;
		if(num>0) {
			if(num%2==0) {
				System.out.println("even number and greater than 0");
			}else {
				System.out.println("odd number and greater than 0");
			}
		}

	}

}
