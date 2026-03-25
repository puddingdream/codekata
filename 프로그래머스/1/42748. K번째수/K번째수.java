import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {

        int[] result = new int[commands.length];
        int index1 = 0;

        for (int i = 0; i < commands.length; i++) {
            int a = commands[i][0];
            int b = commands[i][1];
            int c = commands[i][2];

            int[] sort = new int[b + 1 - a];

            int index = 0;
            for (int j = a - 1; j <= b - 1; j++) {
                sort[index] = array[j];
                index++;
            }
            int[] array1 = Arrays.stream(sort).sorted().toArray();
            result[index1] = array1[c-1];
            index1++;
        }
        return result;
    }
}