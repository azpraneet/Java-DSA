import java.util.HashMap;
import java.util.Map;

public class OccuranceOfWord {
	public static void main(String[] args) {
		String str="Java is a Language and is easy Language";
		String strs = str.toLowerCase();
		String[] split = strs.split(" ");
		Map<String , Integer>map=new HashMap<String,Integer>();
		for(String s:split) {
			if(!map.containsKey(s)) {
				 map.put(s, 1);
			}else {
				Integer value = map.get(s);
				map.put(s, value+1);
			}
		}
		System.out.println(map);
	}
}
