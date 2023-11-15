//code du prof
import javax.swing.JOptionPane;
public class AddApp{
	public static void main(String[] args){
		//vars
		double sum=0;
		int repeat=3;
		double average;
		String grade;
		//objects
		Add a;
		a=new Add();
		//input/add
		for(int i=0;i<repeat;i=i+1){
			sum=sum+Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter number "+(i+1)));
		}
		//set
		a.setSum(sum);
		a.setRepeat(repeat);
		//compute
		a.computeAverage();
		a.computeGrade();
		//get
		average=a.getAverage();
		grade=a.getGrade();
		//output
		JOptionPane.showMessageDialog(null,"Your average result is: "+average);
		JOptionPane.showMessageDialog(null,"This means your grade is: "+grade);
	}
}