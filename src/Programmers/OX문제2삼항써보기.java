package Programmers;

public class OX문제2삼항써보기 {
	/*
	 * 
	 */
	
	
	public static void main(String arg[]) {
				String[] quiz ={"3 - 4 = -3", "5 + 6 = 11"};
		        String[] answer = new String[quiz.length];
		        int count = 0;
	            int a =0;
		        for(String str : quiz){
		            String[] strArray = str.split(" ");
		            int x = Integer.parseInt(strArray[0]);
		            int y = Integer.parseInt(strArray[2]);
		            int z = Integer.parseInt(strArray[4]);
		            if(z == ( a = strArray[1].equals("+")? x+y : x-z)) {
		            	answer[count++] = "O";
		            }else
		            	answer[count++] = "X";
		            
		        }
		        System.out.println(answer[0]);
		    
		}
}
