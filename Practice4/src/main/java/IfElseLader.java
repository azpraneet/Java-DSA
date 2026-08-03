
public class IfElseLader {
	public static void main(String[] args) {
		int experiance=5;
		if(experiance<2) {
			System.out.println("Fresher");
		}else if(experiance>=2 && experiance<5){
			System.out.println("Associate Level");
		}else if(experiance>=5 && experiance<7) {
			System.out.println("Senior Level");
		}else if(experiance>=7 && experiance<10){
			System.out.println("Manager");
		}else {
			System.out.println("Archititact");
		}
	}
}
