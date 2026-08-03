import java.util.Arrays;

public class LowerCase {
	public static void main(String[] args) {
	      String str="Hello Azam Ahmad";
	      String[] words= str.split(" ");
	      System.out.println(Arrays.toString(words));
	      String result=words[0].toLowerCase();
	      for(int i=1; i<words.length;i++){
	      result +=words[i].substring(0,1).toUpperCase()+
	                words[i].substring(1).toLowerCase();
	      }
	      System.out.println(result);
	      }
}
