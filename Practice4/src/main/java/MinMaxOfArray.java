
public class MinMaxOfArray {
	public static void main(String[] args) {
		int[] arr= {15,8,2,11,9,4};
		int min=arr[0];
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("Max is ::"+max);
		System.out.println("Max is ::"+min);
	}
}
