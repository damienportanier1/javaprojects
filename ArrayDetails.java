public class ArrayDetails{
	//vars
	private int sum;
	private int max;
	//constructor
	public ArrayDetails(){
		sum=0;
	}
	//combined set/compute method
	public void scanArray(int[] array){
		max=array[0];
		for(int i=0;i<array.length;i++){
		    sum=sum+array[i];
		    if(array[i]>max){
				max=array[i];
			}
		}
	}
	public int getSum(){
		return sum;
	}
	public int getMax(){
		return max;
	}
}