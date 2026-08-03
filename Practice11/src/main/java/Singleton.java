
public class Singleton {
	private static final Singleton msg= new Singleton();
	private Singleton() {
		System.out.println("Singleton is create ");
	}
	public static Singleton getInstance() {
		return msg;
	}
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		System.out.println(s1);
		System.out.println(s2);
	}
	
}
