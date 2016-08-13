package player;

import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {

		System.out.println("Welcome to Rock, Paper, Scissors!");

		System.out.println("Enter your name:  ");
		Scanner scan1 = new Scanner(System.in);
		Player1 TheJets = new Player1();
		Player2 TheSharks = new Player2();
		Player3 HumanPlayer = new Player3();
		HumanPlayer.setName(scan1.nextLine());

		System.out.println("Would you like to play against TheJets or TheSharks (j/s)?");
		String userInput = scan1.nextLine();

		System.out.println("Rock, Paper, or Scissors? (R/P/S)?");
		String rpsUserInput = scan1.nextLine();

		System.out.println(HumanPlayer.getName() + ": " + rpsValidator(rpsUserInput));

		displayJorS(TheJets, TheSharks, userInput);

		if (userInput.equalsIgnoreCase("j")) {
			if (rpsValidator(rpsUserInput).equalsIgnoreCase("Rock")) {
				System.out.println("It is a Tie");
			}

			else if (rpsValidator(rpsUserInput).equalsIgnoreCase("Paper")) {
				System.out.println("Paper beats rock");
			}

			else {
				System.out.println("Rock beats Scissors");
			}
		}

		if (userInput.equalsIgnoreCase("s")) {
			if ((rpsValidator(rpsUserInput).equalsIgnoreCase("Rock")
					&& (TheSharks.returnRandom().equalsIgnoreCase("Rock")))) {
				System.out.println("It is a Tie");
			}

			else if ((rpsValidator(rpsUserInput).equalsIgnoreCase("Rock")
					&& TheSharks.returnRandom().equalsIgnoreCase("Scissors"))) {
				System.out.println("Rock beats Scissors");
			}

			else if ((rpsValidator(rpsUserInput).equalsIgnoreCase("Rock")
					&& TheSharks.returnRandom().equalsIgnoreCase("Paper"))) {
				System.out.println("Paper beats rock");
			}

			else if ((rpsValidator(rpsUserInput).equalsIgnoreCase("Paper")
					&& TheSharks.returnRandom().equalsIgnoreCase("Paper"))) {
				System.out.println("It is a Tie");
			}

			else if ((rpsValidator(rpsUserInput).equalsIgnoreCase("Paper")
					&& TheSharks.returnRandom().equalsIgnoreCase("Scissors"))) {
				System.out.println("Scissors beats paper");
			}

			else if ((rpsValidator(rpsUserInput).equalsIgnoreCase("Paper")
					&& TheSharks.returnRandom().equalsIgnoreCase("Rock"))) {
				System.out.println("Paper beats rock");
			}

			else if ((rpsValidator(rpsUserInput).equalsIgnoreCase("Scissors")
					&& TheSharks.returnRandom().equalsIgnoreCase("Paper"))) {
				System.out.println("Scissors beats paper");
			}

			else if ((rpsValidator(rpsUserInput).equalsIgnoreCase("Scissors")
					&& TheSharks.returnRandom().equalsIgnoreCase("Rock"))) {
				System.out.println("Rock beats Scissors");
			}

			else {
				System.out.println("It is a Tie");
			} // Scissors Scissors
		}
	}
	// lily: Rock 			//lily: Paper
	// The Sharks: Paper 	//The Sharks: Rock
	// It is a Tie 			//It is a Tie

	// lily: Paper
	// The Sharks: Scissors
	// Paper beats rock -- it is supposed to be Scissors beats paper

	/*
	 * if (jsValidator(userInput).equalsIgnoreCase(TheJets.getSelectR())) {
	 * System.out.println("It is a tie!"); } else if
	 * (jsValidator(userInput).equalsIgnoreCase("Paper")) {
	 * System.out.println("Paper beats rock!"); } else
	 * if(jsValidator(userInput).equalsIgnoreCase("Scissors")) {
	 * System.out.println("Rock beats scissors!"); }
	 */

	public static void displayJorS(Player1 TheJets, Player2 TheSharks, String userInput) {
		if (jsValidator(userInput).equals("The Jets")) {
			System.out.println(jsValidator(userInput) + ": " + TheJets.getSelectR());
		} else {

			System.out.println(jsValidator(userInput) + ": " + TheSharks.returnRandom());
		}
	}

	private static String jsValidator(String userInput) {
		String jsValidator = " ";
		if (userInput.equalsIgnoreCase("j")) {
			jsValidator = "The Jets";
		} else if (userInput.equalsIgnoreCase("s")) {
			jsValidator = "The Sharks";
		} else {
			jsValidator = "Invalid Input, please try again.";
		}
		return jsValidator;
	}

	public static String rpsValidator(String rpsUserInput) {

		String rpsValidator = " ";
		if (rpsUserInput.equalsIgnoreCase("R")) {
			rpsValidator = "Rock";
		} else if (rpsUserInput.equalsIgnoreCase("P")) {
			rpsValidator = "Paper";
		} else if (rpsUserInput.equalsIgnoreCase("S")) {
			rpsValidator = "Scissors";
		} else {
			rpsValidator = "Invalid Input, please try again.";
		}
		return rpsValidator;
	}
}

