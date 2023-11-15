/*
Exo prof lisa murphy
Damien Portanier
17 10 2022
*/
//App
//Method:
import java.util.*; //attention ici different on fait appelle a Utility package de java pour intro un code avec System
public class StarApp{
	public static void main(String[] args){

	//Declare Variables (same than in Instantiable Class file but we can add different color,age for example)
	String month;
	int date;
	String sign;

	//Declare and create Object // ici la prof call utility package system java (voir record week 4 a 1h15min)

	Scanner keyboard;//keyboard=nameCopyObjectScanner, we can put anything else //Scanner is a class from java utility package and this allows for user input //
	keyboard=new Scanner(System.in); //nameCopyObjectScanner link (=), we created (new) a copy base on Scanner(System.in) which allows user input //
	Star myStar;//nameInstantiableClass nameCopyObject
	myStar=new Star();//permit to create (new) copyObject (myStar) and link it with the mould (Star)

	//Input nameVariableInstantiable=Double.parseDouble(JOptionPane.showInputDialog(null,"Please enter your nameVariableInstantiable: ")); //nameVariableInstantiable=what input user //data input by user gonna be send to the set instantiable file

	System.out.println("Enter Birth month");
	month=keyboard.nextLine(); //Line = String in ScannerClass //= means link what user input to month (variable)

	System.out.println("Enter date of birth");
	date=keyboard.nextInt();

	//Setmethod nameCopyObject.setNameVariableInstantiable (nameVariableInstantiable); // nameVariableInstantiable is what input user
	myStar.setMonth(month);
	myStar.setDate(date);

	//Compute nameCopyObject.computeNameVariableInstantiable(); //compute method App call the compute method Instantiable
	myStar.computeMonth();

	//Getmethod - nameVariableInstantiable=nameCopyObject.getNameVariableInstantiable(); //get information from Instantiable file and store it in one of variableApp (which have the same name than variableInstantiable)
	sign=myStar.getSign();

	//Output - should match our getters
	//grab back in the data from the instan class
	//print a message back to the user - JOptionPane.showMessageDialog(null,"Your salary per year is "+ nameVariableInstantiable);
	System.out.println("Your star sign is "+sign);
	}
}
