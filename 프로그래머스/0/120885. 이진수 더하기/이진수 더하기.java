class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        int x = Integer.parseInt(bin1,2);
        int y = Integer.parseInt(bin2,2);
        int sum = x + y;
        answer = Integer.toBinaryString(sum);
        return answer;
    }
}