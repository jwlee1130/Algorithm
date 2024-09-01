package Programmers;

import java.util.HashMap;
import java.util.Map;

public class 영어숫자 {
	/*
	 * 도움말
영어가 싫은 머쓱이는 영어로 표기되어있는 숫자를 수로 바꾸려고 합니다. 문자열 numbers가 매개변수로 주어질 때, 
numbers를 정수로 바꿔 return 하도록 solution 함수를 완성해 주세요.

제한사항
numbers는 소문자로만 구성되어 있습니다.
numbers는 "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" 
들이 공백 없이 조합되어 있습니다.
1 ≤ numbers의 길이 ≤ 50
"zero"는 numbers의 맨 앞에 올 수 없습니다.

	 */
	public static void main(String[] args) {
		String a = "onetwothreefourfivesixseveneightnineone";
		a = a.replace("one","1");
		System.out.println(a);
		HashMap<String, String> numMap = new HashMap<>();
        	numMap.put("zero", "0");
        	numMap.put("one", "1");
        	numMap.put("two", "2");
        	numMap.put("three", "3");
        	numMap.put("four", "4");
        	numMap.put("five", "5");
        	numMap.put("six", "6");
        	numMap.put("seven", "7");
        	numMap.put("eight", "8");
        	numMap.put("nine", "9");
        	
        	String an="";
        	for(int i=0; i<a.length(); i++) {
        		for(String key : numMap.keySet()) {
        			if(a.startsWith(key,i))
        				an+=numMap.get(key);
        		}
        	}
        	
			long answer = Long.parseLong(an);
		        
		       
		    System.out.println(answer);
		
		
	}
		
		

		
	
}
