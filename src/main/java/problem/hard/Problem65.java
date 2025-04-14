package problem.hard;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Problem65 {

    /**
     * 주어진 문자열 리스트에서 'a' 문자를 가장 많이 포함하고 있는 문자열을 찾습니다.
     * 동일한 수의 'a' 문자를 포함하는 문자열이 여러 개 있는 경우, 그 중 하나를 반환합니다.
     *
     * @param strings 문자열 리스트
     * @return 'a' 문자를 가장 많이 포함한 문자열, 없으면 빈 문자열 반환
     */
    public static String findStringWithMostAs(List<String> strings) {
        return strings.stream()
            .collect(Collectors.toMap(
                s -> s,
                s -> Arrays.stream(s.split("")).filter(c -> c.equals("a")).count()
            ))
            .entrySet().stream()
            .max(Map.Entry.comparingByValue())
            .map(Map.Entry::getKey)
            .orElse("");
    }
}
