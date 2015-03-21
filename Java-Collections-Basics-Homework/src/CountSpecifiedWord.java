import java.util.Scanner;

public class CountSpecifiedWord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String text = sc.nextLine().toLowerCase();
		String word = sc.nextLine();
		String[] words = text.split("[\\d\\s.']");
		int count = 0;
		for (String string : words) {
			if(string.equals(word)) {
				count++;
			}
		}
		System.out.println(count);
	}
}
