import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public static int[] solution(String s) {
        List<Integer> result = new ArrayList<>(); // 결과를 저장할 리스트
        Map<Character, List<Integer>> seen = new HashMap<>(); // 문자의 인덱스를 기록할 맵

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!seen.containsKey(c)) {
                result.add(-1);
            } else {
                result.add(i - seen.get(c).get(seen.get(c).size() - 1));
            }
            seen.computeIfAbsent(c, k -> new ArrayList<>()).add(i);
        }

        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }
}