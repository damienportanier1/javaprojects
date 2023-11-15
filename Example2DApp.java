import javax.swing.JOptionPane;
public class Example2DApp{
	public static void main(String[] args){
		//declare vars
		int[][] initialNumbers;
		initialNumbers=new int[2][3];
		double[][] finalNumbers;
		double[] sum;
		double[] avg;
		//declare objects
		Example2D e;
		e=new Example2D();
		//initialised
		for(int i=0;i<initialNumbers.length;i++){//rows
			for(int j=0;j<initialNumbers[i].length;j++){//columns
				initialNumbers[i][j]=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a number"));
			}
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
			for(int j=0;j<finalNumbers[i].length;j++){
				System.out.println("Student "+(i+1)+" result for module"+(j+1)+" is "+finalNumbers[i][j]);
			}
			JOptionPane.showMessageDialog(null,"Sum for student: "+(i+1)+" is "+ sum[i]);
			JOptionPane.showMessageDialog(null,"Average for student:"+(i+1)+" is "+avg[i]);
		}
	}
}