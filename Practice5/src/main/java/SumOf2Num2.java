
public class SumOf2Num2 {
	public static void main(String[] args) {
		int[] arr= {3,5,9,1,7,2,4,6};
		int sum=8;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==sum) {
					System.out.println(arr[i]+" "+ arr[j]+"="+sum);
				}
			}
		}
	}
}
