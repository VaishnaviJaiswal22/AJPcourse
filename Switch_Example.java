package core_Java_1;

public class Switch_Example {

	public static void main(String[] args) {
		String day = "Mitra";
		
		switch(day) 
		{
		case "Mon":
			System.out.println("it is monday");
			break;
		case "Tue":
			System.out.println("it is tuesday");
		     break;
		case "wed":
			System.out.println("it is wednesday");
		     break;
		case "Thur":
			System.out.println("it is thursday");
		     break;
		case "Fri":
			System.out.println("it is friday");
		     break;
		case "Sat":
			System.out.println("it is saturday");
		     break;
		case "Sun":
			System.out.println("it is sunday");
		     break;
		default :
			System.out.println("Invalid day");
		}

	}

}
