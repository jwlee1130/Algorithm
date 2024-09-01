class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        int count = 0;
        for(String str : quiz){
            String[] strArray = str.split(" ");
            int x = Integer.parseInt(strArray[0]);
            int y = Integer.parseInt(strArray[2]);
            int z = Integer.parseInt(strArray[4]);
            int a =0;
            if(z == (a = strArray[1].equals("+")? x+y : x-y)) {
		            	answer[count++] = "O";
		            }else
		            	answer[count++] = "X";
            
        }
        
        return answer;
    }
}