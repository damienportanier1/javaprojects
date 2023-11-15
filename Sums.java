//Version SCANNER - java utility package - boucle que demande un nombre de matières à user, puis la note pour chaque matière, et donne la somme de l'ensemble des notes
import java.util.Scanner;
public class Sums {
    public static void main(String arg[]){

        Scanner in = new Scanner(System.in);
        int sum = 0;
        int note1 = 0;
        int subject;

        System.out.println("How many subjects did you take?");
		subject=in.nextInt();

        for(int i=0; i<subject ; i++){
            System.out.println("Enter your note for subject "+ (i+1));
            note1 = in.nextInt();
            sum = sum+note1;
        }

        System.out.println("The sum is "+ sum);
    }
}