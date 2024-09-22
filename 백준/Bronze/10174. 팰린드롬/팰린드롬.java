import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

	public static void main(String[] args) throws IOException {
	       BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	       int num = Integer.valueOf(in.readLine());
	       
	       StringBuilder sb = new StringBuilder();
	       T : for(int i=0; i<num; i++) {
	    	   Deque<String> que = new ArrayDeque<>();
	    	   char[] exp = in.readLine().toCharArray();
	    	   for(char c : exp) {
	    		   que.add(String.valueOf(c));
	    	   }
	    	   
	    	   for(int k=0; k<exp.length/2; k++) {
	    		   if(que.size()==1)
	    			   break;
	    		   String front = que.removeFirst().toUpperCase();
	    		   String end = que.removeLast().toUpperCase();
	    		   if(!front.equals(end)) {
	    			   sb.append("No"+"\n");
	    			   continue T;
	    		   };
	    	   }
	    	   sb.append("Yes"+"\n");
	    	   
	    	   
	       }
	       
	       System.out.println(sb.toString());
	       
	}
       

}
