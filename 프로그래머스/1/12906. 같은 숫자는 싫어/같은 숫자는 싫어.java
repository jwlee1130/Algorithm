import java.util.*;

public class Solution {
    /*
        stack 해서 마지막 수만 비교해 될꺼 같고 연속이 되면 안되니
        queue에서 마지막 꺼낼려면 deque 써도 될꺼 같긴함.
        
        
    */
    public int[] solution(int []arr) {
        
        Stack<Integer> st = new Stack<>();
        
        T : for(int n : arr){
            if(st.isEmpty())
                st.push(n);
            if(st.peek()==n)
                continue T;
            st.push(n);
            
        }
        int[] answer = new int[st.size()];

        for(int i=answer.length-1; i>=0; i--){
            answer[i]=st.pop();
        }
        return answer;
    }
}