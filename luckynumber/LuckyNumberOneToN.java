package luckynumber;

import java.util.Scanner;

public class LuckyNumberOneToN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Positive Number :");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) 
		{
			int sum = 0;
			int OriginalNumber = i;
			while (OriginalNumber > 0) 
			{
				int r = OriginalNumber % 10;
				sum = sum + r;
				OriginalNumber = OriginalNumber / 10;
			}
			int sum1 = 0;
			while (sum > 0) 
			{
				int r1 = sum % 10;
				sum1 = sum1 + r1;
				sum = sum / 10;
			}
			int x=sum1;
			if(sum1==x)
				System.out.println("Lucky Number "+i+" is "+sum1);
		}
		
		sc.close();
	}
}
