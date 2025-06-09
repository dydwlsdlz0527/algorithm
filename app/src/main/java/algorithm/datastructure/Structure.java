package algorithm.datastructure;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class Structure {

    public static void testLinkedList() {
        // 링크드리스트 객체 생성
        List<String> list = new LinkedList<>();

        // 요소 추가
        list.add("Superman");
        list.add("Batman");
        list.add("Antman");
        list.add("Wonderwoman");
        list.add("Ironman");

        // 요소 출력
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // 요소 삭제
        list.remove(3);

        // 요소 수정
        list.set(list.size() - 1, "아이언맨");

        // 다시 출력
        System.out.println();
        for (String item : list) {
            System.out.println(item);
        }
    }

    public static void testStack() {
        Stack<Integer> stack = new Stack<>();
        // Deque<Integer> stack = new ArrayDeque();
        // 스택에 요소 추가
        stack.push(7);
        stack.push(9);
        stack.push(5);
        stack.push(3);
        stack.push(6);

        // 스택에서 요소 반환
        System.out.println(stack.peek());
        System.out.println(stack);

        // 스택에서 요소 반환 + 삭제
        System.out.println(stack.pop());
        System.out.println(stack);

        // 요소 검색
        System.out.println(stack.search(3));
        System.out.println(stack.search(1));
        System.out.println(stack.search(7));
        System.out.println(stack.search(9));
        System.out.println(stack.search(0));

        // 인덱스로 값 가져오기
        System.out.println("0번째 인덱스에 있는 값은? => " + stack.get(0));
        System.out.println("마지막 인덱스에 있는 값은? => " + stack.get(stack.size() - 1));

        // 스택에 있는 요소 수 구하기
        System.out.println("현재 요소 수 => " + stack.size());

        // 스택 비었는지 체크
        System.out.println("스택 비었나요? => " + stack.empty());

        // 스택 요소 전체 출력
        for (int i : stack)
            System.out.println(i);
        System.out.println();

        stack.pop(); // 3

        // 스택에 쌓인 순서대로 출력
        for (int i = stack.size() - 1; i >= 0; i--)
            System.out.println(stack.get(i));

        // 스택 비우기
        stack.clear();
        System.out.println("스택 비었나요? => " + stack.empty());
    }

    public static void testQueue() {
        LinkedList<String> queue = new LinkedList<>();

        // 큐에 요소 추가
        queue.add("홍길동");
        queue.add("이순신");
        queue.add("강감찬");

        // 큐에 있는 요소 반환
        System.out.println(queue.peek());
        System.out.println(queue);

        // 큐에 있는 요소 반환 + 삭제
        System.out.println(queue.poll());
        System.out.println(queue);

        // 값으로 요소 삭제
        queue.remove("이순신");
        System.out.println(queue);

        // 큐에 있는 요소 수 구하기
        System.out.println("현재 큐의 요소 수는? => " + queue.size());

        // 큐 비었는지 체크
        System.out.println("큐 비었나요? => " + queue.isEmpty());

        // 큐 비우기
        queue.clear();
        System.out.println("큐 비었나요? => " + queue.isEmpty());

        // 추가
        queue.add("광개토대왕");
        queue.add("장수왕");
        queue.add("세종대왕");

        // 전체 출력
        System.out.println();
        for (String s : queue)
            System.out.println(s);

        System.out.println("맨 앞에 있는 요소는? => " + queue.element());

        queue.offer("정조");
        System.out.println(queue);
        System.out.println("peek() 사용 => " + queue.peek());
        System.out.println("element() 사용 => " + queue.element());
        System.out.println(queue.get(queue.size() - 1));

        queue.offerFirst("영조");
        System.out.println(queue);

        queue.add(2, "이성계");
        System.out.println(queue);
    }

    public static void testHashSet() {
        Set<String> set = new HashSet<>();

        // 요소 추가
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("E");

        // 출력
        System.out.println(set);

        // 제거
        set.remove("C");
        System.out.println(set);

        // 다시 C 추가
        set.add("C");
        System.out.println(set);

        // 중복 값 추가
        System.out.println("현재 사이즈 => " + set.size());
        set.add("C");
        System.out.println("현재 사이즈 => " + set.size());

        // get() 메서드 사용해서 값 가져오기

        // contains()
        System.out.println("Y가 포함되었나요? => " + set.contains("Y"));
        System.out.println("A가 포함되었나요? => " + set.contains("A"));
        System.out.println("a가 포함되었나요? => " + set.contains("a"));

        // 전체 출력
        for (String s : set)
            System.out.println(s);

        // 전체 출력
        System.out.println("=== 반복자 사용해서 출력 ===");
        Iterator<String> iter = set.iterator();

        // hasNext()
        while (iter.hasNext()) {
            // 다음 데이터 가져오기
            System.out.println(iter.next());
        }
    }

    public static void testHashMap() {
        // HashMap 객체 생성
        HashMap<String, String> map = new HashMap<>();

        // 요소 추가
        map.put("superman", "su1234");
        map.put("batman", "ba1234");
        map.put("antman", "an1234");
        map.put("wonderwoman", "won1234");
        map.put("ironman", "ir1234");

        // 키만 추출
        Set<String> ks = map.keySet();
        System.out.println(ks);
        System.out.println();

        // 한 개 요소만 키 지정해서 가져오기
        String val = (String) map.get("wonderwoman");
        System.out.println("키가 wonderwoman에 해당하는 값은? => " + val);
        System.out.println();

        // 반복문 사용해서 모든 엔트리 출력
        System.out.println("-------------------------------------------");

        for (Map.Entry<String, String> e : map.entrySet()) {
            String key = e.getKey();
            String value = e.getValue();
            System.out.println(key + " : " + value);
        }

        System.out.println("-------------------------------------------");
    }
}
