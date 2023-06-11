package perfectnumber;

import java.util.Scanner;

public class NthPerfectNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Positive Number :");
		int n = sc.nextInt();
		System.out.println("Enter the Position of number you require :");
		int n1 = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= n; i++) {
			int sum = 0;
			for (int j = 1; j <= i / 2; j++) {
				if (i % j == 0)
					sum = sum + j;
			}
			if (sum == i)
				count++;
			if (count == n1)
				System.out.println("The number for count " + n1 + " is " + i);
		}
		sc.close();
	}

}
