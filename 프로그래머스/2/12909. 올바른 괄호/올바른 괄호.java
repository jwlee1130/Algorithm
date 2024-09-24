import java.util.*;

class Solution {
    boolean solution(String s) {
            char[] exp = s.toCharArray();
            Stack<Character> stack = new Stack<>();
            for(char ch : exp){ //골호식 글자 하나씩 처리
                // 여는 괄호
                if(ch == '('){
                    stack.push(ch);
                }else{
                //닫는 괄호
                    if(stack.isEmpty()){
                        return false;
                    }
                    stack.pop();

                }
            }
            return stack.isEmpty()?true:false;

    }
}