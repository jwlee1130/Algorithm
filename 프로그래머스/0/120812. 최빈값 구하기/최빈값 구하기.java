import java.util.*;
class Solution {
    public int solution(int[] array) {        
        int count[]= new int[1000]; //카운트
        Arrays.fill(count,0);
        int answer = 0;
        
        for(int i=0; i<array.length; i++){
            count[array[i]]+=1;                    
        }
        int max=0;
        //1개라 가정
        for(int k=0; k<count.length; k++){
            if(max<=count[k]){
                answer = k;
                max=count[k];
            }
                
        }
        //오름차순으로 정렬후 마지막 값이랑 그 전 값이 값으면 최빈값이 여러개
        Arrays.sort(count);
        int len = count.length;
        if(max==count[len-2]){
            answer = -1;
        }
        
  
        return answer;
    }
}