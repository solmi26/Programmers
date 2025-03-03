import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        // HashMap = 중복 허용X
        Map<Integer, Integer> countMap = new HashMap<>();
        
        // 1. 귤 크기별 개수 카운팅
        for (int t : tangerine) {
            countMap.put(t, countMap.getOrDefault(t, 0) + 1);
            // countMap.getOrDefault(t, 0): 기존에 저장된 값이 있으면 가져오고, 없으면 0을 기본값으로 반환.
            // +1을 해서 해당 귤 크기의 개수를 1 증가시킨다.
        }
        
        // 2. 개수를 내림차순 정렬
        List<Integer> countList = new ArrayList<>(countMap.values());
        countList.sort(Collections.reverseOrder());
        
        // 3. 가장 많은 귤부터 선택하여 k개 이상이 될 때까지 종류 카운트
        for (int count : countList) {
            k -= count;
            answer++;
            if (k <= 0) break;
        }
        
        return answer;
    }
}
