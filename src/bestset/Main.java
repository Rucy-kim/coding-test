package bestset;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] answer = s.solution(6, 13);
        for (int i : answer) {
            System.out.println(answer);
        }
    }
}

class Solution {
    public int[] solution(int n, int s) {
        if (n > s) {
            return new int[]{-1};
        } else {
            int[] answer = new int[n];
            Arrays.fill(answer, s / n);

            int mod = s % n;
            if (mod != 0) {
                for (int i = n - 1; i >= n - mod; i--) {
                    answer[i]++;
                }
            }

            return answer;
        }
    }
}
