public class GridCalculator{
	//vars
	private int[][] myGrid;
	private int[] rowSums;
	private int[] colSums;
	private int total;
	private int numRows,numCols;
	private int tempRow,tempCol;

	//set
	public void setMyGrid(int[][] myGrid){
		this.myGrid=myGrid;
	}
	//compute
	public void calcSizes(){
		numRows=myGrid.length;
		numCols=myGrid[0].length;
		rowSums=new int[numRows];
		colSums=new int[numCols];
	}
	public void calcTotal(){
		total=0;
		for(int i=0;i<numRows;i++){
			for(int j=0;j<numCols;j++){
				total=total+myGrid[i][j];
			}
		}
	}
	public void calcRowSums(){
		//rowSums;
		for(int i=0;i<numRows;i++){
			tempRow=0;
			for(int j=0;j<numCols;j++){
				tempRow=tempRow+myGrid[i][j];
			}
			rowSums[i]=tempRow;
		}
	}
	public void calcColSums(){
		//colSums;
		for(int i=0;i<numRows;i++){
			tempCol=0;
			for(int j=0;j<numCols;j++){
				tempCol=tempCol+myGrid[j][i];
			}
			colSums[i]=tempCol;
		}
	}

	//get
	public int[] getRowSums(){
		return rowSums;
	}
	public int[] getColSums(){
		return colSums;
	}
	public int getTotal(){
		return total;
	}
}