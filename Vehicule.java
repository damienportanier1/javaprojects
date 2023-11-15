/*
Software Development
Lab Week 11
Damien Portanier
30 11 2022

Java Inheritance (Superclass and Subclass)
Vehicule.java (superclass) > Car.java (subclass) > VehiculeMakerApp.java (appclass)
*/
//method
public class Vehicule{ //super class
	//vars
	private boolean lackFuel;
	private String klaxon;

	//constructor
	public Vehicule(){
		lackFuel=true; //by default all the objet or sub class vehicule created lack of fuel
	}
	//set methods
	public void vehiculeKlaxon(String klaxon){
		this.klaxon=klaxon;
		System.out.println(klaxon); //output
	}
	//compute fillIn method
	public void fillIn(){
		System.out.println("You fill up the vehicule with fuel");
		lackFuel=false; //no need fuel anymore
	}
	//compute lackFuelCheck method
	public void lackFuelCheck(){
		if(lackFuel){
			System.out.println("This vehicle indicates that it is low on fuel");
			}
			else {
				System.out.println("This vehicle is full of fuel");
				}

	}
}
