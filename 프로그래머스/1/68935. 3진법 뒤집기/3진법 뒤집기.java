import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int n) {

        int sum = 0;
        int num = 0;
        List<Integer> list = new ArrayList<>();
        while (n != 0){
            num = n%3;
            n /= 3;
            list.add(num);
        }
        num = 1;
        for (int i = list.size() -1; i >= 0 ; i--) {
            sum += list.get(i) * num;
            num *= 3;
        }
        return sum;
    }
}