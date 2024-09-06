import java.util.HashMap;

class Solution {
    public long solution(String numbers) {
        long answer = 0;
        HashMap<String, String> numMap = new HashMap<>();
        numMap.put("zero", "0");
        numMap.put("one", "1");
        numMap.put("two", "2");
        numMap.put("three", "3");
        numMap.put("four", "4");
        numMap.put("five", "5");
    	numMap.put("six", "6");
    	numMap.put("seven", "7");
        numMap.put("eight", "8");
        numMap.put("nine", "9");
        	
        String an="";
        for(int i=0; i<numbers.length(); i++) {
        	for(String key : numMap.keySet()) {
        		if(numbers.startsWith(key,i))
        			an+=numMap.get(key);
        	}
        }
        	
		answer = Long.parseLong(an);
		        
	
        return answer;
    }
}