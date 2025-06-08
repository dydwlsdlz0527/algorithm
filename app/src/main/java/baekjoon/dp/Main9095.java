package baekjoon.dp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

/**
 * ------------------------------------------------------------
 *   파일명  : Main9095.java
 *   설명 : 정수 n이 주어졌을 때, n을 1,2,3의 합으로 나타내는 방법의 수를 구하는 프로그램을 작성하시오.
 *   작성자  : 김용진
 *   작성일  : 2025-06-06
 *   수정이력   :
 *    - 2025-06-06 김용진 최초 생성
 * ------------------------------------------------------------
 */
public class Main9095 {

    int[] memo;

    public void Solution() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));) {
            int T = Integer.valueOf(br.readLine());
            int[] solution = new int[T];
            memo = new int[10];
            Arrays.fill(memo, -1);
            for (int i = 0; i < T; i++) {
                int n = Integer.valueOf(br.readLine());
                solution[i] = dfs(n);
                bw.write(String.valueOf(solution[i]));
                bw.newLine();
            }
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Solution2() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));) {
            int T = Integer.valueOf(br.readLine());
            int[] solution = new int[T];
            memo = new int[11];
            for (int i = 0; i < T; i++) {
                int n = Integer.valueOf(br.readLine());
                solution[i] = bottomup(n);
                bw.write(String.valueOf(solution[i]));
                bw.newLine();
            }
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int dfs(int n) {
        if (n == 1) {
            memo[0] = 1;
        }
        if (n == 2) {
            memo[1] = 2;
        }
        if (n == 3) {
            memo[2] = 4;
        }
        if (memo[n - 1] == -1) {
            memo[n - 1] = dfs(n - 3) + dfs(n - 2) + dfs(n - 1);
        }
        return memo[n - 1];
    }

    public int bottomup(int n) {
        memo[0] = 1;
        memo[1] = 2;
        memo[2] = 4;
        for (int i = 3; i <= n; i++) {
            memo[i] = memo[i - 1] + memo[i - 2] + memo[i - 3];
        }
        return memo[n-1];
    }
}
