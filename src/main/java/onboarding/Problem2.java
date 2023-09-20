/*
연속하는 중복 문자들을 삭제한 결과를 return
 */

package onboarding;

public class Problem2 {
    public static String solution(String cryptogram) {

//        String answer = decoder(cryptogram);
//        return answer;
    }



    // 연속으로 중복된 문자를 제거하는 메소드
    public static String removeConsecutiveDuplicateCharacters(String str) {
        if (str == null || str.isEmpty()) {
            return str; // 빈 문자열이나 null인 경우 그대로 반환
        }

        StringBuilder result = new StringBuilder();
        result.append(str.charAt(0)); // 첫 번째 문자는 무조건 추가

        for (int i = 1; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            char previousChar = str.charAt(i - 1);

            if (currentChar != previousChar) {
                result.append(currentChar); // 연속 중복이 아니면 문자 추가
            }
            else {
                result.deleteCharAt(result.length() - 1);
            }
        }

        return result.toString();
    }
}
