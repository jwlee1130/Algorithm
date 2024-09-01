import java.util.Arrays;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] sortNum = my_string.toLowerCase().toCharArray();
        Arrays.sort(sortNum);
        for(char c : sortNum){
            answer+= c+"";
        }
        return answer;
    }
}