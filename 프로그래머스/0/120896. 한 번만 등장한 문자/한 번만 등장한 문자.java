import java.util.HashMap;


class Solution {
    public String solution(String s) {
        String answer = "";
        HashMap<String,Integer> map = new HashMap<String, Integer>();
		for(int i=97; i<=122;i++) {
			map.put((char)i+"",0);

		}
		
		for(int i=0; i< s.length(); i++) {
			int count = map.get(s.charAt(i)+"");
			map.put(s.charAt(i)+"",++count);
		}
		for(String key : map.keySet()) {
			if(map.get(key)==1)
				answer+=key;
		}
        
        return answer;
    }
}