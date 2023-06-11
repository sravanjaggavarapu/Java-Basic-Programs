package sumOfDigits;

import java.util.Scanner;

public class SumOfDigitsOneToN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Positive Number :");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			int sum = 0;
			int OriginalNumber = i;
			while (OriginalNumber > 0) {
				int r = OriginalNumber % 10;
				sum = sum + r;
				OriginalNumber = OriginalNumber / 10;
			}
			System.out.println("The Sum of Digits of number " + i + " is :" + sum);
		}
		sc.close();
	}

}
