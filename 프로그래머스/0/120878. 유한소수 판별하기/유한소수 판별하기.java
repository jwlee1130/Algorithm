class Solution {
    public int solution(int a, int b) {
        int answer = 2;
        int max = a;
        int min =b;
         if(a<b){
           int temp = max;
            max = b;
            min = temp;
        }       
 
        //약수 구하기
        for(int i=2; i<=min; i++){
            if(a%i == 0 && b%i == 0){
                a/=i;
                b/=i;
            }
        }
        //약분한 상태에서 분모 2,5 구하기
        //2의 제곱 or 5의 제곱
        
        while(true){
            if(b%5==0){
                b/=5;
            }else{
                break;
            }
            
        }
	    if((b & (b - 1)) == 0 ){
           answer=1;     
        }
       
        
        return answer;
    }
}