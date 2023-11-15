/*
Lab Week 9 Software Development

Damien Portanier

19 11 2022

Create an app (using instan class and only the Scanner class for input) that takes in a String from a user and does the following:

Assume the String can only take letters spaces and full stops

·         Counts the letters

·         Counts vowels

·         Stores a new String that only contains every second letter

·         Stores the positions of each space

·         Outputs a new String with all vowels are replaced/printed as exclamation points

Please note: Create only 1 app class, but either create multiple instantiable classes, or multiple computes to deal with each bullet point
*/

//method
public class CountLettersVowels{
		//vars
		private String sentence;
		private int count;
		private int letter;
		private char ch;

		//constructor (by default or modify)
		public CountLettersVowels(){
			String sentence;
			int count;
			int letter;
			char ch;
			}

		//set // receive info from the App file and store it, into sentence (variable)
		public void setSentence (String sentence){
			this.sentence=sentence;
		}

		//compute - for loop, charAt & if statement permit to look what input user, pick if a character is a vowel and count it (count ++) - Character.isLetter is a method that permit to pick only letter and then count it (letter++)
		public void compute(){
			for (int i=0 ; i<sentence.length(); i++){
				ch = sentence.charAt(i);
					if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'){
						count ++;
					}
					if(Character.isLetter(ch)){
						letter ++;
					}
			}
		}

		//get //send info to the App file
		public int getLetter(){
			return letter;
		}
		public int getCount(){
			return count;
		}

}