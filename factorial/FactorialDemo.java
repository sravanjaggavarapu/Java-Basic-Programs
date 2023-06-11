package factorial;

import java.util.Scanner;

public class FactorialDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Positive Number :");
		int n = sc.nextInt();
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		// System.out.println("Factorial of " + n + " is " + fact);
		System.out.println(n + "! = " + fact);
		sc.close();
	}

}
