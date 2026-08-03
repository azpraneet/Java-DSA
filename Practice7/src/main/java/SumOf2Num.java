
public class SumOf2Num {
	public static void main(String[] args) {
		int[] arr= {3,7,8,2,5,1,6,4};
		int sum=8;
		for(int i=0;i<arr.length;i++) {
			for(int j =i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==sum) {
					System.out.println("sum of 2 number :"+arr[i]+"+"+arr[j]+"="+sum);
				}
			}
			
			
		}
	}
}
