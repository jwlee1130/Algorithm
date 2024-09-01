class Solution {
    public int solution(int[] array) {
        for(int i=0; i<array.length; i++){
            for(int k = i+1; k<array.length; k++){
                int temp=array[i];
                if(array[i]>array[k])
                {
                    array[i]=array[k];
                    array[k]=temp;
                }
            }
            
        }
        int answer = array[array.length/2];
        return answer;
    }
}