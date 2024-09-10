import java.util.*;
class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        
        int[][] avg = new int[score.length][2];
        
        for(int i=0; i<score.length; i++){
                avg[i][0]=i;
                avg[i][1]=(score[i][0]+score[i][1]);
        }
        
        Arrays.sort(avg,new Comparator<int[]>(){
            public int compare(int[] o1, int[] o2){
                return Integer.compare(o2[1],o1[1]);
            }
            
            
        });
        int rank=1;
        for(int i=0; i<avg.length; i++){
            int index = avg[i][0];
            int avgScore = avg[i][1];
            
            if(i>0 && avgScore == avg[i-1][1] ){//avg[i][0]이랑 그 전 이랑 같다면
                answer[index]=answer[avg[i-1][0]];
            }else{
                 answer[index]=rank;

            }
            rank++;

        }
        
        
        
        
        return answer;
        
        
        
    }
}