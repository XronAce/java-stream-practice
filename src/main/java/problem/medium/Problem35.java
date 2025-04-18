package problem.medium;

import java.util.Comparator;
import java.util.List;

public class Problem35 {

    /**
     * 주어진 문자열 리스트에서 가장 긴 단어를 찾습니다. 만약 리스트가 비어있으면 빈 문자열을 반환합니다.
     *
     * @param words 문자열 리스트
     * @return 리스트에서 가장 긴 단어, 리스트가 비어있으면 빈 문자열
     */
    public static String findLongestWord(List<String> words) {
        return words.stream()
            .max(Comparator.naturalOrder())
            .orElse("");
    }
}
