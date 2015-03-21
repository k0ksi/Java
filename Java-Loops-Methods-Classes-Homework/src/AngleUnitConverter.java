import java.util.Scanner;

public class AngleUnitConverter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		double[] numbers = new double[n];
		String[] measures = new String[n];
		for(int i = 0; i < n; i++) {
			numbers[i] = input.nextDouble();
			measures[i] = input.next("\\w+");
		}
		for(int i = 0; i < n; i++) {
			if(measures[i].equals("deg")) {
				convertToRadians(numbers[i]);
			} else if (measures[i].equals("rad")) {
				convertToDegrees(numbers[i]);
			} else {
				System.out.println("Invalid input!");
			}
		}
	}
	
	public static void convertToRadians(double degrees) {
		double radians = Math.toRadians(degrees);
		System.out.printf("%.6f rad\n", radians);
	}
	
	public static void convertToDegrees(double radians) {
		double degrees = Math.toDegrees(radians);
		System.out.printf("%.6f deg\n", degrees);
	}
}
