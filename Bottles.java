//code du prof
public class Bottles{
	//vars
	private String lyrics;
	//constructor
	public Bottles(){
		lyrics="";
	}
	//set not needed

	//compute
	public void computeLyrics(){
		for(int i=99;i>=0;i--){
			if(i>2){
				lyrics=lyrics+(i+" bottles of beer on the wall,\n");
				lyrics=lyrics+(i+" bottles of beer!\n");
				lyrics=lyrics+("Take one down,\n");
				lyrics=lyrics+("Pass it around,\n");
				lyrics=lyrics+((i-1)+" bottles of beer on the wall!\n");

			}
			else if(i==2){
				lyrics=lyrics+(i+" bottles of beer on the wall,\n");
				lyrics=lyrics+(i+" bottles of beer!\n");
				lyrics=lyrics+("Take one down,\n");
				lyrics=lyrics+("Pass it around,\n");
				lyrics=lyrics+((i-1)+" bottle of beer on the wall!\n");

			}
			else if(i==1){
				lyrics=lyrics+(i+" bottle of beer on the wall,\n");
				lyrics=lyrics+(i+" bottle of beer!\n");
				lyrics=lyrics+("Take one down,\n");
				lyrics=lyrics+("Pass it around,\n");
				lyrics=lyrics+((i-1)+" bottles of beer on the wall!\n");

			}
			lyrics=lyrics+("-------------------------------------\n");
		}
		lyrics=lyrics+("No more bottles of beer on the wall, no more bottles of beer."+"\n"+"Go to the store and buy some more, 99 bottles of beer on the wall.\n");
	}
	//get
	public String getLyrics(){
		return lyrics;
	}

}/*Escape Sequences
Escape Sequence Description
\t  Insert a tab in the text at this point.
\b  Insert a backspace in the text at this point.
\n  Insert a newline in the text at this point.
\r  Insert a carriage return in the text at this point.
\f  Insert a formfeed in the text at this point.
\'  Insert a single quote character in the text at this point.
\"  Insert a double quote character in the text at this point.
\\  Insert a backslash character in the text at this point.*/