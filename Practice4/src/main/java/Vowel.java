
public class Vowel {
 public static void main(String[] args) {
	String s="Fabulous";
	
	String vowel="";
	String consonent="";
	for(int i=0;i<s.length();i++) {
		char ch = s.charAt(i);
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
			
			vowel+=ch;
		}else {
			consonent+=ch;
		}
	}
	System.out.println(vowel);
	System.out.println(consonent);
}
}
