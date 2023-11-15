/*
Exo prof lisa murphy
Damien Portanier
17 10 2022
*/
//Instantiable
//method
public class Star{
	//Variables
	private String month;
	private int date;
	private String sign;

	//Constructor (by default ou modif)
	public Star(){
	month=""; //if int
	date=0; //if String
	sign="";
	}
	//Setmethod
	public void setMonth(String month){ // setNameVariableInstantiable is a name we give at set //receive what input the user in App file
		this.month=month;
	} //RightToLeft - link what userInput () in Appfile to (=) the Variable () in Instantiablefile (this.)
	public void setDate(int date){
			this.date=date;
	}
	//Compute/process/calcul
	public void computeMonth(){ // computeNameVariableInstantiable is a name we give at compute //between () if we add parameters, we must add too at the same place in Appfile
		if (month.equalsIgnoreCase("January")){//same than == (number) but .equal (String), also add IgnoreCase permit to not take care of MAJUSCULE/minuscule (what user input)
			if(date>=1&&date<=19){//1er au 19 janvier = capricorn après c aquarius
				sign="capricorn";
			}
			else{//grab everything else
				sign="Aquarius";
			}
			}
		else if (month.equalsIgnoreCase("February")){
			if(date>=1&&date<=18){
				sign="Aquarius";
			}
			else {
				sign="Pisces";
            }
        }
        }
		//finish the rest of the months then compute done

	//Getmethod - Output you want to send back to the Appfile (User)
	public String getSign(){//getNameVariableInstantiable is a name we give at get and it is the variable we want to output in app file
		return sign;
	}
		 ////return = send the information to the App file //variable we want to output
}