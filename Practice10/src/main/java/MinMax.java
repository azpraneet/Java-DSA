
public class MinMax {
	public static void main(String[] args) {
		int[] arr= {7,2,5,8,3};
		int min=arr[0];
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<min) {
					min=arr[i];
				}
				if(arr[i]>max) {
					max=arr[i];
				}
			}
		}
		System.out.println(min);
		System.out.println(max);
	}
}
on()