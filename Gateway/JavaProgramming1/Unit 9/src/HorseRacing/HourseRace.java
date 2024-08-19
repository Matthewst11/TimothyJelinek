package HorseRacing;

import java.util.Scanner;

public class HourseRace {

	public static void main(String[] args) {
		Scanner hrse = new Scanner(System.in);
		int[][] race = new int[4][5];
		race = generateRuns();
		
		displayResults(race);

		System.out.println("Pick a horse #[1,2,3,4]: ");
		int horse = hrse.nextInt();
		   calculateWins(race,horse);



		}

		public static int[][] generateRuns(){
		int[][] race = {{1,0,2,2,3},{2,1,3,1,1},{3,2,0,3,0},{0,2,1,0,2}}; 
		return race;
		}

		public static void calculateWins(int[][] race,int horse){
		int firstPlace,secondPlace,thirdPlace,noPlace;
		   firstPlace=secondPlace=thirdPlace=noPlace =0;
		  
		for(int j=0;j<5;j++){
		if(race[horse-1][j] == 1) 
		firstPlace++;
		else if(race[horse-1][j] == 2)
		secondPlace++;
		else if(race[horse-1][j] == 3)
		thirdPlace++;
		else
		noPlace++;
		}
		
		System.out.println("-------------------------------");
		System.out.println("First Place :\t"+ firstPlace);
		System.out.println("Second Place :\t"+ secondPlace);
		System.out.println("Third Place :\t"+ thirdPlace);
		System.out.println("Did not Place :\t"+ noPlace);
		System.out.println("-------------------------------");

		}

		public static void displayResults(int[][] race){
		System.out.println("Horse Race Results");
		System.out.println("-------------------------------");
		System.out.println("          1 2 3 4 5");
		System.out.println("-------------------------------");
		
		for(int i=0;i<4;i++){
		
		System.out.print("Horse #"+(i+1)+" |");
		for(int j=0;j<5;j++){
		System.out.print(race[i][j]+" ");
		}
		System.out.println();
		}

		System.out.println("-------------------------------");

		}
		}

		