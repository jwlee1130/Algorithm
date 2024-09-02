class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int i=0; i< array.length; i++){
            String num = array[i]+"";
            String[] numArray = num.split("");
            for(String s : numArray){
                if(s.equals("7"))
                    answer++;
                
            }
            
        }
        return answer;
    }
}