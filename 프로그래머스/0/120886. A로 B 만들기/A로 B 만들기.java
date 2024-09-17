import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        int answer = 1;
        //int len = before.length();
        
        
       // for(int i=0; i<len; i++){
         //       after = after.replaceFirst(before.substring(i,i+1),"");
     
       // }
        
        //좋은 풀이 순서를 바꿔어서 만들 수 있다면 각각 정렬하면 같은 문자열이여야 한다.
        
        char[] bSort = before.toCharArray();
        char[] aSort = after.toCharArray();
        
        Arrays.sort(bSort);
        Arrays.sort(aSort);
        
        
        return new String(bSort).equals(new String(aSort))==true?1:0;
    }
}