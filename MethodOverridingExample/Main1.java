package labc3;

import java.util.Scanner;

//Superclass
class Animal{
    
	// Method to be overridden by subclasses
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }

}

//Subclass Dog
class Dog extends Animal{
	
	@Override
	public void makeSound() {
        System.out.println("The Dog barks.");
    }
}

// Subclass Cat
class Cat extends Animal{
	
	@Override
	public void makeSound() {
        System.out.println("The Cat meows.");
    }
}


// Main class
public class Main1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); //Create an Scanner Object
		
		System.out.println("Choose an Animal 1 for Dog and 2 for Cat :");
		int ch = s.nextInt(); //read the input and assign it to 'ch' variable
		
		Animal animal;
		
		// Make the object According to user input
		if(ch == 1) {
			animal = new Dog();
		}else if (ch == 2) {
			animal = new Cat();
		}else {
			System.out.println("Other animals than cat and dog ");
			animal = new Animal();
		}
		
		// call the MakeSound method
		animal.makeSound();
		
		s.close(); // close the scanner
	}

	

}
