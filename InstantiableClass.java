/*Lab Week 9 - Software Development

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
public class InstantiableClass {
		//variables
		private String sentence; //old String
		private char msg;
		private String str; //new String
		private int intMsg;
		String stringMsg;
		private int count;
		private int letter;
		private char ch;

		//constructor (by default or modify)
		public InstantiableClass(){
			String sentence;
			char msg;
			String str;
			int intMsg;
			String stringMsg;
			int count;
			int letter;
			char ch;
			}

		//set // receive info from the App file and store it, into sentence (variable)
		public void setSentence (String sentence){
			this.sentence=sentence;
		}

		//compute - for loop that permit to look all the String sentence
		public void compute(){

//  Counts the letters and vowels
			for (int i=0 ; i<sentence.length(); i++){
				ch = sentence.charAt(i); //.charAt() method to isolate every characters in the String sentence
					if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'){
						count ++; //count ++ method to count the number of vowels
					}
					if(Character.isLetter(ch)){ //if statement + Character.isLetter () permit to isolate only letters of the characters of the String
						letter ++; //letter ++ method to count the number of letters
					}
			}

//Stores a new String that only contains every second letter
			for(int i=0;i<sentence.length();i=i+2){
				msg = sentence.charAt(i); //store every second characters (i=i+2) into char msg (variable)

				if(Character.isLetter(msg)){ //if user input is a letter (if statement + Character.isLetter method)
					str = Character.toString(msg);//convert the char msg into a String and store it into a new String str (variable)

					//output in instantiable class file the new String str
					System.out.print(str);
				}
			}
					System.out.println(" = New String that only contains every second letter"); //permit also to return to the line

//Stores the positions of each space
			for(int i=0;i<sentence.length();i++){
				if (sentence.charAt(i)==' '){//if statement + .charAt() method + boolean (==) permit to check every space in the String sentence
					intMsg=i; //store the positions of each space into intMsg (variable)

					//output in instantiable class file all the position of spaces
					System.out.println("Space at the position "+intMsg);
				}
			}
//Outputs a new String with all vowels are replaced/printed as exclamation points
			stringMsg = sentence.replaceAll("[aeiouAEIOU]", "!"); //replaceAll() method permit to replace all vowels by (,) ! //store the new String into stringMsg (variable)
		}
		//get //send info to the App file
		public int getLetter(){
			return letter;
		}
		public int getCount(){
			return count;
		}

		public String getStr(){
			return str;
		}
		public int getIntMsg(){
			return intMsg;
		}
		public String getStringMsg(){
			return stringMsg;
		}

}
/*
Other way to contains half of the letters input:
- replace the for loop by = for(int i=0;i<sentence.length()/2;i=i+1)

For contains half of the length :
- System.out.println(Stringvariable.substring(0, Stringvariable.length() / 2));
*/