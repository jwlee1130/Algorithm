class Solution {
    public int solution(int n) {
        int pizza = n/7;
        pizza = n%7==0 ? pizza : pizza+1;
        int answer = pizza;
        return answer;
    }
}