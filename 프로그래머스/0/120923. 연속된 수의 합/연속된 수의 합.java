class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int count =0;
        for(int i=0; i < num; i++){
            count += i;
        }
        count = (total-count)/num;
        
        for(int i=0; i < num; i++){
            answer[i]=count+i;
        }
        return answer;
    }
}