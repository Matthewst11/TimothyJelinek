import java.util.Scanner;

public class StudentSurvey {

	public static Scanner input = new Scanner(System.in);
	public static Question question[] = new Question[4];
	
	public static void main(String[] args) {
		createQuestions();
		int choice = 0;
		while (choice != 4) {
			displayMenu();
			choice = getUserChoice();
			if(choice == 1) {
				displaySurvey();
			}
			else if (choice == 2) {
				displayResults();
			}
			else if (choice == 3) {
				editOptions();
			}
		}
		System.out.println("");
		System.out.println("Thank you for participating! Good bye.");
		}

	private static void editOptions() {
		int choice = 0;
		input.nextLine();
		System.out.print("Password Required >> ");
		String password = input.nextLine();
		int tries = 1;
		while(tries != 3 && !password.equals("password")) {
			System.out.println("Incorrect password.....");
			System.out.print("Please re-enter password >>");
			password = input.nextLine();
			tries++;
		}
		if(tries == 3) {
			choice = 4;
			System.out.println("\nNot Authorized to Edit!\n");
		}
		while (choice != 4) {
			displayEditMenu();
			choice = getUserChoice();
			switch(choice) {
				case 1:
					editQuestions();
					break;
				case 2:
					displayResults();
					break;
				case 3:
					for(int i = 0; i < question.length; i++) {
						question[i].clearTallies();
					}
					System.out.println("\nTallies cleared\n");
					break;
			}
		}
	}

	private static void editQuestions() {
		int choice = 0;
		while (choice != 5) {
			System.out.println("");
			System.out.println("Select the question to edit.");
			System.out.println("");
			System.out.println("1. " + question[0].getQuestion());
			System.out.println("2. " + question[1].getQuestion());
			System.out.println("3. " + question[2].getQuestion());
			System.out.println("4. " + question[3].getQuestion());
			System.out.println("5. Exit");
			System.out.println("");
			System.out.print("Enter question number >> ");
			choice = input.nextInt();
			while (choice < 1 || choice > 5) {
				System.out.println("");
				System.out.println("Invalid entry. Try again.");
				System.out.print("Please enter your choice 1-5 >> ");
				choice = input.nextInt();
			}
			if(choice != 5) {
				changeQuestions(choice - 1);
			}
			else {
				System.out.println("Edit complete");
			}
		}
		
	}

	private static void changeQuestions(int x) {
		String Q, A1, A2, A3, A4;
		System.out.println("\nEnter the new question: ");
		input.nextLine();
		Q = input.nextLine();
		System.out.println("enter answer 1: ");
		A1 = input.nextLine();
		System.out.println("enter answer 2: ");
		A2 = input.nextLine();
		System.out.println("enter answer 3: ");
		A3 = input.nextLine();
		System.out.println("enter answer 4: ");
		A4 = input.nextLine();
		question[x].setQuestion(Q);
		question[x].setAnswer1(A1);
		question[x].setAnswer2(A2);
		question[x].setAnswer3(A3);
		question[x].setAnswer4(A4);
		
	}

	private static void displayEditMenu() {
		System.out.println("");
		System.out.println("--------------------------");
		System.out.println("        EDIT MENU");
		System.out.println("--------------------------");
		System.out.println("1. Edit Questions");
		System.out.println("2. View Tallies");
		System.out.println("3. Clear Tallies");
		System.out.println("4. Exit");
		System.out.println("");
		System.out.print("Please enter your choice (1-4) >> ");

		
	}

	private static void displayResults() {
		System.out.println("");
		System.out.println("SURVEY RESULTS:");
		for (int i = 0; i < question.length ; i++){
			System.out.println("");
			System.out.println("Question " + (i + 1) + ": ");
			System.out.println(question[i].getQuestion());
			System.out.println("1. " + question[i].getAnswer1());
			System.out.println("2. " + question[i].getAnswer2());
			System.out.println("3. " + question[i].getAnswer3());
			System.out.println("4. " + question[i].getAnswer4());
			question[i].displayTallies();
			System.out.println("");

		}

		}

	private static void displaySurvey() {
		int choice;
		for(int i = 0; i < question.length; i++) {
			System.out.println("");
			System.out.println("Question " + (i + 1) + ": ");
			System.out.println(question[i].getQuestion());
			System.out.println("1. " + question[i].getAnswer1());
			System.out.println("2. " + question[i].getAnswer2());
			System.out.println("3. " + question[i].getAnswer3());
			System.out.println("4. " + question[i].getAnswer4());
			System.out.println("");
			choice = getUserChoice();
			question[i].addToTotal(choice);
		}
		System.out.println("");
		System.out.println("Thank you for taking the survey.");
		System.out.println("");
		
	}

	private static int getUserChoice() {
		int userChoice = input.nextInt();
		while (userChoice < 1 || userChoice > 4) {
			System.out.println("");
			System.out.println("Invalid entry.  Try again.");
			System.out.print("Please enter your choice (1-4) >> ");
			userChoice = input.nextInt();
		}
		return userChoice;
	}

	private static void displayMenu() {
		System.out.println("***************************");
		System.out.println("*    YOUR VOTE COUNTS     *");
		System.out.println("* Student Survey Program  *");
		System.out.println("***************************");
		System.out.println("");
		System.out.println("---------------------------");
		System.out.println("        MAIN MENU");
		System.out.println("---------------------------");
		System.out.println("1. Take the Survey");
		System.out.println("2. View Tallies");
		System.out.println("3. Edit Questions");
		System.out.println("4. Exit");
		System.out.println("");
		System.out.print("Please enter your choice (1-4) >> ");

		
	}

	private static void createQuestions() {
		Question ques1 = new Question();
		Question ques2 = new Question();
		Question ques3 = new Question();
		Question ques4 = new Question();
		
		question[0] = ques1;
		question[1] = ques2;
		question[2] = ques3;
		question[3] = ques4;
		
		String Q1 = "What is your favorite cereal?";
		String Q1A1 = "Captain Crunch";
		String Q1A2 = "Corn Flakes";
		String Q1A3 = "Rice Krispies";
		String Q1A4 = "Fruit Loops";
		
		String Q2 = "What is the most important issue for the next president?";
		String Q2A1 = "The economy";
		String Q2A2 = "Terrorism";
		String Q2A3 = "Climate Change";
		String Q2A4 = "China";

		String Q3 = "What is the biggest threat to our country?";
		String Q3A1 = "War";
		String Q3A2 = "Covid";
		String Q3A3 = "China";
		String Q3A4 = "Pokemon";

		String Q4 = "What is your favorite color?";
		String Q4A1 = "Green";
		String Q4A2 = "Blue";
		String Q4A3 = "Red";
		String Q4A4 = "Orange";

		question[0].setQuestion(Q1);
		question[0].setAnswer1(Q1A1);
		question[0].setAnswer2(Q1A2);
		question[0].setAnswer3(Q1A3);
		question[0].setAnswer4(Q1A4);
		
		question[1].setQuestion(Q2);
		question[1].setAnswer1(Q2A1);
		question[1].setAnswer2(Q2A2);
		question[1].setAnswer3(Q2A3);
		question[1].setAnswer4(Q2A4);

		question[2].setQuestion(Q3);
		question[2].setAnswer1(Q3A1);
		question[2].setAnswer2(Q3A2);
		question[2].setAnswer3(Q3A3);
		question[2].setAnswer4(Q3A4);

		question[3].setQuestion(Q4);
		question[3].setAnswer1(Q4A1);
		question[3].setAnswer2(Q4A2);
		question[3].setAnswer3(Q4A3);
		question[3].setAnswer4(Q4A4);

		
	}

}
