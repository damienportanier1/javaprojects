/*
Software Development
Week 11
MyMoodle Sam Cogan
30 11 2022

Example of Inheritance
*/
public class AnimalMakerApp{
	public static void main(String[] args){

		//objets
		Dog dog1=new Dog("Labrador"); //fill in the round bracket like in the constructor of instantiable class file where inside round bracket (String breed) "race"

		//output + get method + hunger method + feed method
		System.out.println(dog1.getName()); //no set name here, so by default constructor name = Stray
		//check if dog1 is hunger
		dog1.hungerCheck(); //hungerCheck method from instantiable class file (Dog.java himself extends Animal.java) run
		dog1.feed(); //we feed him then we check again if dog1 still hunger
		dog1.hungerCheck();

		//for make a noise
		dog1.animalNoise(dog1.dogNoise()); //animalNoise method from instantiable class file (Dog.java extends Animal.java but in sub class we @Override animalNoise) //run dogNoise method from instantiable class file (Dog.java extends Animal.java)
		//animalNoise method have a for loop and will run dogNoise method which is an array

		//other example
		Animal a1=new Animal(); //a1 (objet) base on super class file (instantiable) Animal.java
		System.out.println("Generic animal");
		a1.hungerCheck();
		a1.feed();
		a1.hungerCheck();

		a1.animalNoise("ROAR !");//no @Override


	}
}
