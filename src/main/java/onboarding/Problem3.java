/*
369 게임 손벽을 몇번 쳐야 하는지 return
숫자를 보고 출력하는 것이 아닌 그 누적된 수를 보고 출력함

3,6,9,13,16,19,23,26,29,30,31,32,33,34,35,36,37,38,39,43,44
 */

package onboarding;

public class Problem3 {
    public static int solution(int number) {

        int answer = clapResult(number);
        return answer;
    }

    private static int clapResult(int number) {
        int clapNum = 0;
        for (int count = 0; count <= number; count++) {
            clapNum += clapCount(count);
        }
        return clapNum;
    }

    private static int clapCount(int number) {
        int count = 0;
        while (number != 0) {
            int digit = number % 10;
            if (digit == 3 || digit == 6 || digit == 9) {
                count += 1;
            }
            number /= 10;
        }

        return count;
    }
}
