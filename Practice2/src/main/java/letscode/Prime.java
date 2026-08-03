package letscode;

import java.util.Scanner;

public class Prime {
	

	public static void main(String[] args) {
		Scanner ns=new Scanner(System.in);
		System.out.println("enter number");
		boolean isPrime = false;
		
		int n = ns.nextInt();
		if(n==1 || n== 2 || n == 3) {
			isPrime = true;
		}else {
			for(int i = 2; i < n; i++) {
				if(n % i == 0) {
					isPrime = false;
					break;
				} else {
					isPrime = true;
				}
			}
		}
		
		if(isPrime) {
			System.out.println("it is a prime number");
		} else {
			System.out.println("it is not the prime number ");
		}
		
	}
}
