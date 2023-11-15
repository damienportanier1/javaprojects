/*
Software Development
Lab Week 11
Damien Portanier
30 11 2022

Java Inheritance (Superclass and Subclass)
Vehicule.java (superclass) > Car.java (subclass) > VehiculeMakerApp.java (appclass)
*/
//extends method
public class Car extends Vehicule{ //sub class (Car) inherits (extends) from the super class (Vehicule)

	//vars - this Car will have is own variable
	private String brand;
	private String engine;
	private int randomKlaxon;
	private String chosenKlaxon;
	private String engineSound; //input
	private String msg;

	//constructor
	public Car(String engine){ //every objet created/based on this sub class (Car.java) will be required to define the engine they use
		this.engine=engine; //store it, into the variable engine in this subclassfile
		brand="BMW"; //by default objet created will have a brand BMW
		engineSound="";
	}
	//set method - for set a brand to the Car
	public void setBrand(){
		this.brand=brand;
	}
/*	public void setEngineSound(){
		this.engineSound=engineSound;
	}
	//compute engineSound
	public void computeEngineSound(){
		for (int i=0;i<2;i++){
			String msg=engineSound;
		}
	}
	//get method msg
	public String getMsg(){
		return msg;
	}
*/	//get method
	public String getBrand(){
		return brand;
	}
	//(get method+compute) carNoise method + create, declare and initialise the array klaxonNoise with random String then store the array into the variable chosenKlaxon
	public String carNoise(){
		String [] klaxonNoise={"BipBip","TutTut","BuhBuh"}; //create an array klaxonNoise that exist only inside the carNoise method
		randomKlaxon=(int)(Math.random()*3); //for choose the klaxonNoise randomly
		chosenKlaxon=klaxonNoise[randomKlaxon]; //index/position 0,1,2 will output "BipBip","TutTut","BuhBuh"
		return chosenKlaxon;
	}

	//@Override method permit to replace a method from super class file (Vehicule.java)
	@Override //call the function vehiculeKlaxon from super class file (Vehicule.java) and run it with a variable from sub class file (Car.java)
	public void vehiculeKlaxon(String klaxon){
		for (int i=0;i<3;i++){ //want to do the klaxon 3 times
			super.vehiculeKlaxon(chosenKlaxon); //take the vehiculeKlaxon function from super class file (Vehicule.java) to run chosenKlaxon variable from sub class (Car.java) which contain the array klaxonNoise (from the same sub class too)
		}
	}
}