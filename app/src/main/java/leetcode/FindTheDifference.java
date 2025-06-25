package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * ------------------------------------------------------------
 *  파일명  : FindTheDifference.java
 *  작성일  : 2025-06-17
 *  설명 : 문자열 t는 문자열 s를 무작위로 섞은 후 임의의 위치에 한 글자를 더 추가하여 생성됩니다.
           s와 t는 소문자로 구성됩니다.
 *  입력 : 0<=s.length<=1000, 임의의 문자열
 *  출력 : t.length = s.length+1, t에 추가된 문자열을 리턴
 * ------------------------------------------------------------
 */
public class FindTheDifference {
    
    /**
     * 
     * @param s abc
     * @param t caba
     * @return a
     */
    public static char findTheDifference(String s, String t){
        char result = ' ';

        // Deque<String> deque = new ArrayDeque<>();
        // List<String> list = new ArrayList<>();

        // for(int i=0;i<s.length();i++){
        //     deque.add(String.valueOf(s.charAt(i)));
        // }

        // for(int i=0;i<t.length();i++){
        //     list.add(String.valueOf(t.charAt(i)));            
        // }

        // while(!deque.isEmpty()){
        //     int removeIndex = list.indexOf(deque.pop());
        //     list.remove(removeIndex);
        // }
        // result = list.get(0).charAt(0);
        // a:1,b:1,c:1

        int[] array = new int[26];
        for(int i=0;i<t.length();i++){
            array[t.charAt(i)-97]++;
        }
        for(int i=0;i<s.length();i++){
            array[s.charAt(i)-97]--;
        }
        for(int i=0;i<26;i++){
            if(array[i]==1){
                result =  (char)(97+i);
            }
        }

        return result;
    }
}
