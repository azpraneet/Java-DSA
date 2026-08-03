
public class ReverseEachWord {
public static void main(String[] args) {
	String str="Welcome to Banglore";
	String[] split = str.split(" ");
	for(String s:split) {
			
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
		System.out.print(" ");
	}
	
}
}
