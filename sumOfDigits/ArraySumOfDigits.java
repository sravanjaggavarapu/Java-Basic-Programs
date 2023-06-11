package sumOfDigits;

public class ArraySumOfDigits {

	public static void main(String[] args) {
		int[] arr = { 123, 456, 789, 143, 126 };
		for (int i = 0; i <= arr.length - 1; i++) {
			int sum = 0;
			int OriginalNumber = arr[i];
			while (arr[i] > 0) {
				int r = arr[i] % 10;
				sum = sum + r;
				arr[i] = arr[i] / 10;
			}
			System.out.println("Sum of digits for element " + OriginalNumber + " in the array :" + sum);
		}

	}

}
