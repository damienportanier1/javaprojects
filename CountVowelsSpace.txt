import java.util.Scanner;
public class CountVowelsSpace {
	public static void main(String args[]){
		int count = 0;
		int space = 0;

		System.out.println("Enter a sentence :");
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();

		for (int i=0 ; i<sentence.length(); i++){
			char ch = sentence.charAt(i);
				if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'){
				count ++;
				}
				if (ch == ' '){
				space ++;
				}
		}
		System.out.println("Number of vowels in the given sentence is "+count);
		System.out.println("Number of space in the given sentence is "+space);
	}
}