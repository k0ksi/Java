import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MostFrequentWord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String text = sc.nextLine().toLowerCase();
		String[] words = text.split("\\W+");
		TreeMap<String, Integer> wordsCount = new TreeMap<String, Integer>();
		Integer count = 0;
		for (String word : words) {
			count = wordsCount.get(word);
			if(count == null) {
				count = 0;
			}
			wordsCount.put(word, count + 1);
		}
		int maxValueInMap = (Collections.max(wordsCount.values()));
		for(Entry<String, Integer> entry : wordsCount.entrySet()) {
			if(entry.getValue() == maxValueInMap) {
				System.out.println(entry.getKey() + " -> " + entry.getValue() + " times");
			}
		}
	}
}
