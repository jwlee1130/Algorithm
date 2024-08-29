package Programmers;

public class 대소문자구분 {
	
	public static void main(String[] args) {
        	String answer = "";
			String cipher = "dfjardstddetckdaccccdegk";
	        String[] a = cipher.split("");
	        int code =4;
	        
	        //0  7   11
	        for(int i = code-1; i<cipher.length(); i+=code){
	        	answer+=cipher.substring(i, i+1);
	        }
			
		    System.out.println(answer);
		
		
	}
		
		

		
	
}
