package non_recursion;

public class LinearSearch {
	public static void main(String[] at) {
		int[] numbers = { 4, 5, 3, 2, 10, 50 };
		int find = 50;

		int foundPosition = new LinearSearch().linearSearch(numbers, find);
		
		if ( foundPosition != 0) {
			System.out.println("iteam Found in = " + foundPosition + " position");
		} else {
			System.out.println("Invalid number");
		}
	}

	public int linearSearch(int[] num, int findValue) {
		int leng = num.length;
		for (int i = 0; i < leng; i++) {
			if (findValue == num[i]) {
				return i + 1;
			}
		}
		return 0;
	}
}
