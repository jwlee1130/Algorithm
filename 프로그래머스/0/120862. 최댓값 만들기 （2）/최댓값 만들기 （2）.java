import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        
        /*
        int answer = numbers[0]*numbers[1];
        int max =0;
        for(int i=0; i<numbers.length-1; i++){
            for(int k=i+1; k<numbers.length; k++){
                
                if(answer<numbers[i]*numbers[k])
                    answer=numbers[i]*numbers[k];
                
            }
            
        }
        
        */
        // arrays.sort 보고 내가 다시 생각한 풀이 
        Arrays.sort(numbers);
        return Math.max(numbers[0]*numbers[1],
            numbers[numbers.length-1]*numbers[numbers.length-2]);
    }
}