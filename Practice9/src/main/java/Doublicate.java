import java.util.HashMap;
import java.util.Map;

public class Doublicate {
	public static void main(String[] args) {
		Integer[] str={2,4,6,7,2};
		Map<Integer, Integer>map=new HashMap<Integer, Integer>();  
		for(Integer ch:str) {
			if(!map.containsKey(ch)){
				map.put(ch, 1);
					
			}else {
				Integer cnt = map.get(ch);
				map.put(ch, cnt+1);
					
				
			}
		}
		System.out.println(map);
	}
}
