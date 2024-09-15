class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] babyWord = {"aya","ye","woo","ma"};
        for(String word : babbling){
            String wordCheck = word;
            for(String contain : babyWord){
                if(wordCheck.contains(contain)){
                    wordCheck = wordCheck.replaceFirst(contain," "); 
                }
            }
            wordCheck = wordCheck.replaceAll(" ",""); 

            if(wordCheck.length()==0){
                    answer++;
            }
        }
        
        return answer;
    }
}