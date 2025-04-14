package problem.hard;

import java.util.List;
import java.util.stream.IntStream;

public class Problem67 {

    /**
     * 주어진 문자열 리스트에서 모든 문자열이 공유하는 가장 긴 접두사를 찾습니다.
     * 공통 접두사가 없는 경우 빈 문자열을 반환합니다.
     *
     * @param strings 문자열 리스트
     * @return 가장 긴 공통 접두사, 없으면 빈 문자열
     */
    public static String findLongestCommonPrefix(List<String> strings) {
        return strings.stream()
            .reduce((s1, s2) -> {
                int minLength = Math.min(s1.length(), s2.length());
                int length = (int) IntStream.range(0, minLength)
                    .takeWhile(i -> s1.charAt(i) == s2.charAt(i))
                    .count();

                return s1.substring(0, length);
            })
            .orElse("");
    }
}
