//code du prof//on cherche a output le plus grand nombre dans le ARRAY tableau
public class LargestApp{
	public static void main(String[] args){
		//vars
		int[] nums={2,10,4,100,6,55,66,777};
		int largest;
		//objects
		Largest l;
		l=new Largest();
		//set
		l.setNums(nums);
		//compute
		l.computeLargest();
		//get
		largest=l.getLargest();
		//output
		System.out.println(largest);
	}
}