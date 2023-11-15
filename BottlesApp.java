//code du prof
public class BottlesApp{
	public static void main(String[] args){
		//output
		String lyrics;
		//object
		Bottles b;
		b=new Bottles();
		//compute
		b.computeLyrics();
		//get
		lyrics=b.getLyrics();
		//output
		System.out.println(lyrics);
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