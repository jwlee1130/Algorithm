package Programmers;

import java.util.stream.Stream;

public class ex1 {

	public static void main(String[] args) {
		System.out.println("==시작");
		String s = "10 Z 20 Z 1";
		String[] word = s.split(" ");
		int sum=0;
		int save=0;		
		for(int i=0; i<word.length; i++) {
			if(word[i].equals("Z")){
				sum-=save;
				continue;
			}
			sum+=Integer.parseInt(word[i]);
			save=Integer.parseInt(word[i]);
		}
		
		
		System.out.println(sum);
		
		
	}

}
