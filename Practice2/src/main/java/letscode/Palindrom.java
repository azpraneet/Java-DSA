package letscode;

public class Palindrom {
	public static void main(String[] args) {
		String a="mam";
		boolean isPalendrom=false;
		int left=0;
		int right=a.length()-1;
		for(int i=0;i<a.length();i++) {
			if(a.charAt(left) != a.charAt(right)) {
				isPalendrom=false;
				break;
			}else {
				isPalendrom=true;
			}
			left++;
			right--;
		}
		System.out.println(isPalendrom);
	}
}
