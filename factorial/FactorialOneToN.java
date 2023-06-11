package factorial;

import java.util.Scanner;

public class FactorialOneToN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Positive Number :");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			double fact = 1;
			for (int j = 1; j <= i; j++)
				fact = fact * j;
			System.out.println(i + "! = " + fact);
		}
		sc.close();
	}

}
