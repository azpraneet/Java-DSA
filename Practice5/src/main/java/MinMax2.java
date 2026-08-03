
public class MinMax2 {
	public static void main(String[] args) {
		int[] arr= {7,3,8,5,2,9};
		int min=arr[0];
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
				
			}
			if(arr[i]>max) {
				max=arr[i];
				
			}
		}
		System.out.println("Min is :"+min);
		System.out.println("Max is :"+max);
	}
}
