/*
pobi와 crong은 길이 2의 배열
각 자리의 수를 모두 더하거나 각 자리의 수를 곱한 수 중에 가장 큰 수로 비교
pubi > crong : return 1
pubi < crong : return 2
pubi == crong : return 0
exception : return -1
 */

package onboarding;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Problem1 {

    public static int sumResult(int number) {
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        return sum;
    }

    public static int mulResult(int number) {
        int mul = 1;

        while (number != 0) {
            int digit = number % 10;
            mul *= digit;
            number /= 10;
        }
        return mul;
    }
    public static int solution(List<Integer> pobi, List<Integer> crong) {

        List<Integer> pobiNumberList = new ArrayList<>();
        List<Integer> crongNumberList = new ArrayList<>();

        for (int pobiPagesNumber : pobi) {
            pobiNumberList.add(sumResult(pobiPagesNumber));
            pobiNumberList.add(mulResult(pobiPagesNumber));
        }

        for (int crongPagesNumber : crong) {
            crongNumberList.add(sumResult(crongPagesNumber));
            crongNumberList.add(mulResult(crongPagesNumber));
        }

        if (Collections.max(pobiNumberList) > Collections.max(crongNumberList)) {
            return 1;
        }
        else if (Collections.max(pobiNumberList) < Collections.max(crongNumberList)) {
            return 2;
        }
        else if (Collections.max(pobiNumberList) == Collections.max(crongNumberList)) {
            return 0;
        }
        else {
            return -1;
        }
    }
}