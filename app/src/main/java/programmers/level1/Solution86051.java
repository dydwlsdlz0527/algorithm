package programmers.level1;

/**
 * Solution86051
 * 0-9 까지 총 숫자합에서 배열에 있는 수를 뺸다.
 */
public class Solution86051 {



    public int solution(int[] numbers) {
        int answer = -1;
        int sum = 0;
        if(numbers.length>=0){
            for(int i : numbers){
                sum += i;
            }
        }
        answer = 45-sum;
        return answer;
    }

    public static void main(String[] args) {
    
        Solution86051 s = new Solution86051();
        int[] arr = {5,8,4,0,6,7,9};
        System.out.println(s.solution(arr));

    }
}