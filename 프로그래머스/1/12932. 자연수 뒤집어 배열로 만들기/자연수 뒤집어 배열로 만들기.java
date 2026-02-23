class Solution {
    public int[] solution(long n) {
        String str = String.valueOf(n);
        int [] anwswer = new int[str.length()];

        int index = 0;

        while(n > 0 ){
            anwswer[index++] = (int)(n % 10);
            n /= 10;
        }

        return anwswer;
    }
}