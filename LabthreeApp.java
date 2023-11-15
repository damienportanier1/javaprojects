/*
Lab 3 Week 4
Damien Portanier
17 10 2022
*/
//AppFile
import javax.swing.JOptionPane;
public class LabthreeApp{
	public static void main(String[] args){

	//Variables (same than in Instantiable Class file but we can add different color,age for example)
	double number;
	String msg;

	//Object
	Labthree n;
		n=new Labthree (); // n is a name we give to the copyobject we created (new) which is base on NameInstantiableFile
	//Input
	number=Double.parseDouble(JOptionPane.showInputDialog(null,"Please enter a number: "));

	//nameVariableInstantiable=what input user //data input by user gonna be send to the set instantiable file

	//Setmethod
	n.setNumber (number); // nameVariableInstantiable is what input user

	//Compute
	n.computeMsg(); //compute method App call the compute method Instantiable

	//Getmethod
	msg=n.getMsg(); //get information from Instantiable file and store it in one of

	//variableApp (which have the same name than variableInstantiable)

	//Output  //MessageDialogBox or println
	JOptionPane.showMessageDialog(null,msg+".");
	}
}

