package practic;

public class Palindrom {
	public static void main(String[] args) {
		String s="mamamamamamam";
		boolean isPalindrome = false;
		int left = 0;
		int right = s.length()-1;
		while(left < right) {
			if(s.charAt(left) != s.charAt(right)) {
				isPalindrome = false;
				break;
				
			} else {
				isPalindrome = true;
			}
			left++;
			right--;
		} 
		System.out.println(isPalindrome);
		
		
		
		
	}
	
}
