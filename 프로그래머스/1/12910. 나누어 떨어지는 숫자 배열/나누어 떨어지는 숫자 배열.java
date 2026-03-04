import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
    
        

        int[] array = Arrays.stream(arr)
                .filter(x -> x % divisor == 0)
                .sorted()
                .toArray();
        return array.length > 0 ? array : new int[]{-1};
    }
}