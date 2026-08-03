
public class ReverseArr {
	public static void main(String[] args) {
		int[] arr= {3,7,5,9,2,6};
		int temp[]=new int[arr.length];
		int cnt=0;
		for(int i=arr.length-1;i>=0;i--) {
			temp[cnt]=arr[i];
			cnt++;
		}
		for(int n:temp) {
			System.out.print(n+" ");
		}
	}
}
