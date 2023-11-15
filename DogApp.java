import javax.swing.JOptionPane;
public class DogApp{
	public static void main(String[] args){
		//vars
		int age;
		String name;
		String breed;
		boolean neutered;
		String details="";
		String firstDetails="";
		String goAgain="Y";
		int loopCounter=0;
		int totalAge=0;
		//objects
		Dog myDog;
		myDog=new Dog();
		Dog myFirstDog;
		myFirstDog=new Dog();
		//loop
		while(goAgain.equals("Y")){
			//create dog
			age=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter dog "+(loopCounter+1)+"'s age"));
			name=JOptionPane.showInputDialog(null,"Enter dog "+(loopCounter+1)+" name");
			breed=JOptionPane.showInputDialog(null,"Enter dog "+(loopCounter+1)+" breed");
			neutered=Boolean.parseBoolean(JOptionPane.showInputDialog(null,"Enter dog "+(loopCounter+1)+" neutered status"));
			totalAge=totalAge+age;
			if(loopCounter==0){
				myFirstDog.setAge(age);
				myFirstDog.setName(name);
				myFirstDog.setBreed(breed);
				myFirstDog.setNeutered(neutered);
			}
			//set dog 1
			myDog.setAge(age);
			myDog.setName(name);
			myDog.setBreed(breed);
			myDog.setNeutered(neutered);
			//get details of dog1
			details=myDog.getDetails();
			//print details of dog1
			System.out.println(details);
			loopCounter++;
			goAgain=JOptionPane.showInputDialog(null,"Enter Y to go again");
		}
		firstDetails=myFirstDog.getDetails();
		System.out.println("First dog!");
		System.out.println(firstDetails);
		//most recent dog
		details=myDog.getDetails();
		System.out.println("Last dog!");
		System.out.println(details);
		//age of all dogs added up
		System.out.println("Age of all dogs added up: "+totalAge);

	}
}