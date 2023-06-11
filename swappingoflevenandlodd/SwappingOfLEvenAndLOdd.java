package swappingoflevenandlodd;

import java.util.Arrays;

public class SwappingOfLEvenAndLOdd {
	static int count;
	static int count1;

	public static void main(String[] args) {
		int[] arr = { 23, 67, 56, 2, 3, 5, 10, 6, 12, 16 };
		for (int i = arr.length - 1; i >= 0; i--) {
			while (arr[i] % 2 == 0) {
			i++;
			break;
			}
		for (int j = arr.length-1; j >= 0; j--) {
			while (arr[j] % 2 != 0) {
				j++;
			break;
			}
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		}
		}
			System.out.println(Arrays.toString(arr));

	}

}









/*
 * if (arr[i] % 2 == 0) { count = i; break; } } for (int j = arr.length - 1; j
 * >= 0; j--) { if (arr[j] % 2 != 0) { count1 = j; break; } } int temp =
 * arr[count]; arr[count] = arr[count1]; arr[count1] = temp;
 */
