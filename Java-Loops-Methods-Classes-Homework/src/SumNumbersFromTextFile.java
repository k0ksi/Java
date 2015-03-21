import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SumNumbersFromTextFile {
	public static void main(String[] args) throws IOException {
		try {
			Path filePath = Paths.get("Input.txt");
			Scanner input = new Scanner(filePath);
		
			ArrayList<Integer> ints = new ArrayList<>();
			int sum = 0;
			while(input.hasNext()) {
				if(input.hasNextInt()) {
					ints.add(input.nextInt());
				} 
			}
			for (Integer integer : ints) {
				sum += integer;
			}
			System.out.println(sum);
		} catch (Exception exception) {
			System.out.println("Error");
		}
	}
}