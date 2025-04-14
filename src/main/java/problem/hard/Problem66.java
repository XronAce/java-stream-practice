package problem.hard;

import java.util.List;
import java.util.stream.Collectors;

public class Problem66 {

    /**
     * 주어진 정수 리스트에서 중복되지 않은 숫자들의 개수를 계산합니다.
     *
     * @param numbers 정수 리스트
     * @return 중복되지 않은 숫자들의 개수
     */
    public static long countUniqueNumbers(List<Integer> numbers) {
        return numbers.stream()
            .collect(Collectors.groupingBy(
                n -> n,
                Collectors.counting()
            ))
            .entrySet().stream()
            .filter(entry -> entry.getValue().equals(1L))
            .count();
    }
}
