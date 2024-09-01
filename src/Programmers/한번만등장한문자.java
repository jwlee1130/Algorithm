package Programmers;

import java.util.HashMap;

public class 한번만등장한문자 {
	/*
	 * 도움말
문자열 my_string과 정수 num1, num2가 매개변수로 주어질 때, 
my_string에서 인덱스 num1과 인덱스 num2에 해당하는 문자를 바꾼 문자열을 return 하도록 
solution 함수를 완성해보세요.

제한사항
1 < my_string의 길이 < 100
0 ≤ num1, num2 < my_string의 길이
my_string은 소문자로 이루어져 있습니다.
num1 ≠ num2
입출력 예
my_string	num1	num2	result
"hello"	1	2	"hlelo"
"I love you"	3	6	"I l veoyou"

	 */
	public static void main(String[] args) {
		String a = "abcabcadc";
		HashMap<String,Integer> map = new HashMap<String, Integer>();
		for(int i=97; i<=122;i++) {
			map.put((char)i+"",0);

		}
		
		for(int i=0; i< a.length(); i++) {
			int count = map.get(a.charAt(i)+"");
			map.put(a.charAt(i)+"",++count);
		}
		String answer ="";
		for(String key : map.keySet()) {
			if(map.get(key)==1)
				answer+=key;
		}
		System.out.println(answer);
		
		
	}
		
		

		
	
}
