class Solution {
    public int[] solution(int n, int m) {
        int a = n, b = m;

        // 최대공약수 구하기 (유클리드 호제법)
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        int gcd = a;

        // 최소공배수 구하기
        int lcm = (n * m) / gcd;

        return new int[]{gcd, lcm};
    }
}