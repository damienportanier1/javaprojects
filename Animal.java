/*
Software Development
Week 11
MyMoodle Sam Cogan
30 11 2022

Example of Inheritance
*/
public class Animal{ //super class is like superior instantiable class file/father class
	//vars
	private boolean hunger;
	private String noise;

	//constructor
	public Animal(){
		hunger=true; //by default all the animal (object) created are hungry
	}
	//set methods
	public void animalNoise(String noise){
		this.noise=noise;
		System.out.println(noise);
	}
	//compute feed
	public void feed(){
		System.out.println("You feed the animal");
		hunger=false;
	}
	//compute hungerCheck
	public void hungerCheck(){
		if(hunger){
			System.out.println("This animal looks hungry");
			}
			else {
				System.out.println("This animal looks satisfied");
				}

	}
}
/*
	public void setNeutered(boolean neutered){
		this.neutered=neutered;
	}
	//compute/get
	public String getDetails(){
		details="Name: "+name+". Age: "+age+". Breed: "+breed+" Neutered "+neutered;
		return details;
	}
}
*/