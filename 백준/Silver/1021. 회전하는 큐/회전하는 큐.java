import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main{

	public static void main(String[] args) throws IOException {
	       BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	       String[] str = in.readLine().split(" ");
	       String[] number = in.readLine().split(" ");
	       
	       int queLen = Integer.valueOf(str[0]);
	       int[] pos = new int[Integer.valueOf(str[1])];
	       
	       Deque<Integer> deque = new ArrayDeque<>();

	       for(int i=0; i<pos.length; i++) {
	    	   pos[i]=Integer.valueOf(number[i]);
	       }
	   
	       
	       for(int i=1; i<=queLen; i++) {
	    	   deque.add(i);
	       }
	       
	       //세팅끝
	       /*
	       왼쪽으로 가고 오른쪽으로도 가고 2개 비교해서 최소값 구하기 ->
	       
	       
	       어차피 순서대로있기 때문에 첫앞부분 이랑 사이즈 비교해서 구하기
            ->숫자 빼는 순간 좀 애매해짐 	         
	        
	       */
	       int count =0;
	       int nexNum = 0;
    	   int index =0;
	       T : while(nexNum<Integer.valueOf(str[1])) { 
	    	   int find = pos[nexNum++];

	    	   //흠 원소제거 없이 순회 하기 해당 인덱스 구해서 사이즈 랑 비교해서
	    	   //왼쪽하지 오른쪽할지 고민
	    	   int currentIndex=0;
	    	   for(int num : deque) {
	    		   if(find==num) {
	    			   index=currentIndex;
	    		   }
	    		   currentIndex++;
	    	   }
	    	   // 1 ~10에서 7번째   10-7 < 7    3 < 7 작으면 뒤에껄 꺼내서 앞으로 보내기
	    	   if(deque.size()-index<index) {
	    		   while(true){
	    			   //옮기는데 앞부분이 찾는부분까지 오면 중단 후 제거
	    			   if(deque.peek()==find) {
	    				   deque.removeFirst();
	    				   continue T;
	    			   }
	    			   int back = deque.removeLast();
	    		   	   deque.addFirst(back);
	    		   	   count++;
	    		   }
	    	   }else {  //if조건이 아니면 앞에껄 뒤에껄로 옮기면서 진행
	    		   while(true){
	    			   //옮기는데 앞부분이 찾는부분까지 오면 중단 후 제거
	    			   if(deque.peek()==find) {
	    				   deque.removeFirst();
	    				   continue T;
	    			   }
	    			   int front = deque.removeFirst();
	    		   	   deque.addLast(front);
	    		   	   count++;
	    		   }
	    	   }
	    	   
	    	   
	    	   
	       }
	       
	       
	       
	       System.out.println(count);
	       
	}
       

}
