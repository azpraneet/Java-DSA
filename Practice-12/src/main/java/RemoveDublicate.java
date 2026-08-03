import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDublicate {
	public static void main(String[] args) {
		String str= "Banana";
		Set<Character> set= new LinkedHashSet<>();
		for(int i=0;i<str.length();i++) {
			set.add(str.charAt(i));
		}
		StringBuilder sb=new StringBuilder();
		for(char ch:set) {
			sb.append(ch);
		}
		System.out.println(sb);
	}
}
