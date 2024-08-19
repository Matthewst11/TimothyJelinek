import java.util.Scanner;

public class CountByAnything {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter an integer to count by >>>> ");
		int num = input.nextInt();
		int count = 0;
		
		for(int i = num; i <= num * 100; i += num) {
			System.out.print(i + "  " );
			count++;
			if(count == 10) {
				System.out.println();
				count = 0;
			}
		}
		input.close();
		
	}

}
