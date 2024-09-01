package Programmers;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class 약수구하기 {
	/*
	 * 도움말
문제 설명
정수 n이 매개변수로 주어질 때, n의 약수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ n ≤ 10,000
입출력 예
n	result
24	[1, 2, 3, 4, 6, 8, 12, 24]
29	[1, 29]
	 */
	public static void main(String[] args) {

		int num = 24;
		
		
		int count = 0;
		
		String a ="";
		for(int i=1; i<=num; i++) {
			if(num%i==0)
				a+=i+"";

		}
		String [] set = a.split(" ");
		int answer[] = new int[set.length];
		for(int i=0; i<set.length; i++) {
			answer[i]=Integer.valueOf(set[i]);
		}
		

	
		
	}
		
		

		
	
}
