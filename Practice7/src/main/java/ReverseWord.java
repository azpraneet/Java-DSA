
public class ReverseWord {
	public static void main(String[] args) {
		String str= "  Bengalore is the Awesome Place ";
		String[] split = str.split(" ");
		for(String s:split) {
			for(int i=s.length()-1;i>=0;i--) {
				System.out.print(s.charAt(i));
			}
				System.out.print(" ");	
		}
		System.out.println();
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
	}
}
