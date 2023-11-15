//fix the code by figuring out what should be in the **** sections

/*
Lab Week 3
EggBox.java
Damien Portanier
16 10 2022
*/

public class EggBox{
	//variables
	private int eggs;
	private int boxSize;
	private int numBoxes;
	private int leftOverEggs;
	private int boxes;			//i added this two variables : boxes and leftover
	private int leftover;

	//set
	public void setEggs(int eggs){
		this.eggs=eggs;
	}
	public void setBoxSize(int boxSize){
		this.boxSize=boxSize;
	}
	//compute
	public void computeBoxes(){
		numBoxes=eggs/6;
	}
	public void computeLeftover(){
		leftOverEggs=eggs%boxSize;
	}
	//get
	public int getBoxes(){ //returntype = int because we return at EggBoxApp an integer
		return boxes;
	}
	public int getLeftover(){ //returntype = int because we return at EggBoxApp an integer
		return leftover;
	}
}