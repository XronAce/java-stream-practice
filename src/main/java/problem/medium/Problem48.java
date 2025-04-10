package problem.medium;

import java.util.List;
import java.util.stream.IntStream;

public class Problem48 {

    /**
     * 주어진 정수 리스트가 순차적으로 증가하는지 확인합니다.
     * 예를 들어, 리스트 [1, 2, 3, 4]는 순차적으로 증가하지만, [1, 3, 2, 4]는 그렇지 않습니다.
     *
     * @param numbers 정수 리스트
     * @return 리스트가 순차적으로 증가하면 true, 그렇지 않으면 false
     */
    public static boolean isSequentiallyIncreasing(List<Integer> numbers) {
        /*
        A.compareTo(B):
        - A > B 이면 1
        - A = B 이면 0
        - A < B 이면 -1
         */
        return IntStream.range(1, numbers.size())
            .allMatch(i -> numbers.get(i).compareTo(numbers.get(i - 1)) > 0);
    }
}
