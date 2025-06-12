package algorithm.stack.backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * ------------------------------------------------------------
 *  파일명  : Main10828.java
 *  작성일  : 2025-06-12
 *  설명 : 정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
           명령은 총 다섯 가지이다.
           - push X : 정수 X를 스택에 넣는 연산이다.
           - pop : 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우 -1을 출력한다.
           - size : 스택에 들어있는 정수의 개수를 출력한다.
           - empty : 스택이 비어있으면 1, 아니면 0을 출력한다.
           - top : 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 * ------------------------------------------------------------
 */
public class Main10828 {

    public static void main(){
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
            
            int N = Integer.parseInt(br.readLine());
            Stack stack = new Stack();
            for(int i=0;i<N;i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                while(st.hasMoreTokens()){
                    String command = st.nextToken();
                    if("push".equals(command)){
                        Integer value = Integer.parseInt(st.nextToken());
                        stack.push(value);
                    }else if("pop".equals(command)){
                        bw.write(stack.pop()+"\n");
                    }else if("size".equals(command)){
                        bw.write(stack.size()+"\n");
                    }else if("empty".equals(command)){
                        bw.write(stack.empty()+"\n");
                    }else if("top".equals(command)){
                        bw.write(stack.top()+"\n");
                    }
                }
            }
            bw.flush();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    static class Stack {
        
        private List<Integer> arr;

        public Stack(){
            arr = new ArrayList<>();
        }

        public void push(int value){
            arr.add(value);
        }

        public Integer pop(){
            if(arr.isEmpty()){
                return -1;
            }else{
                return arr.remove(arr.size()-1);
            }
        }

        public Integer size(){
            return arr.size();
        }

        public Integer empty(){
            if(arr.isEmpty()){
                return 1;
            }else{
                return 0;
            }
        }

        public Integer top(){
            if(arr.isEmpty()){
                return -1;
            }else{
                return arr.get(arr.size()-1);
            }
        }


    }
}
