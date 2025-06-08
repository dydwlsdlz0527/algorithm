package algorithm.dp;

import java.util.Arrays;

/**
 * 파일명: ClimbingStairs.java
 *
 * @설명: 계단을 올라가고 있다. 이 계단의 꼭대기에 도착하려면 n개의 steps만큼 올라가야 한다. 한 번 올라갈 때마다
 *      1 step 또는 2steps 만큼 올라갈 수 있다. 꼭대기에 도달하는 방법의 개수는 총 몇 가지 일까요?
 *      https://leetcode.com/problems/climbing-stairs/
 * @작성자: 김용진
 * @생성일: 2025.06.03
 * @최종수정일: 2025.06.03
 * @버전: 1.0.0
 *
 *      수정 이력:
 *      날짜 작성자 내용
 *      -------------------------------------------------------------------------------
 *      2025.06.03 김용진 Dynamic Programming
 *      -------------------------------------------------------------------------------
 */
public class ClimbingStairs {

    int[] dp;

    public int climbStairs(int n) {
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;
        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    public int topdown(int n) {
        dp = new int[n];
        // dp 테이블을 -1로 초기화
        Arrays.fill(dp, -1);
        return dfs(n);
    }

    public int dfs(int n) {
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;
        if (dp[n - 1] == -1) {
            dp[n - 1] = dfs(n - 1) + dfs(n - 2);
        }
        return dp[n - 1];
    }

    public int bottomup(int n) {
        dp = new int[n + 1];
        dp[1] = 1;
        if(n==1) return dp[1];
        dp[2] = 2;
        if(n==2) return dp[2];
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

}
