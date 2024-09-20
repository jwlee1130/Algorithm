class Solution {

    public int solution(int[] common) {
        int lastCheck = common[1]-common[0];
        
        for(int i=0; i<common.length-1; i++){
            int check = common[i+1]-common[i];
            
            if(check!=lastCheck){
                return common[common.length-1]*(common[1]/common[0]);
            }
            
        }
        return common[common.length-1]+lastCheck;
        
    }
    
    
    
}