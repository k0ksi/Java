import java.util.Scanner;

public class CountSubstringOccurrences {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String text = sc.nextLine().toLowerCase();
		String sub = sc.nextLine();
		int count = 0;
		int subLength = sub.length();
		for(int i = 0; i < text.length(); i++) {
			if(sub.startsWith(Character.toString(text.charAt(i)))) {
				if(text.substring(i).length() >= subLength) {
					if(text.substring(i, i + subLength).equals(sub)) {
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}
