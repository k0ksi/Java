import java.util.Scanner;

public class CountAllWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		String[] words = input.split("[\\d\\s.']");
		System.out.println(words.length);
	}
}
