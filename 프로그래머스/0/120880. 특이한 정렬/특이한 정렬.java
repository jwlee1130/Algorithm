import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        int[][] num = new int[numlist.length][2];
        
        for(int i=0; i<num.length; i++){
                num[i][0]=numlist[i];
                num[i][1]=Math.abs(numlist[i]-n);
            
        }
        
        Arrays.sort(num,new Comparator<int[]>(){
                public int compare(int[] o1,int[] o2){
                    //거리 다를 때 절대값 크면 그냥 큰수
                    if(o1[1] != o2[1] ){
                       return Integer.compare(o1[1],o2[1]);
                    }else{
                        //절대값 같다. 거리 같을떄 내림차순 
                        return Integer.compare(o2[0],o1[0]);
                    }
                    
                    
                }
        });
        
        for(int i=0; i<num.length; i++){
           answer[i]=num[i][0];
        }
        
        return answer;
    }
}