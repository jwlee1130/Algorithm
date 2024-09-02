class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0,0};
        int allowRow=board[0]/2;
        int allowColum=board[1]/2;
        
        for(String key : keyinput){
            if(key.equals("left")){
                if(answer[0]==-allowRow)
                    continue;
                answer[0]-=1;   
            }
            if(key.equals("right")){
                if(answer[0]==allowRow)
                    continue;
                answer[0]+=1; 
            }
            if(key.equals("up")){
                if(answer[1] == allowColum)
                    continue;
                answer[1]+=1; 
            }
            if(key.equals("down")){
                if(answer[1]==-allowColum)
                    continue;
                answer[1]-=1; 
            }
        }
        return answer;
    }
}