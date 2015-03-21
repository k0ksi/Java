import java.util.Scanner;
import java.util.TreeSet;

public class ExtractAllUniqueWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String text = sc.nextLine().toLowerCase();
		String[] words = text.split("\\W+");
		TreeSet<String> set = new TreeSet<String>();
		for (String string : words) {
			set.add(string);
		}
		String[] outputText = (String[]) set.toArray(new String[set.size()]);
		for (String string : outputText) {
			System.out.print(string + " ");
		}
	}
}