/*
 * System.out.println("Welcome to Rock Paper Scissors!");
 * 
 * System.out.println("Enter your name:  "); HumanPlayer player1 = new
 * HumanPlayer(); TheSharks player2 = new TheSharks(); Scanner scan1 = new
 * Scanner(System.in); player1.setName(scan1.nextLine());
 * 
 * System.out.
 * println("Would you like to play against TheJets or TheSharks(j/s)? "); String
 * userInput = scan1.nextLine();
 * 
 * String choice = "yes"; while (choice.equalsIgnoreCase("yes")) { // get input
 * from the user, process it, and display output here
 * 
 * // see if the user wants to continue
 * 
 * System.out.println("Rock, Paper, or Scissors? (R/P/S)?");
 * player1.setRoshambo(scan1.nextLine());
 * 
 * if (userInput.equalsIgnoreCase("s")) {
 * 
 * System.out.println(player1.Roshambo() + ":" + player1.getRoshambo());
 * System.out.println("The Sharks: " + player2.getRoshambo()); //player 2
 * getRoshambo is null //player 2 Roshambo peper generates whenever it is called
 * so I dont know how to display
 * 
 * //the following sysout is to test what the objects contain
 * 
 * 
 * System.out.println(
 * "------------------------------------------------------------------");
 * 
 * System.out.println("player1 Roshambo   " + player1.Roshambo());
 * 
 * System.out.println("player1 getRoshambo   " + player1.getRoshambo());
 * 
 * System.out.println("player2 Roshambo   " + player2.Roshambo());
 * 
 * System.out.println("player2 getRoshambo   " + player2.getRoshambo());
 * 
 * System.out.println(
 * "--------------------------------------------------------------------");
 * 
 * if ((player1.getRoshambo().equalsIgnoreCase("R")) &&
 * (player2.Roshambo().equalsIgnoreCase("Rock"))) {
 * System.out.println("It is a Tie"); } else if
 * ((player1.getRoshambo().equalsIgnoreCase("R")) &&
 * (player2.Roshambo().equalsIgnoreCase("Peper"))) {
 * System.out.println("Paper beats rock"); } else if
 * ((player1.getRoshambo().equalsIgnoreCase("R")) &&
 * (player2.Roshambo().equalsIgnoreCase("Scissors"))) {
 * System.out.println("Rock beats Scissors"); } if
 * ((player1.getRoshambo().equalsIgnoreCase("P")) &&
 * (player2.Roshambo().equalsIgnoreCase("Peper"))) {
 * System.out.println("It is a Tie"); } else if
 * ((player1.getRoshambo().equalsIgnoreCase("P")) &&
 * (player2.Roshambo().equalsIgnoreCase("Scissors"))) {
 * System.out.println("Scissors beats paper"); } if
 * ((player1.getRoshambo().equalsIgnoreCase("S")) &&
 * (player2.Roshambo().equalsIgnoreCase("Scissors"))) {
 * System.out.println("It is a Tie"); }
 * 
 * continue; } }
 * 
 * while (userInput.equalsIgnoreCase("j")) { if
 * (player1.getRoshambo().equalsIgnoreCase("R")) {
 * System.out.println("It is a Tie"); } else if
 * (player1.getRoshambo().equalsIgnoreCase("P")) {
 * System.out.println("Paper beats rock"); } else if
 * (player1.getRoshambo().equalsIgnoreCase("S")) {
 * System.out.println("Scissors beats paper");
 * 
 * } break;
 * 
 * }
 * 
 * System.out.print("Continue? (yes/no): "); choice = scan1.nextLine();
 * System.out.println();
 * 
 * }// yes or no while
 * 
 * }
 * 
 * // player2.printName();
 * 
 * // System.out.println(player2.Roshambo()); //
 * System.out.println(player1.getRoshambo());
 */