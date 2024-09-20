class Solution {
    public int solution(int M, int N) {
        // int answer = 0;
        // if(M==1 && N== 1){
        //     answer = 0;
        // }else if(M==1){
        //     answer+=N-1;
        // }else if(N==1){
        //     answer+=M-1;
        // }else{
        //     answer=M*N-1;
        // }
        // 풀이 어차피 1x1해도 -1 해서 0되서 굳이 안해도 됨
        
        return M*N-1;
    }
}