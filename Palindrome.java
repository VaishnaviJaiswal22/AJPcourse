package labc3;

public class Palindrome {
	
	public static boolean checkString(String str) {
		 String str1 = str.toLowerCase();
		 int i = 0, j = str.length() - 1;
		 while(i<j) {
			 if(str1.charAt(i) != str1.charAt(j)) {
				 return false;
			 }
			 i++;
			 j--;
		 }
		 return true;
	}

	public static void main(String[] args) {
		String str = "Madam";
		if(checkString(str)) {
			System.out.println(str + " is a Palindrome");
		}else {
			System.out.println(str + " is not a Palindrome");
		}
		

	}

}
