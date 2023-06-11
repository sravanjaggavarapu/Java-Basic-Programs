package primenumber;

import java.util.Scanner;

public class PrimeOneToN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a positive number :");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			if (i >= 2) {
				boolean flag = true;
				for (int j = 2; j <= i / 2; j++) {
					if (i % j == 0) {
						flag = false;
						break;
					}
				}
				if (flag == true)
					System.out.println(i + " is prime");
				else
					System.out.println(i + "  --------> NOT PRIME ");
			}
				else
					System.out.println(i + "  --------> NOT PRIME ");
			}
        sc.close();
		}
	}


