class Solution {

    public int solution(int[] common) {
        int lastCheck = common[1]-common[0];
        
        for(int i=common.length-1; i>0; i--){
            int check = common[i]-common[i-1];
            
            if(check!=lastCheck){
                return common[common.length-1]*(common[1]/common[0]);
            }
            
        }
        return common[common.length-1]+lastCheck;
        
    }
    
    
    
}