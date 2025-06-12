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

    public static void main() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));) {
            // 문자열 S의 길이 N
            int N = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder();
            char[] array = new char[N];
            // char 배열에 입력받은 값을 문자열로 만든다.
            for (int i = 0; i < N; i++) {
                array[i] = br.readLine().charAt(0);
            }
            // array의 양 끝 초기값 설정
            int left = 0;
            int right = N - 1;
            int count = 0;
            while (left <= right) {
                // 양 끝의 문자열을 비교해 사전순 가장 빠른 문자열을 T에 추가
                if (array[left] - array[right] < 0) {
                    sb.append(array[left]);
                    left++;
                    count++;
                } else if (array[left] - array[right] > 0) {
                    sb.append(array[right]);
                    right--;
                    count++;
                } else {
                    // 만약 양 끝 문자열이 같다면 양 끝의 다음 문자열을 비교해서 빠른 쪽의 문자열을 추가
                    int left2 = left + 1;
                    int right2 = right - 1;
                    boolean diffCheck = false;
                    while (left2 <= right2) {
                        if (array[left2] - array[right2] < 0) {
                            sb.append(array[left]);
                            left++;
                            diffCheck = true;
                            count++;
                            break;
                        } else if (array[left2] - array[right2] > 0) {
                            sb.append(array[right]);
                            right--;
                            diffCheck = true;
                            count++;
                            break;
                        } else {
                            left2++;
                            right2--;
                        }
                    }
                    // 끝까지 갔는데 양쪽이 모두 동일 (왼쪽 오른쪽 중 하나 선택)
                    if (!diffCheck) {
                        sb.append(array[left]);
                        left++;
                        count++;
                    }
                }
                if (count % 80 == 0) {
                    sb.append("\n");
                }
            }
            bw.write(sb.toString());
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
