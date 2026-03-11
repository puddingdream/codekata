class Solution {
    public int solution(int left, int right) {
        int count = 0;
        int sum = 0;

        for (int i = left; i <= right; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) count++;
            }
            if (count % 2 == 0) {
                sum += i;
                count = 0;
            }
            else {
                sum -= i;
                count = 0;
            }
        }
        return sum;


        
    }
}