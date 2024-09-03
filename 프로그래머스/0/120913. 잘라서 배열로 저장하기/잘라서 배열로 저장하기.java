class Solution {
    public String[] solution(String my_str, int n) {
        //나머지 없이 나눠지면 몫 만큼만 사이즈 필요
        //나머지 있으면 몫 +1 만큼 사이즈 필요
        String[] answer={};
        
        if(my_str.length()%n==0)
            answer = new String[my_str.length()/n];
        else
            answer = new String[my_str.length()/n+1];
        for(int i=0; i<answer.length; i++){
            answer[i]= "";
        }
        int count =0;        
        for(int k=0 ;k<answer.length; k++){
            for(int i=count; i<count+n; i++){                           
                answer[k]+=my_str.charAt(i)+"";
                if(i==my_str.length()-1)
                    break;
            }
            count+=n;

        }
        return answer;
    }
}