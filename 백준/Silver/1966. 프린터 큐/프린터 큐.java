import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(in.readLine());

        StringBuilder sb = new StringBuilder();
        T : for(int i=0; i<len; i++){
            String[] input = in.readLine().split(" ");
            String[] number = in.readLine().split(" ");
            int want = Integer.parseInt(input[1]);
            int count = 0;

            //0번지에 우선순위를 1번지에 인덱스 값으로
            Deque<int[]> que = new ArrayDeque<>();



            for(int k=0; k<Integer.parseInt(input[0]); k++){
                int[] num = new int[2];
                num[0]= Integer.parseInt(number[k]);
                num[1]= k;
                que.addLast(num);
            }
            //반복자로 max = 우선순위해서 빼고 count ++;로 횟수체크
            //max=우선순위일 떄 인덱스 = want 이면 break
                //우선순위 높은거 찾기
            S : while(true) {
                int max =0;
                for(int[] find : que) {
                    if (max < find[0]) {
                        max = find[0];
                    }

                }
                //앞에꺼 빼기
                int[] front = que.removeFirst();
                //max값이랑 똑같을 떄 까지 앞에서 뺴서 뒤에껄로
                if (front[0] == max) {
                    if(front[1]==want){
                        count++;
                        sb.append(count).append("\n");
                        break S;
                    }else{
                        count++;
                    }
                } else {

                    que.addLast(front);
                }
            }



        }
        System.out.println(sb.toString());
    }

}
