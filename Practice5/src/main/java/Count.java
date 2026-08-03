import java.util.HashMap;
import java.util.Map;

public class Count {
public static void main(String[] args) {
	String str="banana";
	int count=0;
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)=='a') {
			count++;
			
		}
	}
	System.out.println(count);
	m1();
}
	public static void m1() {
	String st="banana";
	char[] charArray = st.toCharArray();
	Map<Character, Integer> map=new HashMap<>();
	for(char ch:charArray) {
		if(! map.containsKey(ch)) {
			map.put(ch, 1);
		}else {
			Integer cnt = map.get(ch);
			map.put(ch, cnt+1);
		}
	}
	System.out.println(map);
}
}
