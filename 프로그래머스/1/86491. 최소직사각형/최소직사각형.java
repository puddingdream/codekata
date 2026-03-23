class Solution {
    public int solution(int[][] sizes) {
        int maxA =  0;
        int maxB = 0;

        for (int i = 0; i < sizes.length; i++) {
            int a =  sizes[i][0];
            int b =  sizes[i][1];

            int big = Math.max(a, b);
            int small = Math.min(a, b);

            maxA = Math.max(maxA, big);
            maxB = Math.max(maxB, small);

        }
        return maxA * maxB;
    }
}