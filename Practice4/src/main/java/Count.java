import java.util.HashMap;

import java.util.Map;

public class Count {
	public static void main(String[] args) {
		String s="banana";
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a') {
				count++;
			}
				
		}
		System.out.println(count);
		Count.m1();
	}
	public static void m1() {
		String str="banana";
		char[] charArray = str.toCharArray();
		Map <Character, Integer> map=new HashMap();
		
		for(char ch:charArray) {
			if(! map.containsKey(ch)) {
				map.put(ch, 1);
			}else {
				Integer cnt = map.get(ch);
				map.put(ch, cnt+1); 
			}
		}
		System.out.println(map);
	}
}
