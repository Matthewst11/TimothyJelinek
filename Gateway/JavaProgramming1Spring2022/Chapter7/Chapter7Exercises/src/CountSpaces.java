
public class CountSpaces {

	public static void main(String[] args) {
		String aString = 
			       "The best and most beautiful things in the world cannot be seen or even touched - they must be felt with the heart.";
		int numSpaces = 0;
		int stringLength = aString.length();
		
		for(int i = 0; i < stringLength; i++) {
			char ch = aString.charAt(i);
			if(ch == ' ') {
				numSpaces++;
			}
		}
		System.out.println("The number of spaces is " + numSpaces);

	}

}
