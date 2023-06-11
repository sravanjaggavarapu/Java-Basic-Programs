package strongNumber;

import java.util.Scanner;

public class NthStrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Positive Number :");
		int n = sc.nextInt();
		System.out.println("Enter a count you want :");
		int n1 = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= n; i++) {
			int sum = 0;
			int OriginalNumber = i;
			while (i > 0) {
				int r = i % 10;
				int fact = 1;
				for (int j = r; j > 0; j--)
					fact = fact * j;

				sum = sum + fact;
				i = i / 10;

			}
			if (sum == OriginalNumber)
				count++;
			
			if (count == n1) {
				System.out.println(OriginalNumber);
				break;
			}
			i = OriginalNumber;
		}
		
		sc.close();

	}

}
