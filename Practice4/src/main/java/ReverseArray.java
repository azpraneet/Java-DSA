
public class ReverseArray {
	public static void main(String[] args) {
		int[] arr= {3,8,17,11,2,13};
		
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);
		}
		//reversing array
		int[] arrs= {4,9,16,12,2,19};
		int temp[]=new int[arrs.length];
		int cnt=0;
		for(int i=arrs.length-1;i>=0;i--) {
			temp[cnt]=arrs[i];
			cnt++;
		}
		for(int n:temp) {
			System.out.print(n+ " ");
		}
		int[] ar= {4,9,16,12,2,19};
		int temps=0;
		for(int i=0;i<ar.length/2;i++) {
			temps=ar[i];
			ar[i]=ar[ar.length-1-i];
			ar[ar.length-1-i]=temps;
			
		}
		for(int n:ar) {
			System.out.print(n+" ");
		}
	}
}
