class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for(String num1 : s1){
            for(String num2 : s2){
                if(num1.equals(num2))
                    answer++;
            }
        }
        return answer;
    }
}