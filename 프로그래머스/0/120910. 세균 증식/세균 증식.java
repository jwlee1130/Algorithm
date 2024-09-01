class Solution {
    public int solution(int n, int t) {
        int answer = n;
        //내풀이
        //for(int i=0; i<t; i++){
        //    answer*=2;
        //}
        // 다른 좋은 풀이 비트로 풀기 비트 한칸 이동할떄 마다 2배이기 때ans
        answer= answer << t;
        
        
        return answer;
    }
}