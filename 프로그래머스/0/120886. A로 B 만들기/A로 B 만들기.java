class Solution {
    public int solution(String before, String after) {
        int answer = 1;
        int len = before.length();
        
        
        for(int i=0; i<len; i++){
                after = after.replaceFirst(before.substring(i,i+1),"");
     
        }
        
        
        
        
        return after.length()==0?1:0;
    }
}