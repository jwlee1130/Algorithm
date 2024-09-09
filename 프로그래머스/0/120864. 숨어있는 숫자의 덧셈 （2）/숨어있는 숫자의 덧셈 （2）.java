class Solution {
    public int solution(String my_string) {
        int answer = 0;
        //흠 for문 돌리고 대문자 65~92 97~ 125 해당하는거 패스하고
        //아닐때 값 곱하기*10*k으로 이어지면 10 100을 곱해서 자릿수를 정해준다.
        //그리고 문자가 나오면 answer에 값을 더하고 값을 넣어줄 변수를 초기화혹 k=0으로 초기화해서 다시 1의자리부터 시작하게 한다.
       /*
        String str="";
        for(int i=0; i < my_string.length(); i++){
            if(65<= my_string.charAt(i)+0 && my_string.charAt(i)+0<=125){
                if(str.equals(""))
                    continue;
                answer+=Integer.valueOf(str);
                str="";
                
                continue;
            }
            str +=my_string.charAt(i);
        }
        if(!str.equals("")){
            answer+=Integer.valueOf(str);
        }
        */
        // 정규식 으로 푸는 해결방법을 보고 다시 생각해보면서 해보기
        
        String[] str = my_string.replaceAll("[a-z,A-Z]"," ").split(" ");
        for(String s : str){
            if(!s.equals(""))
                answer+=Integer.valueOf(s);
        }
        return answer;
    }
}