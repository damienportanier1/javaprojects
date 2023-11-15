/*
Software dévelopment - Lab Week 9 - Characters & Strings
Solution myMoodle

- Counts the letters - int letterCount;

- Counts vowels - int vowelCount;

- Every second letter - String secondLetter;

- Stores the positions of each space - int[] spacePositons;

- vowels are replaced by exclamation points - String vowelExclamationString;
*/
public class ReplaceVowels{
	//vars
	private String input;
	private StringBuffer strBuff;
	private String output;
	//constructor
	public ReplaceVowels(){
		input="";
		strBuff=new StringBuffer();
	}
	//set
	public void setInput(String x){
		input=x;
	}
	//compute
	public void replaceVowels(){
		for(int i=0;i<input.length();i++){
			if(input.charAt(i)=='a' || input.charAt(i)=='e' || input.charAt(i)=='i' || input.charAt(i)=='o' || input.charAt(i)=='u'
			|| input.charAt(i)=='A' || input.charAt(i)=='E'  || input.charAt(i)=='I'  || input.charAt(i)=='O'  || input.charAt(i)=='U'){
				strBuff.append('!'); //String buffer + append here permit to replace the vowels by ! // || AltGr + 6 (french keyboard)
			}
			else{
				strBuff.append(input.charAt(i));
			}
		}
		output=strBuff.toString(); //for output is necessary to convert the String buffer into a String
	}
	//get
	public String getOutput(){
		return output;
	}
}