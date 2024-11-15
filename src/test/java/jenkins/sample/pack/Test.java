package jenkins.sample.pack;

import java.util.LinkedHashMap;
import java.util.Map;

public class Test {
	 public static void main(String[] args) {
	        String s1 = "Hello@12 3";
	        char[] ch = s1.toCharArray();
	        String s2 = "";
	        int count;
	     for(char c : ch){
	        if(Character.isUpperCase(c) && Character.isLowerCase(c)){
	        	System.out.println(c);
	        	
	        }
	        
//	         char[] ch1 =  s2.toCharArray();
//	            Map<Character, Integer> mp = new LinkedHashMap<>();
//	            for(char c1 : ch1)
//	            if(mp.containsKey(c1)){
//	                count = count+1;
//	            }else{
//	                mp.put(c, 1);
//	            }
//	        }
	        
	     }
	     System.out.println(s2);
	 }
}

