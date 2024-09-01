class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        String str = "";
        for(int i=0; i<numlist.length; i++){
            if((numlist[i]+n)%n == 0)
                str+=numlist[i]+" ";
        
        }
        if(str.equals(""))
            return answer;
        String[] strArray = str.split(" "); 
        answer = new int[strArray.length];

        int k=0;
        for(String s : strArray){
            answer[k++] = Integer.valueOf(s);
        }
        return answer;
    }
}