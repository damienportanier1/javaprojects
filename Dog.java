public class Dog{
	//vars
	private int age;
	private String name;
	private String breed;
	private boolean neutered;
	private String details;
	//constructor
	public Dog(){
		neutered=false;
	}
	//set methods
	public void setAge(int age){
		this.age=age;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setBreed(String breed){
		this.breed=breed;
	}
	public void setNeutered(boolean neutered){
		this.neutered=neutered;
	}
	//compute/get
	public String getDetails(){
		details="Name: "+name+". Age: "+age+". Breed: "+breed+" Neutered "+neutered;
		return details;
	}
}