class Solution {
    public int solution(int[][] dots) {
        //기울기가 같아야한다.
        //x1 x2 -> x3 x4
        //x1 x3 -> x2 x4
        //x1 x4 -> x2 x3
        
        int answer = 0;
        if( (double)(dots[1][1]-dots[0][1])/(dots[1][0]-dots[0][0])==(double)(dots[3][1]-dots[2][1])/(dots[3][0]-dots[2][0]) )
            return 1;
        if( ((double)dots[2][1]-dots[0][1])/(dots[2][0]-dots[0][0])==(double)(dots[3][1]-dots[1][1])/(dots[3][0]-dots[1][0]) )
            return 1;
        if( ((double)dots[3][1]-dots[0][1])/(dots[3][0]-dots[0][0])==(double)(dots[2][1]-dots[1][1])/(dots[2][0]-dots[1][0]) )
            return 1;
 
        
        return answer;
        
    }
}