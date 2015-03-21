import java.util.Arrays;
import java.util.Scanner;

public class SortArrayOfNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String str = sc.nextLine();
		String[] strArr = str.split(" ");
		int[] array = new int[n];
		for(int i = 0; i < n; i++) {
			array[i] = Integer.parseInt(strArr[i]);
		}
		Arrays.sort(array);
		for (int i : array) {
			System.out.print(i + " ");
		}
	}
}
