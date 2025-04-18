package problem.easy;

import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Collectors;

public class Problem13 {

    /**
     * Queue에 있는 모든 정수에 2를 곱하여 새 Queue를 생성합니다.
     *
     * @param numbers 원본 정수 Queue
     * @return 각 요소에 2를 곱한 새 Queue
     */
    public static Queue<Integer> doubleEach(Queue<Integer> numbers) {
        return numbers.stream()
            .map(num -> num * 2)
            .collect(Collectors.toCollection(LinkedList::new));
    }
}