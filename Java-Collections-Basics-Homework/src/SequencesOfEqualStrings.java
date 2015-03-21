import java.util.Scanner;

public class SequencesOfEqualStrings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		String[] stringArray = input.split(" ");
		String firstStr = stringArray[0];
		System.out.print(firstStr);
		
		for(int i = 1; i < stringArray.length; i++) {
			String secondStr = stringArray[i];
			if(secondStr.equals(firstStr)) {
				System.out.print(" " + secondStr);
			} else {
				System.out.print("\n" + secondStr);
			}
			firstStr = secondStr;
		}
		
	}
}
