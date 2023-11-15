import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Rock, Paper, Scissors!");
        System.out.println("Enter your choice (rock, paper, scissors): ");
        String userChoice = scanner.nextLine();

        // Generate computer's choice
        int computerChoice = rand.nextInt(3); // 0 = rock, 1 = paper, 2 = scissors
        String computerChoiceString = "";
        switch (computerChoice) {
            case 0:
                computerChoiceString = "rock";
                break;
            case 1:
                computerChoiceString = "paper";
                break;
            case 2:
                computerChoiceString = "scissors";
                break;
        }

        // Determine the winner
        if (userChoice.equalsIgnoreCase(computerChoiceString)) {
            System.out.println("It's a tie!");
        } else if (userChoice.equalsIgnoreCase("rock")) {
            if (computerChoiceString.equals("scissors")) {
                System.out.println("You win! Rock beats scissors.");
            } else {
                System.out.println("You lose! Paper beats rock.");
            }
        } else if (userChoice.equalsIgnoreCase("paper")) {
            if (computerChoiceString.equals("rock")) {
                System.out.println("You win! Paper beats rock.");
            } else {
                System.out.println("You lose! Scissors beats paper.");
            }
        } else if (userChoice.equalsIgnoreCase("scissors")) {
            if (computerChoiceString.equals("paper")) {
                System.out.println("You win! Scissors beats paper.");
            } else {
                System.out.println("You lose! Rock beats scissors.");
            }
        } else {
            System.out.println("Invalid choice. Please enter 'rock', 'paper', or 'scissors'.");
        }
    }
}
