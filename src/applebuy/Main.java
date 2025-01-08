package applebuy;

// https://velog.io/@khj2xx/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%EA%B3%BC%EC%9D%BC-%EC%9E%A5%EC%88%98
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
        int answer = s.solution(4, 3, score);
    }
}

class Solution {
    public int solution(int k, int m, int[] score) {
        int[] appleCounts = new int[k];

        for (int i : score) {
            appleCounts[i - 1]++;
        }

        int answer = 0;
        for (int i = appleCounts.length - 1; i >= 0; i--) {
            // score = i + 1
            if (appleCounts[i] != 0) {
                answer += ((i + 1) * m * (appleCounts[i] / m));

                if (i != 0) {
                    appleCounts[i - 1] += (appleCounts[i] % m);
                }
            }
        }

        return answer;
    }
}
