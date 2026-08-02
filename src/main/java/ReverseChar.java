
public class ReverseChar {
	public static void main(String[] args) {
		String str="This is java Mock";
		String[] split = str.split(" ");
		for(String s:split) {
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
		System.out.println(" ");
	}
	}
}
