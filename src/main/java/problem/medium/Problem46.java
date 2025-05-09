package problem.medium;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Problem46 {

    /**
     * 주어진 정수 리스트에서 각 숫자의 출현 빈도를 계산하여 Map으로 반환합니다.
     *
     * @param numbers 정수 리스트
     * @return 각 숫자의 출현 빈도를 나타내는 Map
     */
    public static Map<Integer, Long> frequencyOfNumbers(List<Integer> numbers) {
        return numbers.stream()
            .collect(Collectors.groupingBy(
                n -> n,
                Collectors.counting()
            ));
    }
}
