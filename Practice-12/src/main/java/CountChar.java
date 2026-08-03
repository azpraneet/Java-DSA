import java.util.HashMap;
import java.util.Map;

public class CountChar {
	public static void main(String[] args) {
		String str="Banana";
		char[] ch = str.toCharArray();
		Map<Character, Integer>map= new HashMap<Character, Integer>();
		for(char c:ch) {
			if(!map.containsKey(c)) {
				map.put(c,1 );
			}else {
				Integer value = map.get(c);
				map.put(c, value+1  );
			}
		}
		System.out.println(map);
	}
}
