import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
      StringBuilder sb = new StringBuilder();

            //0번지에 우선순위를 1번지에 인덱스 값으로
            Deque<int[]> que = new ArrayDeque<>();

            for(int k=0; k<priorities.length; k++){
                int[] num = new int[2];
                num[0]= priorities[k];
                num[1]= k;
                que.addLast(num);
            }
            //반복자로 max = 우선순위해서 빼고 count ++;로 횟수체크
            //max=우선순위일 떄 인덱스 = want 이면 break
                //우선순위 높은거 찾기
            int count=0;
            while(true) {
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
                    if(front[1]==location){
                        count++;
                        return count;
                    }else{
                        count++;
                    }
                } else {

                    que.addLast(front);
                }
            }



        

    }
}