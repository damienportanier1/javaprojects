/*
Software Development
Lab Week 11
Damien Portanier
30 11 2022

Java Inheritance (Superclass and Subclass)
Vehicule.java (superclass) > Car.java (subclass) > VehiculeMakerApp.java (appclass)
*/
import java.util.Scanner; //java utility package - allowing for user input
//method
public class VehiculeMakerApp{
	public static void main(String[] args){

		//object based on the sub class Car.java inherits (extends) from the super class Vehicule.java
		Car car1=new Car("Electric"); //Based on the constructor of sub class file (Car.java) -  set up the engine of the objet car1 as Electric //car1 is the name of the object

		//output + get method + lackOfFuel method + fillIn method
		System.out.println(car1.getBrand()); //we do not set up a brand here, so by default the brand of the objet car1 is BMW (because based on the sub class Car.java that define in his constructor the brand="BMW")

		//check if car1 lack of fuel
		car1.lackFuelCheck(); //run the lackFuelCheck method from the super class file Vehicule.java that we have access here throught the sub class file Car.java because sub class (Car) inherits (extends) from the super class (Vehicule)
		car1.fillIn(); //run the fillIn method from the superclass file Vehicule.java on the same principle than above
		car1.lackFuelCheck(); //run again the lackFuelCheck method
		//inside those methods from superclass file Vehicule.java an if statement run (check superclass file Vehicule.java)

		//for make a noise
		car1.vehiculeKlaxon(car1.carNoise()); //run the vehiculeKlaxon method from the subclass file Car.java that inherits (extends) from the super class Vehicule.java BUT WARNING in sub class (Car) we @Override vehiculeKlaxon method for run a for loop
		//inside the round bracket the carNoise method from the subclass file Car.java will run inside the for loop of the vehiculeKlaxon function

		//in methods/functions above the output method is already done

		//object based on the superclass file Vehicule.java
		Vehicule v1=new Vehicule(); //v1 is the name of the object
		System.out.println("Petrol Vehicule"); //output

		//same actions than above for the car1 object but here only the superclass file Vehicule.java methods will run because in java inheritance the superclass is the "parent" and the subclass is the "child", so one (sub/child) inherits the attributes and methods from the other (super/parent)
		v1.lackFuelCheck();
		v1.fillIn();
		v1.lackFuelCheck();

		v1.vehiculeKlaxon("PopPop !");//this method in superclass file is not initialise so we initialise it here in the object

		//in methods/functions above the output method is already done

	}
}
/*

String engineSound=;

		//Scanner + Object + input + set + compute + get + ouput
		Scanner scanner=new Scanner(System.in);
		Car car2=new Car("Turbo");

		//input
			//ask a question - store the user answer into the variable (engineSound)
		System.out.println("What noise make your car?");
			engineSound=scanner.nextLine();
		//set
			//send the answers to the subclass file Car.java
		car2.setEngineSound(engineSound);
		//compute
				//name compute must be the same than in instantiable class file Marks.java
		car2.computeEngineSound();
		//get
			//grab info from the subclass file Car.java
		String msg=car2.getMsg();
		//output
		System.out.println(msg);
*/