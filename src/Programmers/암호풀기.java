package Programmers;

public class 암호풀기 {
	
	public static void main(String[] args) {
        	String answer = "";
			String my_string = "CCCccc";
	        
	        //0  7   11
			 for(int i=0; i<my_string.length(); i++){
		            String word = my_string.substring(i,i+1);
		            if(65<=word.charAt(0) && word.charAt(0)<=90) { //A~Z 65~90까지
		            	answer += word.toLowerCase();
		            }
		            else
		            	answer += word.toUpperCase();

		       }
			
		    System.out.println(answer);
		
		
	}
		
		

		
	
}
