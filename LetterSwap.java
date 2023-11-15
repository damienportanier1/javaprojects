/*
Week 10
LetterSwap.java
Lisa Murphy
28 11 2022
*/

public class LetterSwap{
	//vars
	private String word; //variable to take the input user
	private StringBuffer strBuff; //save word (variable) modified
	private String newWord; //save the output

	//constructor (4 marks for the exam)
	public LetterSwap(){
		word="";
		newWord="";
		strBuff=new StringBuffer();
	}

	//set
	public void setWord(String word){
		this.word=word;
	}

	//compute - here the order of the step are very important because append = add to the end
	public void compute(){
		//step 1 - get the last character (position length-1) from the String word and append (= add to the end) it to the StringBuffer
		strBuff.append(word.charAt(word.length()-1));//-1 because ex length of 2 = char position are 0 and 1

		//step 2 - (for loop between 2nd char to the last char of length) get the 2nd char (position 1) until the last character (end of length)
		for(int i=1;i<word.length()-1;i++){
			strBuff.append(word.charAt(i));
		}
		//step 3 - Add the first character of String word into the StringBuffer at the end (append = add to the end)
		strBuff.append(word.charAt(0));

		//step 4 - convert back to a String again
		newWord=strBuff.toString();
	}

	//get
	public String getNewWord(){
		return newWord;
	}


}