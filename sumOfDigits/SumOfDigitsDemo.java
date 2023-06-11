package sumOfDigits;

import java.util.Scanner;

public class SumOfDigitsDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Positive Number :");
		int n = sc.nextInt();
		int OriginalNumber = n;
		int sum = 0;
		while (n > 0) {
			int r = n % 10;
			sum = sum + r;
			n = n / 10;
		}
		System.out.println("Sum of digits of number " + OriginalNumber + " is " + sum);
		sc.close();

	}

}
