class Solution {
    public String solution(String my_string, int num1, int num2) {
        char n1 = my_string.charAt(num1);
		char n2 = my_string.charAt(num2);
        StringBuilder sb = new StringBuilder(my_string);
		sb.setCharAt(num1,n2);
		sb.setCharAt(num2,n1);
        return sb.toString();
    }
}