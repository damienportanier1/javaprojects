public class RPS{
	//vars
	private int userPick;
	private int compPick;
	private String result;
	//constructor
	public RPS(){
		userPick=0;
		compPick=(int)(Math.random()*3)+1;
		System.out.println("Comp picked: "+compPick);
		result="Something went wrong";
	}
	//set
	public void setUserPick(int userPick){
		this.userPick=userPick;
	}
	//compute
	public void playGame(){
		/*
		Rock=1
		Paper=2
		Scissors=3
		*/
		if(userPick==compPick){
			result="draw";
		}
		//user picks rock
		else if(userPick==1){
			if(compPick==2){
				result="lose";
			}
			else{
				result="win";
			}
		}
		//user picks paper
		else if(userPick==2){
			if(compPick==3){
				result="lose";
			}
			else{
				result="win";
			}
		}
		//user picks scissors
		else if(userPick==3){
			if(compPick==1){
				result="lose";
			}
			else{
				result="win";
			}
		}
	}
	//get
	public String getResult(){
		return result;
	}
}