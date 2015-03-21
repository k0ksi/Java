import java.util.Scanner;

public class GenerateThreeLetterWords {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter input characters: ");
		String inputStr = input.nextLine();
		char[] charArray = inputStr.toCharArray();
		
		for(int i = 0; i < charArray.length; i++) {
			for(int j = 0; j < charArray.length; j++) {
				for(int k = 0; k < charArray.length; k++) {
					System.out.print(charArray[i] + "" + charArray[j] + "" + charArray[k] + " ");
				}
			}
		}
	}
}
