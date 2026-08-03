
public class MinMax {
	public static void main(String[] args) {
		int[] arr= {2,8,5,4,9,7,3,1};
		int min=arr[0];
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				if(arr[i]<=min) {
					min=arr[i];
				}
				if(arr[i]>max) {
					max=arr[i];
				}
				
			}
			
		}
		System.out.println("Min :"+min);
		System.out.println("Max :"+max);
	}
}
