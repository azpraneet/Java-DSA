import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
			int n = sc.nextInt();
			
			int factorials=1;
			for(int i=1;i<=n;i++) {
				factorials *=i;
				
			}
			System.out.println(factorials);
		
	}
}
