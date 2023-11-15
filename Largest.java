//code du prof//on cherche a output le plus grand nombre dans le ARRAY tableau
public class Largest{
	//vars
	private int[] nums;
	private int largest;
	//constructor
	public Largest(){

	}
	//set
	public void setNums(int[] nums){
		this.nums=nums;
	}
	//compute
	public void computeLargest(){
		largest=nums[0];
		for(int i=1;i<nums.length;i++){
			if(nums[i]>largest){
				largest=nums[i];
			}
		}
	}
	//get
	public int getLargest(){
		return largest;
	}
}