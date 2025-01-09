package land;

// https://velog.io/@khj2xx/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%EB%95%85%EB%94%B0%EB%A8%B9%EA%B8%B0
public class Land {
    public static void main(String[] args) {
        int[][] land = {{1, 2, 3, 5}, {5, 6, 7, 8}, {4, 3, 2, 1}};
        int answer = solution(land);
        System.out.println(answer);
    }

    static int solution(int[][] land) {
        int answer = 0;

        for (int i = 1; i < land.length; i++) {
            land[i][0] += max(land[i - 1][1], land[i - 1][2], land[i - 1][3]);
            land[i][1] += max(land[i - 1][0], land[i - 1][2], land[i - 1][3]);
            land[i][2] += max(land[i - 1][0], land[i - 1][1], land[i - 1][3]);
            land[i][3] += max(land[i - 1][0], land[i - 1][1], land[i - 1][2]);
        }

        for (int i = 0; i < 4; i++) {
            if (answer < land[land.length - 1][i]) {
                answer = land[land.length - 1][i];
            }
        }

        return answer;
    }

    static int max(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }
}
