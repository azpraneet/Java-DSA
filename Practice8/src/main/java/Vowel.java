
public class Vowel {
	public static void main(String[] args) {
		String str="Bengaloru";
		int vowel=0;
		int consonent=0;
		StringBuilder  v = new StringBuilder();
		StringBuilder  con = new StringBuilder();

	
			char[] ch = str.toCharArray();
			for(char c:ch) {
				if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
					
					vowel++;
					v.append(c);
					
					
				}else {
					
					consonent++;
					con.append(c);
					

				}
			
		}
			System.out.println(vowel);
			System.out.println(v);
			System.out.println(consonent);
			System.out.println(con);
	}
}
