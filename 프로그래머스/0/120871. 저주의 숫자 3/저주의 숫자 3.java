class Solution {
    public int solution(int n) {
        int answer = 1;
        //3를 거르면서 3의 배수도 거른다.
        //30번대 번호, 60번대 번호, 90번대 번호 체크하고
        //1번 반복 1 count =2 answer =2 count=3  answer = 3  4  3
        int count =1;
        while(true){ 
            if(count%3==0){
                count++;
                continue;   
            }
            String str = String.valueOf(count);
            if(str.contains("3")){
                count++;
                continue;
            }
            if(answer==n)
                break;
            answer++;
            count++;
        }        
        
        
         
       
            
        
        return count;
    }
}