package core_Java_1;

public class Test {
	public static void main(String[] args) {
		System.out.println("Hello World !!");
		System.out.print("Hello World !!");
		System.out.println("Hello World !!");
		
		int a = 10;
		System.out.println(a++);
	     a = a+ 20;
		System.out.println(++a);
		
		String name = "Vaishnavi Jaiswal";
		System.out.println(name);
		
		// implicit type casting
		int i = 50;
		double d = i;
		System.out.println(i);
		System.out.println(d);
		
		// explicit type casting
		double var = 34.23;
		int t = (int) var;
		System.out.println(var);
		System.out.println(t);
	}
}