package Programmers;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ex3 {
	
	public static void main(String[] args) {
		System.out.println("==시작");
		int[] s = {1, 2,3};
		s = Arrays.stream(s).sorted().toArray();
		int answer=0;
		if(s[0]+s[1]>s[2])
			answer=1;
		else
			answer=2;
		
		
		System.out.println(answer);
		

		
	}
}
