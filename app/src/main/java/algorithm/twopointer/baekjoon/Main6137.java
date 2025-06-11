package algorithm.twopointer.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * ------------------------------------------------------------
 *   파일명  : Main6137.java
 *   설명 : N개의 문자로 이루어진 문자열 S가 입력된다.
 * 이 문자열의 각 문자들로 새로운 문자열 T를 만들려고 한다.
 * 규칙 1. 문자열 S의 가장 앞의 문자 하나를 문자열 T의 마지막에 추가한다.
 * 규칙 2. 문자열 S의 가장 뒤의 문자 하나를 문자열 T의 마지막에 추가한다.
 * 첫 번째 줄에 문자열 S의 길이 N이 주어진다.(N<=2,000)
 * 이후 N개의 줄에 S를 이루는 문자들이 주어진다.
 *   작성자  : 김용진
 *   작성일  : 2025-06-11
 *   수정이력   :
 *    - 2025-06-11 김용진 최초 생성
 * ------------------------------------------------------------
 */
public class Main6137 {

    public static void twoPointer() {
        String T = "";
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));) {
            int N = Integer.parseInt(br.readLine());
            char[] arr = new char[N];
            for (int i = 0; i < N; i++) {
                arr[i] = br.readLine().charAt(0);
            }
            int left = 0;
            int right = (N - 1) - left;
            // 사전순으로 가장 빠른 문자열을 출력한다.
            while (right > left) {
                if (arr[right] - arr[left] > 0) {
                    T = T.concat(String.valueOf(arr[left]));
                    left += 1;
                } else if (arr[right] - arr[left] < 0) {
                    T = T.concat(String.valueOf(arr[right]));
                    right -= 1;
                } else if (arr[right] - arr[left] == 0) {
                    if (arr[right - 1] - arr[left + 1] > 0) {
                        T = T.concat(String.valueOf(arr[left]));
                        left += 1;
                    } else {
                        T = T.concat(String.valueOf(arr[right]));
                        right -= 1;
                    }
                }
                if (T.length() == 80) {
                    T = T.concat(String.valueOf(arr[right]));
                    bw.write(T);
                    bw.newLine();
                }
            }
            T = T.concat(String.valueOf(arr[right]));
            bw.write(T);
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
