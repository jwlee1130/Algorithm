class Solution {
    public int solution(int[][] dots) {
        int x=0;
        int y=0;
        if(dots[0][0] == dots[1][0])
            x = (int)Math.abs(dots[0][0]-dots[2][0]);
        else if(dots[0][0] == dots[2][0])
            x = (int)Math.abs(dots[0][0]-dots[1][0]);
        else
            x = (int)Math.abs(dots[0][0]-dots[1][0]);
        
        
        if(dots[0][1] == dots[1][1])
            y = (int)Math.abs(dots[0][1]-dots[2][1]);
        else if(dots[0][0] == dots[2][0])
            y = (int)Math.abs(dots[0][1]-dots[1][1]);
        else
            y = (int)Math.abs(dots[0][1]-dots[1][1]);
        return x*y;
    }
}