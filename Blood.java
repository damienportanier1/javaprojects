/*
Lab 1 Week 5
Damien Portanier
23 10 2022
*/

public class Blood{
	//Variables
	private int age;
	private String blood;
	private String msg;

	//Constructor (by default ou modif)
	public Blood(){//permit to Input by default if no input
	age=0;
	blood="";
	msg="Error, please enter an age>=1.";}

	//Setmethod
	public void setAge(int age){ //receive what the user input in App file
	this.age=age;} //RightToLeft - link what user input ("his age") in Appfile (BloodApp) to (=) the Variable (age) in Instantiablefile Blood.java (this.)

 	public void setBlood(String blood){
	this.blood=blood;}

	//Compute //reminder == (number) but .equal (String) also add IgnoreCase permit to not take care of capital/lowercase letter on what user input)
	public void computeAge(){
		if (age>=18){
			if(blood.equalsIgnoreCase("AB")){
				msg="You can give blood to a person whose blood group is AB, and you can receive blood from people with blood group AB, A, B and O.";}
			else if(blood.equalsIgnoreCase("A")){
				msg="You can give blood to a person whose blood group is A and AB and you can receive blood from people with blood group A and O.";}
			else if(blood.equalsIgnoreCase("B")){
				msg="You can give blood to a person whose blood group is B and AB and you can receive blood from people with blood group B and O.";}
			else if(blood.equalsIgnoreCase("O")){
				msg="You can give blood to a person whose blood group is AB, A, B and O, and you can receive blood from people with blood group O.";}
			else{
				msg="Please enter a correct blood group.";}
		}//close the first if bracket
		else if (age<18&&age>=1){//&& means and
			if(blood.equalsIgnoreCase("AB")){
				msg="You cannot give your blood because you are under 18 years old, but you can receive blood from people with blood group AB, A, B and O.";}
			else if(blood.equalsIgnoreCase("A")){
				msg="You cannot give your blood because you are under 18 years old, but you can receive blood from people with blood group A and O.";}
			else if(blood.equalsIgnoreCase("B")){
				msg="You cannot give your blood because you are under 18 years old, but you can receive blood from people with blood group B and O.";}
			else if(blood.equalsIgnoreCase("O")){
				msg="You cannot give your blood because you are under 18 years old, but you can receive blood from people with blood group O.";}
			else{
				msg="Please enter a correct blood group.";}
		}//close the first else if bracket

	}
	//Getmethod
	public String getMsg(){
	return msg;} //return = send the information to the App file //msg is the variable we want to output
}