class Solution {
    public long solution(int a, int b) {
                // 둘중 큰수를 찾는다
        // for문돌려서 a부터 b까지 모든수를더한다
        // if문으로 먼저 a와 b가같다면 그냥 a를 리턴한다
        long sum = 0;
        if (a == b) {
            sum = a;
            return sum;
        }
        if (a < b) {
            for (int i = a; i <= b ; i++) {
                sum += i;
            } 
        }
        if (b < a) {
            for (int i = b; i <= a ; i++) {
                sum += i;
            } 
        }
        return sum;

    }
    
}