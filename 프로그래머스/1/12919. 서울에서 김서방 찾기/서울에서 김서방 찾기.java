class Solution {
    public String solution(String[] seoul) {
       int count = 0;
        for (String s : seoul) {
            if (!s.equals("Kim")){
                count++;
            } else {
                break;
            }
        }
        return "김서방은 " + count +"에 있다";
    }

}