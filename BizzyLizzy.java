/*
BizzyLizzy.java
Damien Portanier
3 10 2022
*/

//create an application for a flowershop called BizzyLizzy that stores 3 items.
//variable is price of Roses 4.99 Daisies 3.55 Shamrock 1.99 and the user wishes to purchase 1 of each of all the items.
//Can you work out their total shopping for Lucy?
//Declare constant final double ROSEAMOUNT

public class BizzyLizzy{
	//main method - runs the application
	public static void main(String[]arg){

		//variables (for store data) - declare a variable
		final double priceOfRoses; //if type of data is a price that do not change we can put a constant = final
		final double priceOfDaisies;
		final double priceOfShamrock;
		int numberOfPurchase;
		double total;

		//assign a variable
		priceOfRoses=4.99;
		priceOfDaisies=3.55;
		priceOfShamrock=1.99;
		numberOfPurchase=1;
		total=0;

		//Process+output
		total=(priceOfRoses+priceOfDaisies+priceOfShamrock)*numberOfPurchase;
		System.out.println("The total of the shopping is "+total+"euros !!!!!!!!!!!");
		//println means print a line
	}
}
