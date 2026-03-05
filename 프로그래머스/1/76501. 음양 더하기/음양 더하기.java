class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        // for문을 돌려서 absolutes[i] 와 signs[i]를 꺼내서 합친다
        // 삼항연산자로 true = +  , false = - 로 해준다
        // 모든수를 더해준다

        int sum = 0;
        int n = 0;
        for (int i = 0; i < absolutes.length; i++) {
            n = absolutes[i];
            sum += signs[i] ? +n : -n;
        }
        return sum;
    }
}

