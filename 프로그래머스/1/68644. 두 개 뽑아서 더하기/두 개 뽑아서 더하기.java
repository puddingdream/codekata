import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {

        Set<Integer> result = new TreeSet<>();
        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                int a = numbers[i] + numbers [j];
                result.add(a);
            }

        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}