import java.util.ArrayList;
import java.util.*;
import java.util.List;
class Solution {
    public boolean solution(int x) {
        // 입력받은 숫자의 자리수를 배열로 만들기
        // 배열이된 숫자를 다합치고 원본과나눈뒤 나머지가0이면
        // true 나머지가 0이아니면false
        int n = x;
        List<Integer> list = new ArrayList<>();
        while (x > 0) {
            list.add(x % 10);
            x /= 10;
        }
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        return n % sum == 0;
    }


}