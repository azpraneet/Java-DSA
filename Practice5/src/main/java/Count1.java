import java.util.HashMap;
import java.util.Map;

public class Count1 {
	public static void main(String[] args) {
		String str ="Banana";
		char[] charArray = str.toCharArray();
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		for(char ch:charArray) {
			if(!map.containsKey(ch)) {
				map.put(ch, 1);
			}else {
				Integer cnt = map.get(ch);
				map.put(ch, cnt+1);
			}
		}
		System.out.println(map);
	}
}
