import java.util.HashMap;
import java.util.Map;

public class EachWord {
	public static void main(String[] args) {
		String s="banana";
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		char[] charArray = s.toCharArray();
		for(char ch:charArray) {
			if(!map.containsKey(ch)) {
				map.put(ch,1);
			}else {
				Integer cnt = map.get(ch);
				map.put(ch, cnt+1);
			}
		}
		System.out.println(map);
	}
}
