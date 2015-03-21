import java.util.Scanner;

public class LongestIncreasingSequence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		String[] strArr = input.split(" ");
		int[] array = new int[strArr.length];
		
		for(int i = 0; i < strArr.length; i++) {
			array[i] = Integer.parseInt(strArr[i]);
		}
		
		int start = 0, bestStart = 0;
		int length = 1, bestLength = 1;
		
		System.out.print(array[0]);
		for(int i = 1; i < array.length; i++) {
			if(array[i] > array[i - 1]) {
				System.out.print(" " + array[i]);
				start = i;
				length++;
				if(length > bestLength) {
					bestLength = length;
					bestStart = start;
				}
			} else {
				System.out.print("\n" + array[i]);
				length = 1;
			}
		}
		
		System.out.print("\nLongest: ");
		for(int i = bestStart - bestLength + 1; i <= bestStart; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
