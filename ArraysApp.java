public class ArraysApp{
	public static void main(String[] args){
		//declare vars
		int[] numArray;
		int[] subSetArray;
		int max;
		int sum;
		//objects
		ArrayGenerator gen;
		gen=new ArrayGenerator();
		ArrayDetails details;
		details=new ArrayDetails();
		ArraySorter sort;
		sort=new ArraySorter();
		//generate the array
		numArray=gen.generate(10,1,10);
		//get the details of the array
		details.scanArray(numArray);
		max=details.getMax();
		sum=details.getSum();
		//subset the array into odd or even
		subSetArray=sort.sortArray(numArray,false);
		//output
		System.out.println("Your array of numbers is: ");
		for(int i=0;i<numArray.length;i++){
			System.out.print(numArray[i]+",");
		}
		System.out.println("\n-----------------------------------------------\n \n");
		System.out.println("The max number in the array is:"+max);
		System.out.println("The sum of the array is:"+sum);
		System.out.println("-----------------------------------------------\n \n");
		System.out.println("your array sorted odd/even:");
		for(int i=0;i<subSetArray.length;i++){
			System.out.print(subSetArray[i]+",");
		}

	}
}