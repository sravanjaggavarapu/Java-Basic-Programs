package primenumber;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		boolean flag = true;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				flag = false;
				break;
			}
		}
		if (flag == true) {
			System.out.println(n + " is prime");
		}
		else
			System.out.println(n + " is not a prime");
		sc.close();
	}
}

///         Other Logic For Prime Number
/* int count = 0;
		for (int i = 2; i <= n; i++) {
			if (n % i == 0)
				count++;
		}
		if (count == 1)
			System.out.println("prime");
		else
			System.out.println("NOT prime");*/