package algorithm.queue;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * ------------------------------------------------------------
 *   파일명  : Main10845.java
 *   작성일  : 2025-06-13
 *   설명 : 정수를 저장하는 큐를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
 *          push X : 정수 X를 큐에 넣는 연산이다.
 *          pop : 큐에서 가장 앞에 있는 정수를 뺴고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 *          size: : 큐에 들어있는 정수의 개수를 출력한다.
 *          empty : 큐가 비어있으면 1, 아니면 0을 출력한다.
 *          front : 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 *          back : 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 *    입력 : 첫째 줄에 주어지는 명령의 수 N (1<=N<=10,000)이 주어진다. 둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다. 주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다.
 *           문제에 나와있지 않은 명령이 주어지는 경우는 없다.
 *    출력 : 출력해야하는 명령이 주어질 때마다, 한 줄에 하나씩 출력한다.
 * ------------------------------------------------------------
 */
public class Main10845 {

    public static void main(String[] args) {

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){
            
            int N = Integer.parseInt(br.readLine());
            Queue queue = new Queue();
            for(int i=0;i<N;i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                while(st.hasMoreTokens()){
                    String command = st.nextToken();
                    if("push".equals(command)){
                        Integer value = Integer.parseInt(st.nextToken());
                        queue.push(value);
                    }else if("pop".equals(command)){
                        bw.write(queue.pop()+"\n");
                    }else if("size".equals(command)){
                        bw.write(queue.size()+"\n");
                    }else if("empty".equals(command)){
                        bw.write(queue.empty()+"\n");
                    }else if("front".equals(command)){
                        bw.write(queue.front()+"\n");
                    }else if("back".equals(command)){
                        bw.write(queue.back()+"\n");
                    }
                }
            }
            bw.flush();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    static class Queue {
        
        private List<Integer> list;

        public Queue(){
            list = new ArrayList<>();
        }

        public void push(int x){
            list.add(x);
        }

        public int pop(){
            if(!list.isEmpty()) return list.remove(0);
            else return -1;
        }

        public int size(){
            return list.size();
        }

        public int empty(){
            if(list.isEmpty()) return 1;
            else return 0;
        }

        public int front(){
            if(list.isEmpty()) return -1;
            else return list.get(0);
        }

        public int back(){
            if(list.isEmpty()) return -1;
            else return list.get(list.size()-1);
        }

    }
}
