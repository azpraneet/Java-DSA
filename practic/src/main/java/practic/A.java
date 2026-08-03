package practic;

public class A {
	public  void m() {
		System.out.println("Azam helllo");
	}
		
}
class B extends A {
	public static void main(String[] args) {
		A a = new A();
		a.m();
	}

	@Override
	public void m() {
		System.out.println("Azam hello");
		
	}
}