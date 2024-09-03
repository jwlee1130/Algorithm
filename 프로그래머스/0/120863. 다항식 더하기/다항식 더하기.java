class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int xCount = 0;
        int numCount = 0;
        String[] polyArray = polynomial.split(" ");
 
        for(int i=0; i<polyArray.length; i+=2){
            
            if(polyArray[i].contains("x")){
                if(polyArray[i].equals("x")){
                    xCount++;
                    continue;
                }
                String removeX = polyArray[i].replace("x","");
                xCount += Integer.valueOf(removeX);
            }
            else{
                numCount += Integer.valueOf(polyArray[i]);
            }
        }
        
        String a = "";
        String b = "";
        if(xCount == 0 && numCount == 0){
            return "0";
        }else if(xCount ==0){
            return numCount+"";
        }else if(numCount==0){
            if(xCount == 1)
                return "x";
            return xCount+"x";
        }else{
            if(xCount == 1)
                return "x + "+numCount;
            return xCount+"x + "+numCount;            
        }

       
        
        
    }
}