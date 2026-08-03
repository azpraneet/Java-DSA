
public class ReverseWord {
	public static void main(String[] args) {
		String str=" This is java Mock";
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
	}
}
