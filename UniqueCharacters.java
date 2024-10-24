package labc3;

public class UniqueCharacters {
	
	// Method to check the the character is unique or not 
	public void checkString(String str) {
		for(int i = 0; i<str.length(); i++) {
			int count = 0;
		 for (int j = 0; j<str.length(); j++) {
			 
			 // Checking if two characters are equal
			 if(str.charAt(i) == str.charAt(j) && i != j) {
				 count++;
				 break;
			 }
			 
		 }
		 if(count == 0) {
			System.out.println(str.charAt(i)); //print the Characters which is unique 
		 } 
		}
	}

	

	public static void main(String[] args) {
         UniqueCharacters u = new UniqueCharacters();
         u.checkString("java"); // call checkString Method
	}

}
