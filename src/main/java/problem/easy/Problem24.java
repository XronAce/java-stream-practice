package problem.easy;

import java.util.List;
import java.util.Objects;

public class Problem24 {

    /**
     * 주어진 정수 리스트에 특정 요소가 존재하는지 확인합니다.
     *
     * @param numbers 정수 리스트
     * @param number 찾고자 하는 정수
     * @return 주어진 정수가 리스트에 존재하면 true, 그렇지 않으면 false
     */
    public static boolean containsNumber(List<Integer> numbers, int number) {
        return numbers.stream()
            .anyMatch(n -> Objects.equals(n, number));
    }
}
