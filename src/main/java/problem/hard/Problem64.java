package problem.hard;

import java.util.List;

public class Problem64 {

    /**
     * 주어진 정수 리스트에서 피보나치 수열에 해당하는 수들의 합을 계산합니다.
     * 피보나치 수열은 0, 1, 1, 2, 3, 5, 8, 13, ... 과 같이 이전 두 수의 합으로 이루어진 수열입니다.
     *
     * @param numbers 정수 리스트
     * @return 피보나치 수열에 속하는 수들의 합
     */
    public static int sumOfFibonacciNumbers(List<Integer> numbers) {
        return numbers.stream()
            .filter(n -> {
                if (n < 0) {
                    return false;
                }
                if (n == 0 || n == 1) {
                    return true;
                }
                int a = 0;
                int b = 1;

                while(b < n) {
                    int next = a + b;
                    if (next < b) {
                        return false;
                    }
                    a = b;
                    b = next;
                }

                return b == n;
            })
            .mapToInt(Integer::intValue)
            .sum();
    }
}
