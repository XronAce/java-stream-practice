package problem.easy;

import java.util.Map;
import java.util.stream.Collectors;

public class Problem14 {

    /**
     * Map에서 길이가 3 이상인 키만 필터링하여 새 Map을 생성합니다.
     *
     * @param map 원본 Map
     * @return 길이가 3 이상인 키를 포함하는 새 Map
     */
    public static Map<String, String> filterKeys(Map<String, String> map) {
        return map.entrySet().stream()
            .filter(entry -> entry.getKey().length() >= 3)
            .collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue
            ));
    }
}
