package problem.medium;

import java.util.List;

public class Problem33 {

    /**
     * 주어진 문자열 리스트에서 'a'로 시작하는 문자열을 찾아 그 길이의 합을 계산합니다.
     *
     * @param strings 원본 문자열 리스트
     * @return 'a'로 시작하는 문자열들의 길이의 합
     */
    public static int sumLengthsOfStringsStartingWithA(List<String> strings) {
        return strings.stream()
            .filter(s -> s.startsWith("a"))
            .map(String::length)
            .mapToInt(Integer::intValue)
            .sum();
    }
}
