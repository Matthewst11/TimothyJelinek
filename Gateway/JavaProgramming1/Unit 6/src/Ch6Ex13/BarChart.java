package Ch6Ex13;

import java.util.Scanner;

public class BarChart {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int artPoints;
		int bobPoints;
		int calPoints;
		int danPoints;
		int eliPoints;
		final int POINTS_PER_ASTERISK = 1;
		System.out.print("Enter points earned for the game");
		System.out.println();
		System.out.print(" by Art>>");
		artPoints = input.nextInt();
		System.out.print(" by Bob>>");
		bobPoints = input.nextInt();
		System.out.print(" by Cal>>");
		calPoints = input.nextInt();
		System.out.print(" by Dan>>");
		danPoints = input.nextInt();
		System.out.print(" by Eli>>");
		eliPoints = input.nextInt();
		System.out.println("Points for the game\n");
		drawChart("Art", artPoints, POINTS_PER_ASTERISK);
		drawChart("Bob", bobPoints, POINTS_PER_ASTERISK);
		drawChart("Cal", calPoints, POINTS_PER_ASTERISK);
		drawChart("Dan", danPoints, POINTS_PER_ASTERISK);
		drawChart("Eli", eliPoints, POINTS_PER_ASTERISK);
	}
	public static void drawChart(String name, int points, int POINTS_PER_ASTERISK) {
		System.out.print(name + "   ");
		for(int i=0; i<points/POINTS_PER_ASTERISK;i++) {
			
		System.out.print("*");
	}
		System.out.println();
	}

}
