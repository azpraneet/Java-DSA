import java.util.function.Consumer;

public class Consumers {
	public static void main(String[] args) {
		Consumer<String> c=name->System.out.println(name+" Hello");
		c.accept("Azam");
	}
}
