import java.util.Scanner;

public class SymmetricNumbersInRange {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the range (two numbers between 0 and 999): ");
		String firstNumStr = input.next("\\w++");
		String secondNumStr = input.next("\\w++");
		int start = Integer.parseInt(firstNumStr);
		int end = Integer.parseInt(secondNumStr);
		
		for(int i = start; i <= end; i++) {
			if(isSymmetric(i)) {
				System.out.print(i + " ");
			}
		}
	}
	
	public static boolean isSymmetric(int num) {
		if(num >= 0 && num < 10) {
			return true;
		} else if(num >= 10 && num < 100) {
			
			int firstDigit = num / 10;
			int secondDigit = num % 10;
			if(firstDigit == secondDigit) {
				return true;
			} else {
				return false;
			}
		} else if(num >= 100 && num < 1000) {
			
			int first = num / 100;
			int third = num % 10;
			if(first == third) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}
