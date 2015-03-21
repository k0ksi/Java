import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CombineListsOfLetters {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String firstList = sc.nextLine().replace(" ", "");
		String secondList = sc.nextLine().replace(" ", "");
		char[] secondListArr = secondList.toCharArray();
		
		ArrayList<Character> l1 = new ArrayList<Character>();
		for(char c : firstList.toCharArray()) {
			l1.add(c);
		}
		ArrayList<Character> l2 = new ArrayList<Character>();
		for(char c: secondListArr) {
			l2.add(c);
		}
		ArrayList<Character> l3 = new ArrayList<Character>();
		l3.addAll(l1);
		for(char c : secondListArr) {
			if(!l1.contains(c)) {
				l3.add(c);
			}
		}
		
		for (Character c : l3) {
			System.out.print(c + " ");
		}
	}
}
