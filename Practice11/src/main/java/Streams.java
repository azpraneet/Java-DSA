import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Streams{
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Azam","Amir","saidul","talib");
		Predicate<String> p=n->n.charAt(0)=='A';
		for(String names:list) {
			if(p.test(names)) {
				System.out.println(names);
			}
		}
		
	}
}