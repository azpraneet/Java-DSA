
public class SumOf2Num {
	public static void main(String[] args) {
		int[] arr= {7,2,5,9,3,1,4};
		int sum=8;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==sum) {
					System.out.println(arr[i]+"+"+arr[j]+"="+sum);
				}
			}
		}
	}
}
