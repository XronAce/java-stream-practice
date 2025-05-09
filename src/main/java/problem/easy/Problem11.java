package problem.easy;

import java.util.Optional;
import java.util.Set;

public class Problem11 {

    /**
     * 주어진 정수 Set에서 첫 번째로 10보다 큰 수를 찾아 반환합니다.
     *
     * @param numbers 정수 Set
     * @return 10보다 큰 첫 번째 수 (존재하지 않으면 Optional.empty())
     */
    public static Optional<Integer> findFirstGreaterThanTen(Set<Integer> numbers) {
        return numbers.stream()
            .filter(num -> num > 10)
            .findFirst();
    }
}