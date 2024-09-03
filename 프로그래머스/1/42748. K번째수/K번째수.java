import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        //commands의 행갯수가 결국 answer 사이즈 
        //commands의 행 갯수만큼 반복해서
        //q=0 시작해서 command[q][0,1,2] i j k를 꺼내겠다.
        //i부터 j까지 짤라야 하니 j-i+1만큼 길이가 필요하다.
        //반복 할때마다 새로 사이즈 생성
        //num[]은 항상 0부터 넣고 값은 array[i]부터 array[j]까지 넣는다.
        //오름차순 정렬 해주고
        //num[k]로 해당값을 answer[q]에 옮긴다.
        // int[] answer = new int[commands.length]; 
        // for(int q=0; q<commands.length; q++){
        //     int i = commands[q][0]-1;
        //     int j = commands[q][1]-1;
        //     int k= commands[q][2]-1;
        //     int num[] = new int[j-i+1];
        //     int numStart = 0;
        //     for(int start = i; start<=j; start++){
        //         num[numStart++]=array[start];
        //     }
        //     Arrays.sort(num);
        //     answer[q]=num[k];
        // }
        // 내풀이 좋은 메소드가 있어서 써봐야겠다.
        
        int[] answer = new int[commands.length]; 
        for(int q=0; q<commands.length; q++){
            int num[] = Arrays.copyOfRange(array,commands[q][0]-1,commands[q][1]);
            Arrays.sort(num);
            answer[q]=num[commands[q][2]-1];
        }
        
        
        return answer;
    }
}