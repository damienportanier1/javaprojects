public class ArrayGenerator{
	//vars
	private int[] numbers;
	//combined method
	public int[] generate(int arraySize,int start, int end){
		numbers=new int[arraySize];
		for(int i=0; i<arraySize;i++) {
		     numbers[i]=(int)((Math.random()*(end-start+1)+start));
		}
		return numbers;
	}
}