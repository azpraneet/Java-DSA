import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int n = sc.nextInt();
		boolean isprime=false;
		if(n==1 || n==2 || n==3) {
			isprime=true;
		}else {
			for(int i=2;i<n;i++) {
				if(n%i==0) {
					isprime=false;
					break;
				}else {
					isprime=true;
				}
			}
		}
		System.out.println(isprime);
		}
	}

