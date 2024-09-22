import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class Main {


    public static void main(String[] args) throws IOException {
        //입출력도 중요함. 출력량이 많을 떄 매번 출력하지 말고 Stringbuilder 같은
        //버퍼 같은걸로 차곡 차곡 담아서 한번에 출력
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int TC = Integer.parseInt((in.readLine()));
        StringBuilder sb = new StringBuilder();
        T : for(int i=0; i<TC; i++){
            char[] exp = in.readLine().toCharArray();
            Stack<Character> stack = new Stack<>();

            for(char ch : exp){ //골호식 글자 하나씩 처리
                // 여는 괄호
                if(ch == '('){
                    stack.push(ch);
                }else{
                //닫는 괄호
                    if(stack.isEmpty()){
                        sb.append("NO").append("\n");
                        continue T;
                    }
                    stack.pop();

                }
            }
            sb.append(stack.isEmpty()?"YES":"NO").append("\n");
        }
        System.out.println(sb.toString());



    }


}
