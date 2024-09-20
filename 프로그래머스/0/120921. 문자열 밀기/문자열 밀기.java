class Solution {
    public int solution(String A, String B) {
        int len = A.length();
        int count =0;
        String compare = A;
        
        for(int i=0; i <len; i++){
            if(compare.equals(B)) return count;
            
            String end = A.substring((len-1)-i);
            compare = end + A.substring(0,(len-1)-i);
            count++;
            
        }
        return -1;
    }
}