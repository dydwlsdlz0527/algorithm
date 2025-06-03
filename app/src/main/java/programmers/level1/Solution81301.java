package programmers.level1;
/**
 * Solution81301
 * s에 배열에 있는 문자가 있다. -> 해당 문자를 인덱스 번호로 바꾼다.
 */
public class Solution81301 {

    public int solution(String s){
      int answer = 0;
      String[] str = {"zero","one","two","three","four","five","six","seven","eight","nine"};
      for(int i=0;i<=9;i++){
          s=s.replaceAll(str[i], new String(i+""));
      }
      answer = Integer.valueOf(s);
      return answer;  
    }

    public static void main(String[] args) {
        Solution81301 s = new Solution81301();
        String str = "2three45sixseven";
        System.out.println(s.solution(str));
    }
}