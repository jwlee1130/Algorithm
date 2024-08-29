package Programmers;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ex02 {
	
	public static void main(String[] args) {
		System.out.println("==시작");
		String[] s = {"We", "are", "the", "world!"};
		Arrays.stream(s).mapToInt(String::length).forEach((a)->System.out.println(a));
		
		System.out.println("1. String Array ----");
		String 	str = "We are the world";
		
		Arrays.stream(str.split("")).distinct().forEach(n->System.out.println(n));
		System.out.println(Arrays.stream(str.split("")).distinct().collect(Collectors.joining("")));
		
		
		
		
		

		
		
		
	}
}
