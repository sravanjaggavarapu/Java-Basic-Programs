package duplicate;

import java.util.Arrays;

public class DuplicatesEx {

	public static void main(String[] args) {
		int[] arr = { 10, 30, 10, 20,10,20, 40, 20, 30, 24 };
		
		int[] temp = new int[arr.length];
		int j = 0;
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i+1]) 
				temp[j++] = arr[i];

		temp[j] = arr[arr.length - 1];
		}
		arr = new int[j + 1];
		for (int i = 0; i <= arr.length - 1; i++)
			arr[i] = temp[i];
		System.out.println(Arrays.toString(arr));

	}

}
