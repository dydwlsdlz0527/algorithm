package algorithm.dp;

import java.util.Arrays;


/**
 * 파일명: MinCostClimbingStairs.java
 *
 * @설명: 
 *        
 * @작성자: 김용진
 * @생성일: 2025.06.05
 * @최종수정일: 2025.06.05
 * @버전: 1.0.0
 *
 * 수정 이력:
 * 날짜        작성자      내용
 * -------------------------------------------------------------------------------
 * 2025.06.05  김용진      Dynamic Programming
 * -------------------------------------------------------------------------------
 */
public class MinCostClimbingStairs {
    
    public int minCostClimbingStairs(int[] cost){
        
        return 0;
    }

    public static int topDown(int[] cost){
        // cost = new int[]{10,15,20};
        int[] memo = new int[cost.length+1];
        Arrays.fill(memo,-1);
        return dfs(cost,cost.length,memo);
    }

    public static int dfs(int[] cost, int n,int[] memo){
        if(n==0 || n==1) return 0;
        if(memo[n]==-1) memo[n] = Math.min(dfs(cost,n-1,memo)+cost[n-1], dfs(cost,n-2,memo)+cost[n-2]);
        return memo[n];
    }

    public static int buttomUp(int[] cost){
        int[] memo = new int[cost.length+1];
        int n = cost.length;
        Arrays.fill(memo,-1);
        memo[0] = 0;
        memo[1] = 0;
        for(int i=2;i<n+1;i++){
            memo[i] = Math.min(memo[i-1]+cost[i-1], memo[i-2]+cost[i-2]);
        }
        return memo[n];
    }
}
