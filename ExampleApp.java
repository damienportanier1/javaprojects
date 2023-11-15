import javax.swing.JOptionPane;
public class ExampleApp{
	public static void main(String[] args){
		//declare vars
		int[] initialNumbers;
		initialNumbers=new int[3];
		int[] finalNumbers;
		int sum;
		double avg;

		//declare objects
		Example e;
		e=new Example();
		//initialised
		for(int i=0;i<initialNumbers.length;i++){
			initialNumbers[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a number"));
		}
		//set
		e.setInitialNumbers(initialNumbers);
		//compute
		e.computeFinalNumbers();
		//get
		finalNumbers=e.getFinalNumbers();
		sum=e.getSum();
		avg=e.getAvg();
		//output
		for(int i=0;i<finalNumbers.length;i++){
			JOptionPane.showMessageDialog(null,finalNumbers[i]);
		}
		JOptionPane.showMessageDialog(null,"Sum is: "+ sum);
		JOptionPane.showMessageDialog(null,"Average is: "+avg);

	}
}