import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RandomHandsOfFiveCards {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		generateFiveRandomCards(n);
	}
	
	public static void generateFiveRandomCards(int n) {
		ArrayList<String> cards = new ArrayList<String>();
		
		String[] faces = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
		char[] suits = { '\u2663', '\u2666', '\u2665', '\u2660' };
		
		for(int i = 0; i < faces.length; i++) {
			for(int j = 0; j < suits.length; j++) {
				cards.add(faces[i] + suits[j]);
			}
		}
		
		for(int i = 0;i < n; i++){
			Collections.shuffle(cards);
			ArrayList<String> fiveCards = new ArrayList<>(cards.subList(0, 5));
			System.out.println(fiveCards.toString().replace('[', ' ').replace(']', ' ').replaceAll(",", "").trim());
		}
	}
}
