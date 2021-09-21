package week3.day2;


import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "PayPal India";
		String str1= str.toLowerCase();
		char[] charArray = str1.toCharArray();

		Set<Character> charSet = new LinkedHashSet<Character>();
		Set<Character> dupCharSet = new LinkedHashSet<Character>();

		for (int i = 0; i < charArray.length; i++) {
			boolean add = charSet.add(charArray[i]);
			System.out.println("The boolean value is: " + add);

			if (add == false) {
				dupCharSet.add(charArray[i]);
			}
			
		}
		charSet.removeAll(dupCharSet);
		System.out.println("The character set is: " + charSet);
		System.out.println("The duplicate set is: " + dupCharSet);
		
		for (Character character : charSet) {
			if(character!=' ') {
				System.out.println("The final set is: "+character);
			}
		}
	}
	
	

}
