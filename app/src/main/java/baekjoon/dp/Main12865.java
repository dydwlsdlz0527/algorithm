package baekjoon.dp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 파일명: Main12865.java
 *
 * @설명: 평범한 배낭.
 *      첫 줄에 물품의 수 N(1 ≤ N ≤ 100)과 준서가 버틸 수 있는 무게 K(1 ≤ K ≤ 100,000)가 주어진다.
 *      두 번째 줄부터 N개의 줄에 거쳐 각 물건의 무게 W(1 ≤ W ≤ 100,000)와 해당 물건의 가치 V(0 ≤ V ≤ 1,000)가 주어진다.
 *      입력으로 주어지는 모든 수는 정수이다.
 * @작성자: 김용진
 * @생성일: 2025.06.06
 * @최종수정일: 2025.06.06
 * @버전: 1.0.0
 *
 *      수정 이력:
 *      날짜 작성자 내용
 *      -------------------------------------------------------------------------------
 *      2025.06.06 김용진 초기 버전 작성
 *      -------------------------------------------------------------------------------
 */
public class Main12865 {

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            String firstLine = bufferedReader.readLine();
            StringTokenizer st = new StringTokenizer(firstLine, " ");
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            System.out.println("물품의 수 : " + n + ", 최대 무게 : " + k);
            int[] w = new int[n]; // 물품들의 무게(인덱스 0부터 n-1)
            int[] v = new int[n]; // 물품들의 무게(인덱스 0부터 n-1)
            for(int i=0;i<n;i++){
                String itemLine = bufferedReader.readLine();
                StringTokenizer st2 = new StringTokenizer(itemLine, " ");
                w[i] = Integer.parseInt(st2.nextToken());
                v[i] = Integer.parseInt(st2.nextToken());
                System.out.println("무게 : " + w[i] + ", 가치 : " + v[i]);
            }

            int[][] dp = new int[n][k+1];

            // 초기화
            for (int i = 0; i < n; i++) {
                Arrays.fill(dp[i], -1);
            }

            

            bufferedWriter.write(String.valueOf(n));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
                bufferedWriter.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public int Solution(int n, int k, int[] w, int[] v) {

        return 0;
    }
}
