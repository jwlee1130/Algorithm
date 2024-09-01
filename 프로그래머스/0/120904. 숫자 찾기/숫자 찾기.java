class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String sNum = num+"";
        String[] numArray = sNum.split("");
        for(int i =0; i<numArray.length; i++){
            if(Integer.valueOf(numArray[i])==k){
                answer = i+1;
                break;
            }
                
        }
        
        return answer;
    }
}