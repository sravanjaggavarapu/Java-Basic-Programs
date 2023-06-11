package strongNumber;

import java.util.Scanner;

public class StrongNumberDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Positive Number :");
		int n = sc.nextInt();
		int OriginalNumber=n;
		int sum = 0;
		while(n>0) {
			int r=n%10;
			int fact=1;
		for (int i = r; i >0; i--) //153 1!+5!+3!==1+120+6==127
			fact = fact * i;
		sum = sum + fact;
		n=n/10;
		}
		
		if (OriginalNumber==sum)
			System.out.println(OriginalNumber + " is Strong Number");
		else
			System.out.println(OriginalNumber + " is NOT a Strong Number");
		sc.close();
		
	
	}
}
