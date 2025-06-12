package algorithm.stack.backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * ------------------------------------------------------------
 *   파일명  : Main10773.java
 *   작성일  : 2025-06-13
 *   설명 : 첫 번째 줄에 정수 K가 주어진다.(1<=K<=100,000)
 * 이후 K개의 줄에 정수가 1개씩 주어진다. 정수는 0에서 1,000,000 사이의 값을 가지며, 정수가 "0"일 경우에는 가장 최근에 쓴
 * 수를 지우고, 아닐 경우 해당 수를 쓴다.
 * 정수가 "0"일 경우에 지울 수 있는 수가 있음을 보장할 수 있다.
 * 출력 : 재민이가 최종적으로 적어 낸 수의 합을 출력한다. 최종적으로 적어낸 수의 합은 2^31 -1 보다 작거나 같은 정수이다.
 * ------------------------------------------------------------
 */
public class Main10773 {

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));) {
            int K = Integer.parseInt(br.readLine());
            int sum = 0;
            Deque<Integer> stack = new ArrayDeque<>();
            for (int i = 0; i < K; i++) {
                int num = Integer.parseInt(br.readLine());
                if (num == 0) {
                    stack.pop();
                } else {
                    stack.push(num);
                }
            }
            while (!stack.isEmpty()) { // 스택이 비어있지 않은 동안 반복
                sum += stack.pop(); // 스택에서 요소를 하나씩 꺼내면서 sum에 더함
            }
            bw.write(String.valueOf(sum));
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
