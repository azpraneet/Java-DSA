
public class Vowel {
	public static void main(String[] args) {
		String s="banana";
		int vowel=0;
		int consonent=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
			vowel++;
			}else {
			consonent++;
		}
	
	}
		System.out.println("Vowel :"+vowel);
		System.out.println("Consonent :"+consonent);
}
}