import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DaysBetweenTwoDates {
	public static void main(String[] args) throws ParseException {
		Scanner input = new Scanner(System.in);
		
		String firstDate = input.nextLine();
		String secondDate = input.nextLine();
		SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		Date first = df.parse(firstDate);
		Date second = df.parse(secondDate);
		System.out.println(getDifferenceInDays(first, second));
	}
	
	public static long getDifferenceInDays(Date d1, Date d2) {
		long difference = (d2.getTime() - d1.getTime()) / (24 * 60 * 60 * 1000);
		return difference;
	}
}