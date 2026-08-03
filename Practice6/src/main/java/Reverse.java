
public class Reverse {
public static void main(String[] args) {
	int[] arr= {5,2,7,4};
	int[] temp=new int[arr.length];
	int cnt=0;
	for(int i=arr.length-1;i>=0;i--) {
		temp[cnt]=arr[i];
		cnt++;
	}
	for(int n:temp) {
		System.out.println(n);
	}
	int[] arrs= {3,7,9,5,2};
	int temps=0;
	for(int i=0;i<arrs.length/2;i++) {
		temps=arrs[i];
		arrs[i]=arrs[arrs.length-1-i];
		arrs[arrs.length-1-i]=temps;
	}
	for(int n:arrs) {
		System.out.print(n);
	}
}
}
