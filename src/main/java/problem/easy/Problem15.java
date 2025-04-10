package problem.easy;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Problem15 {

    /**
     * Map에서 'apple'과 같은 특정 값에 해당하는 모든 키를 Set으로 반환합니다.
     *
     * @param map 원본 Map
     * @return 'apple'을 값으로 가지는 모든 키의 Set
     */
    public static Set<String> keysForValue(Map<String, String> map, String value) {
        return map.entrySet().stream()
            .filter(entry -> entry.getValue().equals(value))
            .map(Map.Entry::getKey)
            .collect(Collectors.toSet());
    }
}