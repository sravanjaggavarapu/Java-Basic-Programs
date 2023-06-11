package luckynumber;

import java.util.Scanner;

public class LuckyNumberDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Positive Number :");
		int n = sc.nextInt();
		int sum = 0;
		while (n > 0) {
			int r = n % 10;
			sum = sum + r;
			n = n / 10;
		}
		int sum1 = 0;
		while (sum > 0) {
			int r1 = sum % 10;
			sum1 = sum1 + r1;
			sum = sum / 10;
		}
		System.out.println("Lucky Number : " + sum1);
		sc.close();

	}

}
