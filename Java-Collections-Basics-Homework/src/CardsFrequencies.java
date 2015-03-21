import java.text.NumberFormat;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class CardsFrequencies {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		String[] cards = input.replaceAll("[♥♣♦♠]", "").split("\\s+");
		int n = cards.length;
		
		LinkedHashMap<String, Double> cardMap = new LinkedHashMap<String, Double>();
		Double count = 0.0;
		for (String card : cards) {
			count = cardMap.get(card);
			if(count == null) {
				count = 0.0;
			}
			cardMap.put(card, count + 1);
		}
		for(Entry<String, Double> entry : cardMap.entrySet()) {
			NumberFormat defaultFormat = NumberFormat.getPercentInstance();
			defaultFormat.setMinimumFractionDigits(2);
			System.out.println(entry.getKey() + " -> " + defaultFormat.format(entry.getValue() / n));
		}
	}
}
