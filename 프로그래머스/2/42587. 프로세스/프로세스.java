import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
            //0번지에 우선순위를 1번지에 인덱스 값으로
        Deque<int[]> que = new ArrayDeque<>();
        PriorityQueue<Integer> pri = new PriorityQueue<>(Comparator.reverseOrder());
        for(int k=0; k<priorities.length; k++){
            int[] num = new int[2];
            num[0]= priorities[k];
            num[1]= k;
            que.addLast(num);
            pri.add(priorities[k]);
        }

        //반복자로 max = 우선순위해서 빼고 count ++;로 횟수체크
        //max=우선순위일 떄 인덱스 = location 이면 break
        //우선순위 큐를 사용해 최대값부터 뺴기
        int max =pri.remove();
        int count=0;
        while(true) {
            //앞에꺼 빼기
            int[] front = que.removeFirst();
            //max값이랑 똑같을 떄 까지 앞에서 뺴서 뒤에껄로
            if (front[0] == max) {
                if(front[1]==location){
                    count++;
                    return count;
                }else{
                    count++;
                    max =pri.remove();
                }
            } else {
                que.addLast(front);
            }
        }



        

    }
}