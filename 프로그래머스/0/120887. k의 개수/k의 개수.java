class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String kNum = k+"";
        for(int q = i; q<=j ; q++){
            String qNum = q+"";
            qNum = qNum.replace(kNum,"a");
            for(int f=0; f<qNum.length(); f++){
                if(qNum.charAt(f)=='a')
                    answer++;
            }
        }
        return answer;
    }
}