class Solution {
    public String solution(String phone_number) {

        // 문자를 배열로 만들고
        // 배열 fori 돌려서 전체베열-4까지 '*' 로 바꿔주고
        // 다시 배열을 조립해주기
        char[] arr = String.valueOf(phone_number).toCharArray();
        for (int i = 0; i < arr.length-4; i++) {
            arr[i] = '*';
        }
        return new String(arr);
    }
}

