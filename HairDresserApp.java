/*
 *HairDresserApp.java
 *@author L Murphy
 *10/11/16
 */

import javax.swing.JOptionPane;

public class HairDresserApp{
	public static void main(String args[]){

	//Data Members
		String service, day, length;


		HairDresser myHairDresser = new HairDresser();

		//input
		JOptionPane.showMessageDialog(null, "Welcome to the HairDresser's App.  Please enter your service followed by whether your hair is short of long");

		service = JOptionPane.showInputDialog(null, "What do you want done: i.e. cut, colour or blowdry");

		myHairDresser.setService(service);

		length = (JOptionPane.showInputDialog(null,"What length is your hair?"));
		myHairDresser.setLength(length);

		myHairDresser.compute();

		day = myHairDresser.getDay();
		JOptionPane.showMessageDialog(null,"Pop into the hairdressers on "+ day);
	}
}
