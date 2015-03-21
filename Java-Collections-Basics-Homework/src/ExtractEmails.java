import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String text = sc.nextLine();
		Pattern emailPattern = Pattern.compile("[A-Z0-9.-_]+@[A-Z-.]+\\.[A-Z]{2,4}", Pattern.CASE_INSENSITIVE);
		Matcher matcher = emailPattern.matcher(text);
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
		
	}
}
