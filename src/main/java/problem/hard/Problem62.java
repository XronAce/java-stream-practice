package problem.hard;

import java.util.List;

public class Problem62 {

    /**
     * 주어진 정수 리스트에서 홀수이면서 50 이상인 수 중 최대값을 찾습니다.
     * 해당하는 수가 없을 경우 0을 반환합니다.
     *
     * @param numbers 정수 리스트
     * @return 홀수이면서 50 이상인 수 중 최대값, 없으면 0
     */
    public static int findMaxOddNumberAbove50(List<Integer> numbers) {
        return numbers.stream()
            .filter(n -> n % 2 == 1)
            .filter(n -> n >= 50)
            .mapToInt(Integer::intValue)
            .max()
            .orElse(0);
    }
}
