import java.util.*;


class Solution {
    //stack해서 거꾸로 넣어서 하나 꺼내고 마감일 값 구하고 그 이하 값들 세기
    //deque로 그냥 순서대로 넣고 앞에서 빼고 마감일 보다 더 늦게 될 떄 다시 앞으로
    //넣기 
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        
        for(int i=speeds.length-1; i>=0; i--){
            int expire = (100-progresses[i])/speeds[i]
                        +(int)((100-progresses[i])%speeds[i]!=0? 1 : 0 );
            stack.push(expire);
        }
        int count = 1;
        int lastExp = stack.pop();
        while(!stack.isEmpty()){
            int currentExp = stack.pop();
            
            if(currentExp<=lastExp){ //만약 첫번쨰 만기일보다 작으면 같이 배포될것 
                count++;
            }else{//이제 만기일이 다시 크면 다 배포하고 다시 카운트 시작 
                lastExp=currentExp;
                sb.append(count+" ");
                count=1;
            }
            if(stack.isEmpty()){
                sb.append(count);
            }
        }
        
        return   Arrays.stream(sb.toString().split(" "))
                       .mapToInt(Integer::parseInt)
                       .toArray();

    }
}