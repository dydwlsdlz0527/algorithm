package algorithm.twopointer;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Example {
    
    /*
     * 문자열을 뒤집는 함수 작성
     * 시간복잡도 : O(n)
     */
    public static String[] reverseString(String[] array){
        // String[] array = new String[]{"h","e","l","l","o"};
        int left = 0;
        int right = array.length-1;
        while(left<right){
            String temp = "";
            temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left += 1;
            right -= 1;
        }
        return array;
    }

    /**
     * Arrays.asList() 는 원본 배열을 기반으로 한 리스트를 생성하기 때문에 메모리를 공유한다.
     * 따라서 Collections.reverse()로 역순으로 변환하면 원본 배열도 같이 변환된다.
     * 만약 분리하고 싶다면 new ArrayList<>(Arrays.asList(array))로 리스트를 생성한다.
     * 시간 복잡도 : O(n)
     * @param array
     * @return
     */
    public static String[] reverseCollection(String[] array){
        List<String> list = Arrays.asList(array);
        Collections.reverse(list);
        return array;
    }
}
