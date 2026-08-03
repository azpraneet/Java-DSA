import java.util.HashMap;
import java.util.Map;

public class OccuranceOfWord {
	public static void main(String[] args) {
		String str="Java famous language and Easy Language";
		String lowerCase = str.toLowerCase();
		String[] split = lowerCase.split(" ");
		Map<String, Integer> map=new HashMap<String, Integer>();
		for(String s:split) {
			if(!map.containsKey(s)) {
				map.put(s, 1);
			}else{
				Integer value = map.get(s);
				map.put(s, value+1);
			}
		}
		System.out.println(map);
	}
}
