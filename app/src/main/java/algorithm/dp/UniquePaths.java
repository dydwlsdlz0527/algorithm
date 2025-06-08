package algorithm.dp;

import java.util.Arrays;

/**
 * ------------------------------------------------------------
 *   파일명  : UniquePaths.java
 * 설명 : m x n 그리드에서 로봇이 왼쪽 상단 모서리(0,0)에서 시작하여 오른쪽 하단 모서리(m-1, n-1)까지 이동합니다.
 * 로봇은 아래 또는 오른쪽으로만 이동할 수 있습니다.
 * 오른쪽 하단 모서리에 도달하는 고유한 경로의 수를 찾는 문제입니다.
 * (참고: https://leetcode.com/problems/unique-paths/)
 *   작성자  : 김용진
 *   작성일  : 2025-06-06
 *   수정이력   :
 *    - 2025-06-06 작성자 이름 최초 생성
 * ------------------------------------------------------------
 */
public class UniquePaths {

    public static int uniquePaths(int m, int n) {
        int[][] memo = new int[m][n];
        // -1로 초기화
        for (int i = 0; i < m; i++) {
            Arrays.fill(memo[i], -1);
        }
        int unique_paths = dfs(m - 1, n - 1, memo, 0);
        return unique_paths;
    }

    private static int dfs(int row, int col, int[][] memo, int unique_paths) {

        if (row == 0 && col == 0)
            return 1;
        unique_paths = 0;
        if (memo[row][col] == -1) {
            if (row - 1 >= 0) {
                unique_paths += dfs(row - 1, col, memo, unique_paths);
            }
            if (col - 1 >= 0) {
                unique_paths += dfs(row, col - 1, memo, unique_paths);
            }
            memo[row][col] = unique_paths;
        }
        return memo[row][col];
    }

    public static int tabulation(int m, int n) {
        int[][] memo = new int[m][n];
        for (int i = 0; i < m; i++) {
            Arrays.fill(memo[i], -1);
        }
        for (int row = 0; row < m; row++) {
            memo[row][0] = 1;
        }
        for (int col = 0; col < n; col++) {
            memo[0][col] = 1;
        }
        for (int row = 1; row < m; row++) {
            for (int col = 1; col < n; col++) {
                memo[row][col] = memo[row - 1][col] + memo[row][col - 1];
            }
        }
        return memo[m - 1][n - 1];
    }
}
