
import java.util.Optional;
import java.util.Scanner;


public class Optionals {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Id");
		int id = sc.nextInt();
		User u=new User();
		Optional<String> userById = u.getUserById(id);
		if(userById.isPresent()) {
			String name = userById.get();
			System.out.println(name.toUpperCase()+" Hello");
		}
	}
}

class User{
	public Optional<String> getUserById(Integer id){
		String name=null;
		if(id==101) {
			name="Azam";
		}else if(id==102) {
			name="Saidul";
			
		}else if(id==103) {
			name="Talib";
		}else if(id==104) {
			name="Ibru";
		}
		return Optional.ofNullable(name);
	}
}