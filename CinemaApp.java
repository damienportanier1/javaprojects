/*
Lab 1 Week 4
Damien Portanier
17 10 2022
*/
//AppFile
import javax.swing.JOptionPane;
public class CinemaApp{
	public static void main(String[] args){

	//Variables (same than in Instantiable Class file but we can add different color,age for example)
	int userAge;
	int numberOfCinemaTickets;
	double price;

	//Object
	Cinema cinemaBis;
		cinemaBis=new Cinema (); // cinemaBis is a name we give to the copyobject we created (new) which is base on NameInstantiableFile

	//Input
	userAge=Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter your age: "));
	numberOfCinemaTickets=Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter the number of cinema tickets you need: "));

	//nameVariableInstantiable=what input user //data input by user gonna be send to the set instantiable file

	//Setmethod
	cinemaBis.setUserAge (userAge); // nameVariableInstantiable is what input user
	cinemaBis.setNumberOfCinemaTickets (numberOfCinemaTickets);

	//Compute
	cinemaBis.computePrice(); //compute method App call the compute method Instantiable

	//Getmethod
	price=cinemaBis.getPrice(); //get information from Instantiable file and store it in one of

	//variableApp (which have the same name than variableInstantiable)

	//Output  //MessageDialogBox or println
	JOptionPane.showMessageDialog(null,"The cost for "+numberOfCinemaTickets+" is "+price+" euros.");
	}
}

