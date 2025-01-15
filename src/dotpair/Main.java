package dotpair;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        long answer = s.solution(1, 5);
        System.out.println("answer = " + answer);
    }
}

class Solution {
    public long solution(int k, int d) {
        long answer = 0;

        for (int i = 0; i < d; i += k) {
            // 피타고라스의 정리를 이용해서 d의 범위를 넘지 않는 최대 개수를 계산
            // 증가치가 k이므로 구한 결과를 k로 나눠줄 필요가있음
            double temp = (Math.sqrt(Math.pow(d, 2) - Math.pow(i, 2)) / k);
            answer += (int) (temp);
        }

        // y축이 0인 경우의 갯수가 포함되어 있지 않으므로 추가로 더해준다.
        answer += ((d / k) + 1);
        return answer;
    }
}

