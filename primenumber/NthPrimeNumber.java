package primenumber;

import java.util.Scanner;

public class NthPrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a positive number :");
		int n = sc.nextInt();
		System.out.println("Enter the position of number you want : ");
		int n1 = sc.nextInt();
		int count = 0;
		
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
					count++;
				if (n1 == count) {
					System.out.println("The number for count of " + n1 + " is " + i);
					break;
				}
			}
		}
		sc.close();
	}

}
