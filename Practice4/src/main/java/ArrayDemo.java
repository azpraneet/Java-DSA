
public class ArrayDemo {
	public static void main(String[] args) {
		int[] arr=new int[4];
		int arrs[]= {10,20,30,40,50};
		arr[0]=5;
		arr[1]=6;
		arr[2]=7;
		arr[3]=8;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		
		System.out.println("-------from for loop");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println(arr[i]);
		}
		for(int i=0;i<=arrs.length-1;i++) {
			System.out.println(arrs[i]);
		}
	}
}
