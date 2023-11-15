public class ArraySorter{
	private int[] sortedArray;
	private int positionInSortedArray;
	private int odds;
	private int evens;

	//constructor
	public ArraySorter(){
		odds=0;
		evens=0;
		positionInSortedArray=0;
	}
	//set/compute/get
	public int[] sortArray(int[] array, boolean evenOdd){
		for(int i=0;i<array.length;i++){
			if(array[i]%2==0){
				evens++;
			}
			else{
				odds++;
			}
		}
		//treating true as even, false as odd
		if(evenOdd){
			sortedArray=new int[evens];
		}
		else{
			sortedArray=new int[odds];
		}
		//sort array
		for(int i=0;i<array.length;i++){
			if(((array[i]%2==0) && (evenOdd == true)) || ((array[i]%2!=0) && (evenOdd==false))){
				sortedArray[positionInSortedArray] = array[i];
				positionInSortedArray++;
			}
		}
		return sortedArray;
	}
}