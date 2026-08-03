import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int n = sc.nextInt();
		boolean isPrime=false;
		if(n==1 || n==2 || n==3) {
			isPrime=true;
		}else {
			for(int i=2;i<n;i++) {
				if(n%i==0) {
					break;
				}else {
				isPrime=false;
			}
		}
		
	}
		System.out.println(isPrime);
	}
}
