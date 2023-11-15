/*
Develop an application that allows Mary to
Input 	- ENTER what the CUSTOMER has to PAY and also how many
		- STAFF MEMBERS ARE WORKING on that day. You should then
OUTPUT 	- the total cost of the customer’s BILL that includes a 10% TIP and also how much
		- EACH STAFF MEMBER will get on that day as a TIP.
RestaurantTestPerso.java
Damien Portanier
10 10 2022
*/
//class signature (pour exam les comments font gagner des points)
public class RestaurantTestPerso{

	//variables = data members //camelCase minuscule puis majuscule
	private double paymentAmount;//store the customers amount (input) elle utilise cette ligne comme un input //private because its a data member //amount of staff we need
	//amount staff are getting pay
	//anything with money we double it
	private int staff;//store the amount of staff(input)
	//on a une constante de 10%
	private final double TIPPERCENT;//"private final double" est une constante //TIPPERCENT=0.1 storing the 10% discount
	private double tip;//work out the tip (process+output)
	private double totalCost;//work out the total cost of the customers bill (process+output)

	//En week 4 on voit :
		//construtor //constructor purpose is to assign variable //overloaded constructor
		public RestaurantTestPerso(){//public because on a besoin que ce soit accessible
			paymentAmount=0.0;//elle decide que ce variable est vide pour le moment //on peut aussi mettre double payAmount mais pas besoin parce qu'on la deja déclaré plus haut
			staff=0;
			totalCost=0.0;
			tip=0.0;
			TIPPERCENT=0.1;
		}
		//setters - represent input
		public void setPaymentAmount(double paymentAmount){//grabbing the amount from your app class//that the variable called paymentAmount in here is the same as the paymentAmount in your app class
			this.paymentAmount=paymentAmount;
		}//ex de la prof si t'oubli de fermer un crocher t'aura "illegal start of expression" means you have left out a closing bracket in this case
		public void setStaff(int staff){//setStaff is the name de la variable //attentation au majuscule
			this.staff=staff;
		}
		//compute - process - calculations
		public void compute(){
			tip=(paymentAmount*TIPPERCENT)/staff;//work out the tip
			totalCost=(paymentAmount*TIPPERCENT)+paymentAmount;//work out the bill
		}

		//getters represent output
		public double getTotalCost(){
			//return the totalCost to the app class
			return totalCost;
		}
		public double getTip(){
			return tip;
		}

}//closes the class signature

//don't we need to store the total for the day, so more than one bill? No because dans l'énoncé on nous demande uniquement our une journe ou une bill
//Ici c'est l'instatiable file