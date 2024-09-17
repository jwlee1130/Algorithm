class Solution {
    public int solution(String before, String after) {
        int answer = 1;
        int len = before.length();
        
        for(int i=0; i<len; i++){
            String a = before.charAt(i)+"";
            if(after.contains(a)){
                after = after.replaceFirst(a," ");
            }else{
                answer=0;
                break;
            }
            
        }
        
        
        
        
        return answer;
    }
}