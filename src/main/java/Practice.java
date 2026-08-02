
public class Practice {
	public int Addition(int a, int b) {
		System.out.println("Before Addition ");
		
		System.out.println("After addition : ");
		return a+b;
	}
	public int Substraction(int a,int b) {
		System.out.println("Before Substraction");
		
		System.out.println("After Substraction : ");
		return a-b;
	}
	
	public static void main(String[] args) {
		Practice p= new Practice();
		p.Addition(30, 20);
		p.Substraction(50, 20);
	}
}
