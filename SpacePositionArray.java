/*
Software development - Lab Week 9 - Characters & Strings
Solution myMoodle

- Counts the letters - int letterCount;

- Counts vowels - int vowelCount;

- Every second letter - String secondLetter;

- Stores the positions of each space - int[] spacePositons;

- vowels are replaced by exclamation points - String vowelExclamationString;
*/
public class SpacePositionArray{
	//vars
	private String input;
	private int[] positions; // ARRAY
	//constructor
	public SpacePositionArray(){
		input="";
	}
	//set
	public void setInput(String x){
		input=x;
	}
	//compute
	public void findPositions(){
		positions=new int[input.length()]; //INITIALISE THE ARRAY //number of char in the input = number of boxes in the ARRAY position
		for(int i=0;i<input.length();i++){
			if(input.charAt(i)==' '){
				positions[i]=i; //store the position of space into the ARRAY position
			}
		}
	}
	//get //send the info the App file (no forget "public int[ ] getARRAY () {" ; check on the App file no need of [ ]
	public int[] getPositions(){
		return positions;
	}
}