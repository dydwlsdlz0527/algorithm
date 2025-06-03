package algorithm.dp;

/**
 * 파일명: ClimbingStairs.java
 *
 * @설명: 계단을 올라가고 있다. 이 계단의 꼭대기에 도착하려면 n개의 steps만큼 올라가야 한다. 한 번 올라갈 때마다
 *        1 step 또는 2steps 만큼 올라갈 수 있다. 꼭대기에 도달하는 방법의 개수는 총 몇 가지 일까요?
 *        https://leetcode.com/problems/climbing-stairs/
 * @작성자: 김용진
 * @생성일: 2025.06.03
 * @최종수정일: 2025.06.03
 * @버전: 1.0.0
 *
 * 수정 이력:
 * 날짜        작성자      내용
 * -------------------------------------------------------------------------------
 * 2025.06.03  김용진      Dynamic Programming
 * -------------------------------------------------------------------------------
 */
public class ClimbingStairs {
    
    public int climbStairs(int n){
        if(n==1) return 1;
        if(n==2) return 2;
        return climbStairs(n-1)+climbStairs(n-2);
    }
}
