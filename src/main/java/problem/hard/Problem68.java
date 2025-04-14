package problem.hard;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Problem68 {

    /**
     * 주어진 정수 리스트에서 각 숫자의 빈도와 전체 숫자의 평균을 계산합니다.
     * 결과는 각 숫자와 그 빈도, 전체 평균을 포함하는 Map으로 반환합니다.
     *
     * @param numbers 정수 리스트
     * @return 각 숫자의 빈도와 전체 평균을 포함하는 Map
     */
    public static Map<Integer, String> calculateFrequencyAndAverage(List<Integer> numbers) {
        double average = numbers.stream().mapToInt(Integer::intValue).average().orElse(0.0);

        return numbers.stream()
            .collect(Collectors.groupingBy(
                n -> n,
                Collectors.counting()
            ))
            .entrySet().stream()
            .collect(Collectors.toMap(
                Map.Entry::getKey,
                entry -> "Freq: " + entry.getValue() + ", Avg: " + average
            ));
    }

    public static void main(String[] args) {
        Map<Integer, String> expected = Map.of(
                1, "Freq: 2, Avg: 1.75",
                2, "Freq: 1, Avg: 1.75",
                3, "Freq: 1, Avg: 1.75"
        );
        System.out.println(calculateFrequencyAndAverage(Arrays.asList(1,2,1,3)));
    }
}
