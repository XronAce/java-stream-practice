package problem.medium;

import java.util.List;

public class Problem38 {

    /**
     * 주어진 문자열 리스트에서 'b'로 시작하는 문자열의 평균 길이를 계산합니다.
     * 해당하는 문자열이 없으면 0을 반환합니다.
     *
     * @param strings 문자열 리스트
     * @return 'b'로 시작하는 문자열의 평균 길이, 해당 문자열이 없으면 0
     */
    public static double averageLengthOfStringsStartingWithB(List<String> strings) {
        return strings.stream()
            .filter(s -> s.startsWith("b"))
            .map(String::length)
            .mapToInt(Integer::intValue)
            .average()
            .orElse(0);
    }
}
