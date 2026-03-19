class Solution {
      public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int index = 0; // 각 단어 내 인덱스 초기화

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                sb.append(c);   // 공백은 그대로 추가
                index = 0;      // 단어 인덱스 초기화
            } else {
                // 짝수 인덱스는 대문자, 홀수는 소문자
                sb.append((index++ % 2 == 0) ? Character.toUpperCase(c) : Character.toLowerCase(c));
            }
        }

        return sb.toString();
    }

}