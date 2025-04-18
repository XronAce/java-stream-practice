package problem.hard;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Problem63 {

    /**
     * 주어진 문자열 리스트에서 각 문자열에 포함된 고유 문자의 개수를 계산하여 반환합니다.
     * 예를 들어, "hello"에는 h, e, l, o의 4개 고유 문자가 있습니다.
     *
     * @param strings 문자열 리스트
     * @return 문자열 별 고유 문자 개수를 나타내는 Map
     */
    public static Map<String, Long> countUniqueCharacters(List<String> strings) {
        return strings.stream()
            .collect(Collectors.toMap(
                s -> s,
                s -> Arrays.stream(s.split("")).distinct().count()
            ));
    }

    public static void main(String[] args) {
        Map<String, Long> expected = Map.of("hello", 4L, "world", 5L, "java", 3L);
        System.out.println(countUniqueCharacters(Arrays.asList("hello", "world", "java")));
    }
}
