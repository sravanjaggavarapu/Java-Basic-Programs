package SumOfFirstPVeAndLastNVe;

public class SumOfFirstPVeAndLastNVe {

	static int x;
	static int y;
	static int count;
	static int count1;

	public static void main(String[] args) {
		int[] arr = { -23, 67, -56, 2, 3, 5, -10, 6, 12, 16 };
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] > 0) {
				count = i;
				break;
			}
		}
		for (int j = arr.length - 1; j >= 0; j--) {
			if (arr[j] < 0) {
				y = arr[j];
				count1 = j;
				break;
			}
		}
		int sum = arr[count] + arr[count1];
		System.out.println(" Sum of First +Ve and Last -Ve : " + sum);

	}

}
