package Ch6Ex6;

public class Perfect {

	public static void main(String[] args) {
	
		for (int Number=1; Number<=1000; Number++){
			int sum=0;
			for(int i=1; i<Number; i++) {
				if(Number % i == 0) {
					sum += i;
				}
			}
			if(sum == Number) {
				System.out.println(Number);
				
			}
			
		}

	}

}
