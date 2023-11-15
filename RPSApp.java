import javax.swing.JOptionPane;
public class RPSApp{
	public static void main(String[] args){
		//vars
		int userPick;
		String result;
		//objects
		RPS game;
		game=new RPS();
		//input
		//options
		String[] options = {"Rock", "Paper", "Scissors"};
		userPick=JOptionPane.showOptionDialog(null, "Choose from the below","Let's play!",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
		userPick=userPick+1;
		//set
		game.setUserPick(userPick);
		//compute
		game.playGame();
		//get
		result=game.getResult();
		//output
		JOptionPane.showMessageDialog(null,"You "+result);

	}
}
