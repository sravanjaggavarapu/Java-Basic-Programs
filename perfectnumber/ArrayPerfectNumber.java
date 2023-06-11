package perfectnumber;

public class ArrayPerfectNumber {

	public static void main(String[] args) {
		int[] arr = { 28, 16, 8128, 496, 6 };
		for (int i = 0; i <= arr.length - 1; i++) {
			int sum = 0;
			for (int j = 1; j <= arr[i] / 2; j++) {
				if (arr[i] % j == 0)
					sum = sum + j;
			}
			if (sum == arr[i])
				System.out.println(arr[i] + " is a Perfect Number");
		}
	}
}
