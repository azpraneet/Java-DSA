
public class Assecend {
	public static void main(String[] args) {
		int[] arr= {7,9,4,8,2};
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0+i;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
					
				}
				
			}
			System.out.print(arr[i]);	
		}
		
	}
}
