class Solution {
    public int solution(int[][] board) {
       int len = board[0].length; 

        //걍 모든거 다돌아서 폭탄이면 1~-1 1~-1 부분 boolean으로해서 다 true만들고 컷
        boolean[][] boomZone = new boolean[len][len];
        int answer = 0;
        //  1  2  3
        //  4  5  6
        //  7  8  9
        //
        for(int i=0; i<len; i++){
            for(int k=0; k<len; k++){
                if(board[i][k]==1){
                    if(i-1>=0){
                        if(k-1>=0)
                            boomZone[i-1][k-1]=true;//1
                         boomZone[i-1][k]=true;//4
                        if(k+1<len)
                            boomZone[i-1][k+1]=true;//3;
                    }
                    if(i+1<len){
                        if(k-1>=0)
                            boomZone[i+1][k-1]=true;//7
                        boomZone[i+1][k]=true;//8
                        if(k+1<len)
                            boomZone[i+1][k+1]=true;//9
                        
                    }
                    if(k-1>=0)
                        boomZone[i][k-1]=true;//2
                    boomZone[i][k]=true;//5
                    if(k+1<len)
                        boomZone[i][k+1]=true;//6
                                       
                   
                    
                }
            }
        }
        
        
        
        
        for(int i=0; i<len; i++){
            for(int k=0; k<len; k++){
                if(!boomZone[i][k])
                    answer++;
            }
        }
        
        return answer;
    }
}