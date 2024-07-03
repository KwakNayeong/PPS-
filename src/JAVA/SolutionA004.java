package JAVA;

import java.util.ArrayList;
import java.util.Arrays;

class SolutionA004 {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();

        // divisor로 나누어 떨어지는 값들을 list에 추가
        for (int num : arr) {
            if (num % divisor == 0) {
                list.add(num);
            }
        }

        // list가 비어있다면 -1을 담은 배열 반환
        if (list.isEmpty()) {
            return new int[]{-1};
        }

        // list를 배열로 변환
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        // 오름차순 정렬
        Arrays.sort(answer);

        return answer;
    }
}