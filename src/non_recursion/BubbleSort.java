package non_recursion;
import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(new BubbleSort().sort(new int[] { 1, 8, 5, 10, 2 })));
	}

	public int[] sort(int[] num) {

		boolean condition;

		do {
			condition = false;
			for (int i = 0; i < num.length - 1; i++) {
				if (num[i] > num[i + 1]) {

					int temp = num[i];
					num[i] = num[i + 1];
					num[i + 1] = temp;

					condition = true;
				}
			}

		} while (condition == true);

		return num;
	}
}



