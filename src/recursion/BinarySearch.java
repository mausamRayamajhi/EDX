package recursion;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		new BinarySearch().binarySearch(numbers, 10);
	}

	public boolean binarySearch(int[] num, int findValue) {
		int firstNumber = 1;
		int lastNumber = num.length;

		int median = ((firstNumber + lastNumber) / 2);
		System.out.println("Medain = " + median);

		if (findValue == num[median - 1]) {
			System.out.println("Iteam Found = " + num[median - 1]);
			return true;

		} else if (findValue < num[median - 1]) {

			int[] newArr = new int[median];

			int copyMedian = median;
			for (int i = 0; i < median; i++) {
				if (copyMedian != 0) {
					int a = num[i];
					newArr[i] = a;
					copyMedian--;
				}

			}
			System.out.println("New array = " + Arrays.toString(newArr));
			return binarySearch(newArr, findValue);
		} else {

			int[] newArr = new int[num.length - median];
			int copyMedian = median;
			System.out.println("copyMedian = " + copyMedian);
			int index = 0;
			for (int i = median; i < num.length; i++) {

				if (copyMedian != 0) {
					int a = num[i];
					newArr[index] = a;
					index++;
					copyMedian--;
				}

			}
			System.out.println("New array = " + Arrays.toString(newArr));
			return binarySearch(newArr, findValue);
		}

	}
}
