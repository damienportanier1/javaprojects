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

import javax.swing.JOptionPane;
public class TestExoProf{
	public static void main(String[] args){

		//variables + inputs
		double payClient=Double.parseDouble(JOptionPane.showInputDialog(null,"Combien le client doit sans compter les tips ?"));
		int staffToday=Integer.parseInt(JOptionPane.showInputDialog(null,"Combien de serveur aujourdhui ?"));
		final double TIP = 0.1;

		//variables + process
		double totalCostBill=payClient*1.1;
		double staffTipMoney=(totalCostBill/1.1*0.1)/staffToday;

		//output
		JOptionPane.showMessageDialog(null,"Le client doit "+(totalCostBill)+" euros");
		JOptionPane.showMessageDialog(null,"Pour cette commande chaque membre du staff travaillant aujourd'hui a droit à "+(staffTipMoney)+" euros de tip.");

		JOptionPane.showMessageDialog(null,"Merci d'avoir utilisé Damien Portanier Enterprise !!");
	}
}
//ici je sais pas encore garder en mémoire l'ensemble des commandes du jour pour donner un résultat en fin de journée de tip/membre du staff présent à ce jour.

