class Solution {
    public String solution(String s) {
       int[] num = s.length() % 2 == 0 ? new int[]{s.length() / 2 -1 , s.length() / 2} : new int[]{s.length() / 2};
       
       return s.length() % 2 == 0 ?
               "" + s.charAt(num[0]) + s.charAt(num[1]) :
               "" + s.charAt(num[0]);
        
    }
}
