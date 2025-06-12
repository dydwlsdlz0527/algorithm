package algorithm.twopointer.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * ------------------------------------------------------------
 *   파일명  : Main6137.java
 * 작성일  : 2025-06-11
 *   설명 : N개의 문자로 이루어진 문자열 S가 입력된다.
 * 이 문자열의 각 문자들로 새로운 문자열 T를 만들려고 한다.
 * 문자열 S로 문자열 T를 만드는 규칙은 다음과 같다.
 * 규칙 1. 문자열 S의 가장 앞의 문자 하나를 문자열 T의 마지막에 추가한다.
 * 규칙 2. 문자열 S의 가장 뒤의 문자 하나를 문자열 T의 마지막에 추가한다.
 * 위 규칙으로 만들어진 문자열 T들 중 사전순으로 가장 빠른 문자열을 출력하는 프로그램을 작성하시오.
 * 첫 번째 줄에 문자열 S의 길이 N이 주어진다.(N<=2,000)
 * 이후 N개의 줄에 S를 이루는 문자들이 주어진다.
 * 출력 : 만들어진 사전순으로 가장 빠른 문자열을 출력한다. 80글자마다 새줄 문자를 출력해야 한다.
 * 그리디 알고리즘, 문자열, 투 포인터
 * ------------------------------------------------------------
 */
public class Main6137 {

    public static void twoPointer() {
        StringBuilder T = new StringBuilder();
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
                // 왼쪽이 사전순으로 더 빠름.
                if (arr[right] - arr[left] > 0) {
                    T.append(arr[left]);
                    left += 1;
                    // 오른쪽이 사전순으로 더 빠름.
                } else if (arr[right] - arr[left] < 0) {
                    T.append(arr[right]);
                    right -= 1;
                    // 양쪽이 같은 문자라면 다음 양쪽 문자를 비교해야한다.
                    // 다음 양쪽 문자도 같으면 또 다음 문자를 비교해야한다.
                } else if (arr[right] - arr[left] == 0) {
                    int temp = 1;
                    // ABCEDCBA
                    while (arr[right - temp] == arr[left + temp]) {
                        if (arr[right - temp] - arr[left + temp] > 0) {
                            T.append(arr[left]);
                            left += 1;
                        } else {
                            T.append(arr[right]);
                            right -= 1;
                        }
                        ++temp;
                    }
                }
                if (T.length() == 80) {
                    T.append(arr[right]);
                    bw.write(T.toString());
                    bw.newLine();
                    T = new StringBuilder();
                }
            }
            T.append(arr[right]);
            bw.write(T.toString());
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
