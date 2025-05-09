package problem.easy;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.stream.Collectors;

public class Problem18 {

    /**
     * 스트림을 사용하여 정수 배열에서 PriorityQueue를 생성합니다.
     *
     * @param numbers 정수 배열
     * @return 생성된 PriorityQueue
     */
    public static Queue<Integer> createPriorityQueueFromStream(int[] numbers) {
        return Arrays.stream(numbers)
            .boxed()
            .collect(Collectors.toCollection(PriorityQueue::new));
    }
}
