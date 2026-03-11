class Solution {
    public long solution(int price, int money, int count) {
        long remain = money; // long으로 계산
        for (int i = 1; i <= count; i++) {
            remain -= (long) i * price;
        }
        return remain >= 0 ? 0 : -remain;
    }
}