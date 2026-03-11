class Solution {
    public String solution(String s) {
        return s.chars()                                    // IntStream 생성
                .sorted()                                   // 오름차순 정렬
                .collect(StringBuilder::new,                // StringBuilder에
                        StringBuilder::appendCodePoint,
                        StringBuilder::append)             // 문자 조합
                .reverse()                                  // 역순 변환
                .toString();                                // 문자열로 반환

    }
}