//fix the code by figuring out what should be in the **** sections

/*
Lab Week 3
EggBoxApp.java
Damien Portanier
16 10 2022
*/

import javax.swing.JOptionPane;
public class EggBoxApp{
	public static void main(String[] args){
		//variables
		int eggs;
		int boxSize;
		int numBoxes;
		int leftOverEggs;

		//objects - nameInitialClassFile+namecopyobject; namecoyeobject=new+nameInitialClassFile();
		EggBox egg;
		egg=new EggBox();

		//inputs
		eggs=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a number of eggs"));
		boxSize=6;

		//setmethod - namecopyobject.namesetINSTANTIABLE(what user input);
		egg.setEggs(eggs);
		egg.setBoxSize(boxSize);

		//compute - namecopyobject.namecomputeINSTANTIABLE();
		egg.computeBoxes();
		egg.computeLeftover();

		//get - nameresult=namecopyobject.namegetINSTANTIABLE();
		numBoxes=egg.getBoxes();
		leftOverEggs=egg.getLeftover();

		//output- MessageDialogBox or println
		JOptionPane.showMessageDialog(null,"Number of boxes needed "+numBoxes);
		JOptionPane.showMessageDialog(null,"Number of eggs left over "+leftOverEggs);
	}
}