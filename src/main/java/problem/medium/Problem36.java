package problem.medium;

import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Problem36 {

    /**
     * 주어진 정수 리스트에서 연속된 3개의 숫자가 모두 짝수인 첫 번째 연속 부분을 찾습니다.
     * 만약 해당하는 부분이 없다면 빈 리스트를 반환합니다.
     *
     * @param numbers 정수 리스트
     * @return 연속된 3개의 숫자가 모두 짝수인 첫 번째 부분의 리스트
     */
    public static List<Integer> findFirstTripleEvenSequence(List<Integer> numbers) {
        return IntStream.rangeClosed(0, numbers.size() - 3)
            .filter(i -> {
                Integer n1 = numbers.get(i);
                Integer n2 = numbers.get(i + 1);
                Integer n3 = numbers.get(i + 2);
                return n1 % 2 == 0 && n2 % 2 == 0 && n3 % 2 == 0;
            })
            .mapToObj(i -> numbers.subList(i, i + 3))
            .findFirst()
            .orElseGet(Collections::emptyList);
    }
}
