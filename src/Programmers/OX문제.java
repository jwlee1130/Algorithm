package Programmers;

public class OX문제 {
	
	
	
	public static void main(String arg[]) {
				String[] quiz ={"3 - 4 = -3", "5 + 6 = 11"};
		        String[] answer = new String[quiz.length];
		        int count = 0;
		        for(String str : quiz){
		            String[] strArray = str.split(" ");
		            int x = Integer.parseInt(strArray[0]);
		            int y = Integer.parseInt(strArray[2]);
		            int z = Integer.parseInt(strArray[4]);
		            if(strArray[1].equals("-")){
		                if((x-y)==z)
		                    answer[count++] = "O";
		                else
		                    answer[count++] = "X";

		            }
		            
		            if(strArray[1].equals("+")){
		                if((x+y)==z)
		                    answer[count++] = "O";
		                else
		                    answer[count++] = "X";
		            }
		            
		        }
		        
		    
		}
}
