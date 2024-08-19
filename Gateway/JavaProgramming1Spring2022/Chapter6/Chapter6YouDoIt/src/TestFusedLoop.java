import java.time.*;

public class TestFusedLoop {

	public static void main(String[] args) {
		int startTime, endTime;
		int x;
		final int REPEAT = 5_000_000;
		final int FACTOR = 1_000_000;
		LocalDateTime now;
		now = LocalDateTime.now();
		startTime = now.getNano();
		
		for(x = 0; x < REPEAT; ++x) 
			method1();
		for(x = 0; x < REPEAT; ++x)
			method2();
		
		now = LocalDateTime.now();
		endTime = now.getNano();
		System.out.println("Time for loops executed seperately:" + ((endTime - startTime) / FACTOR) + " milliseconds");
		
		now = LocalDateTime.now();
		startTime = now.getNano();
		for(x = 0; x < REPEAT; ++x) {
			method1();
			method2();
		}
		now = LocalDateTime.now();
		endTime = now.getNano();
		System.out.println("Time for loops executed in a block: " + ((endTime - startTime) / FACTOR) + " milliseconds");
		
		
		

	}

	private static void method1() {
		
		
	}

	private static void method2() {
		
		
	}

}
