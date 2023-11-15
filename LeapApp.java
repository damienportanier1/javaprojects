import javax.swing.JOptionPane;
public class LeapApp{
	public static void main(String[] args){
		//vars
		int year;
		String msg;
		//objects
		Leap leapChecker;
		leapChecker=new Leap();
		//inputs
		year=Integer.parseInt(JOptionPane.showInputDialog(null,"What year?"));
		//set
		leapChecker.setYear(year);
		//compute
		leapChecker.computeLeap();
		//get
		msg=leapChecker.getMsg();
		//output
		JOptionPane.showMessageDialog(null,year+" "+msg);
	}
}