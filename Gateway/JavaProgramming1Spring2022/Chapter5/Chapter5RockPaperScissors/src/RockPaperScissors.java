import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		int user;
		int computer;
		final int LOW = 1;
		final int HIGH = 3;
		computer = LOW + (int)(Math.random() * HIGH);
		String msg = "";
		String userPick = "";
		String computerPick = "";
		
		Scanner input = new Scanner(System.in);
		System.out.println("Type one of the following numbers:\n1 -- Rock" + "\n2 -- Paper\n3 -- Scissors");
		user = input.nextInt();
		
		if (user < 1 || user > 3){
			System.out.println("Invalid selection - must choose number between 1 and 3 >> ");
			user = input.nextInt();
		}
		
		 if (user == 1)
				userPick = "rock";
			else
				if (user == 2)
					userPick = "paper";
				else
					if (user == 3)
						userPick = "scissors";
			
		 if (computer == 1)
				computerPick = "rock";
			else
				if (computer == 2)
					computerPick = "paper";
				else
					if (computer == 3)
						computerPick = "scissors";
		 
		 if (user == 1)
				if (computer == 1)
					msg = "tie";
				else
					if (computer == 2)
						msg = "computer";
					else
						msg = "you";
			else
				if (user == 2)
					if (computer == 2)
						msg = "tie";
					else
						if (computer == 3)
							msg = "computer";
						else
							msg = "you";
				else
					if (computer == 3)
						msg = "tie";
					else
						if (computer == 1)
							msg = "computer";
						else
							msg = "you";
			
		 System.out.println("You picked " + userPick + "\nComputer picked " + computerPick + "\nWinner: " + msg);
	}

}
