import javax.swing.JOptionPane;
public class NightOutApp{
	public static void main(String[] args){
		//vars
		int yearOfStudy;
		String programmeCode;
		String venueMsg;
		//objects
		NightOut party;
		party=new NightOut();
		//input
		yearOfStudy=Integer.parseInt(JOptionPane.showInputDialog(null,"What year are you in?"));
		programmeCode=JOptionPane.showInputDialog(null,"What is your course code eg HDAIML");
		//set
		party.setYearOfStudy(yearOfStudy);
		party.setProgrammeCode(programmeCode);
		//compute
		party.computeVenue();
		//get
		venueMsg=party.getVenue();
		//output
		JOptionPane.showMessageDialog(null,venueMsg);
	}
}