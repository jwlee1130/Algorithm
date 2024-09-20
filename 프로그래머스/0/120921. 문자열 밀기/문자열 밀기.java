class Solution {
    public int solution(String A, String B) {
//         int len = A.length();
//         int count =0;
//         String compare = A;
        
//         for(int i=0; i <len; i++){
//             if(compare.equals(B)) return count;
            
//             String end = A.substring((len-1)-i);
//             compare = end + A.substring(0,(len-1)-i);
//             count++;
            
//         }
//         return -1;
        //좋은 풀이 어차피 B를 이어 붙이면 A에 해당하는 문자열이 나올 것이고
        //indexOf로 첫 해당하는 문자열에 위치를 알려줘서 그걸 리턴한다.
        return (B+B).indexOf(A);
    }
}