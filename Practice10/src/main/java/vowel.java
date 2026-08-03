
public class vowel {
	public static void main(String[] args) {
	String str="fabilouse";
	
	char[] ch = str.toCharArray();
	for(char c:ch) {
		if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
			
			System.out.print(c+ "=vowel ");
			
		}else {
			
			System.out.print(c+ "=consonent ");
			
		}
	
	}
	
	}
}
