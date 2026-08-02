import java.util.HashMap;
import java.util.Map;

public class OccuranceOfChar { 
	public static void main(String[] args) {
		String str="Banana";
		char[] chars = str.toCharArray();
		Map<Character, Integer>map=new HashMap<Character, Integer>();
		for(char ch:chars) {
			if(!map.containsKey(ch)) {
				map.put(ch, 1);
			}else {
				Integer value = map.get(ch);
				map.put(ch, value+1);
			}
		}
		System.out.println(map);
	}
}
