/*
RestaurantAppTestPerso.java
Damien Portanier
10 10 2022
*/
import java.util.*;//utility package - allowing for user input
public class RestaurantAppTestPerso{
	public static void main(String[] args){
	//variables - je copie colle ce que j'ai dans les variables de Restaurant.java en enlevant les private
		double paymentAmount;
		int staff;
		final double TIPPERCENT=0.1;
		double tip;
		double totalCost;
	//objects
	Scanner keyboard;
	keyboard=new Scanner(System.in);
	Restaurant myRestaurant;
	myRestaurant=new Restaurant();

	//input
	System.out.println("How much was your bill?");//ask the question
		paymentAmount=keyboard.nextDouble();//store the answer //grabbing the next decimal and storing it in paymentaount
		myRestaurant.setPaymentAmount(paymentAmount);//send the answer to the app class

	//process
	myRestaurant.compute();

    //output//go out to my instan class called myRestaurant and grab the total cost
    	totalCost=myRestaurant.getTotalCost();
    	System.out.println("the total of your bill is "+totalCost);//we need to grab (the total cost back in) the answer first
    	tip=myRestaurant.getTip();
    	System.out.println("The tip per staff member is "+tip);

}
}



