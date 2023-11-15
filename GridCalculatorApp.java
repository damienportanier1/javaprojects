import javax.swing.JOptionPane;
public class GridCalculatorApp{
	public static void main(String[] args){
		//vars
		int[][] myGrid={{1,2,3},{4,5,6},{7,8,9}};
		int total;
		int[] rowSums;
		int[] colSums;
		//objects
		GridCalculator grid;
		grid=new GridCalculator();
		//set
		grid.setMyGrid(myGrid);
		//compute
		grid.calcSizes();
		grid.calcTotal();
		grid.calcRowSums();
		grid.calcColSums();
		//get
		total=grid.getTotal();
		rowSums=grid.getRowSums();
		colSums=grid.getColSums();
		//output
		JOptionPane.showMessageDialog(null,"The total is: "+total);
		//output rowSums
		System.out.println("Your rows, summed");
		for(int i=0;i<rowSums.length;i++){
			System.out.print(rowSums[i]+",");
		}
		//output rowSums
		System.out.println("Your cols, summed");
		for(int i=0;i<colSums.length;i++){
			System.out.print(colSums[i]+",");
		}
	}
}