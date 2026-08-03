
public class Sumof2Num {
	public static void main(String[] args) {
		int[] arr= {6,5,3,7,4,2,1};
		int sum=8;
		for(int i=0;i<arr.length;i++) {
			for(int j=0+i;j<arr.length;j++) {
				if(arr[i] + arr[j]==8) {
					System.out.println(arr[i]+" "+ arr[j]+"="+"8");
				}
			}
		}
	}
}
