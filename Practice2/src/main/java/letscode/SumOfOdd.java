package letscode;

import java.util.Scanner;

public class SumOfOdd {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter Your Number :");
	int n = sc.nextInt();
	int sum=0;
	for(int i=0;i<=n;i++) {
		if(i%2 !=0) {
			sum +=i;
		}
	}
	System.out.println("Sum of Odd Number is:"+sum);
}
}
