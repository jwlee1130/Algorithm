package Programmers;



public class 문자교체 {
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
		String a = "onetwothreefourfivesixseveneightnine";
		char n1 = a.charAt(5);
		char n2 = a.charAt(3);
		StringBuilder sb = new StringBuilder(a);
		sb.setCharAt(n1, n2);
		sb.setCharAt(n2,n1);
       		
        String answer = sb.toString();
		        
		       
		System.out.println(answer);
		
		
	}
		
		

		
	
}
