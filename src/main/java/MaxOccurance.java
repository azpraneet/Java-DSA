
public class MaxOccurance {
	public static void main(String[] args) {
	       String str ="success";
	       int maxCount=0;
	       char maxChar=' ';
	       for(int i=0;i<str.length();i++){
	           int count=0;
	           for(int j=0;j<str.length();j++){
	               if(str.charAt(i) == str.charAt(j)){
	                   count++;
	               }
	           }
	            if(count>maxCount){
	           maxCount=count;
	           maxChar=str.charAt(i);
	       }
	       }
	      System.out.println("Maximum occurring character: " + maxChar);
	        System.out.println("Count: " + maxCount);
	    }
}
