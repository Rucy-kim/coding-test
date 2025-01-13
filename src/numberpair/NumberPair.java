package numberpair;

public class NumberPair {
    public static void main(String[] args) {
        Solution s = new Solution();
        String answer = s.solution("12321", "42531");
        System.out.println(answer);
    }
}

class Solution {
     public String solution(String X, String Y) {
        int[] arrX = new int[10];
        int[] arrY = new int[10];

        countNum(X, arrX);
        countNum(Y, arrY);

        StringBuilder answer = new StringBuilder();
        for (int i = 9; i >= 0; i--) {
            if (arrX[i] != 0 & arrY[i] != 0) {
                if (i == 0 & answer.isEmpty()) {
                    answer.append(i);
                } else {
                    int min = Math.min(arrX[i], arrY[i]);
                    for (int j = 0; j < min; j++) {
                        answer.append(i);
                    }
                }
            }
        }

        if (answer.toString().isEmpty()) {
            return "-1";
        } else {
            return answer.toString();
        }
    }

    void countNum(String str, int[] arr) {
        for (int i = 0; i < str.length(); i++) {
            // char형 숫자를 int로 변경
            int idx = str.charAt(i) - '0';
            arr[idx]++;
        }
    }
}
