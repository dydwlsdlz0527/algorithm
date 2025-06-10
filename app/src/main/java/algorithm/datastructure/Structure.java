package algorithm.datastructure;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

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

    public static void testTreeSet() {
        // 데이터 생성
        int data[] = { 3, 9, 7, 1, 2, 5, 4, 10, 6, 8 };

        // 출력1
        for (int i : data)
            System.out.print(i + " ");
        System.out.println();

        // TreeSet 객체 생성
        TreeSet<Integer> ts = new TreeSet<>();

        // ts 자료구조에 데이터 저장
        for (int i = 0; i < data.length; i++)
            ts.add(data[i]);

        // 출력2
        System.out.println(ts);

        // 출력3
        // 반복자 만들어서 출력하기
        Iterator<Integer> it = ts.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // 순서없이 추가
        System.out.println("------------------------------ add()");
        ts.add(13);
        ts.add(12);
        ts.add(11);
        System.out.println(ts);

        // 제거
        // System.out.println( "------------------------------ remove()" );
        // System.out.println( "10 제거 => " + ts.remove( 10 ) ); // true
        // System.out.println( "100 제거 => " + ts.remove( 100 ) ); // false
        // System.out.println( ts );

        // 여러 메서드 한꺼번에 사용
        System.out.println("------------------------------------ 여러 메서드 사용");
        System.out.println(ts.contains(1));
        System.out.println(ts.remove(5));
        System.out.println(ts.isEmpty());
        System.out.println(ts.size());
        System.out.println(ts.first());
        System.out.println(ts.last());
        System.out.println(ts);

        // floor, ceiling
        System.out.println("------------------------------------ floor(), ceiling()");
        System.out.println("ts.floor(7) => " + ts.floor(7));
        System.out.println("ts.ceiling(7) => " + ts.ceiling(7));

        System.out.println("ts.floor(5) => " + ts.floor(5));
        System.out.println("ts.ceiling(5) => " + ts.ceiling(5));

        // higher, lower
        System.out.println("------------------------------------ higher(), lower()");
        System.out.println(ts.higher(5));
        System.out.println(ts.lower(5));
        System.out.println(ts.higher(7));
        System.out.println(ts.lower(7));

        // subSet, headSet, tailSet
        System.out.println("------------------------------------ subSet(), headSet(), tailSet()");
        System.out.println("전체출력 => " + ts);

        // [1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 13]
        System.out.println(ts.subSet(6, 10));
        System.out.println(ts.headSet(4));
        System.out.println(ts.tailSet(7));

        // 매갯값에 따른 다른 결과 출력
        System.out.println("------------------------------------ 다른 결과 출력");
        System.out.println(ts.subSet(6, false, 10, false));
        System.out.println(ts.headSet(4, true));
        System.out.println(ts.tailSet(7, false));

        // String 타입에 적용
        System.out.println("------------------------------------ 문자열");
        TreeSet<String> ts2 = new TreeSet<>();

        // 요소 추가
        ts2.add("a");
        ts2.add("b");
        ts2.add("c");
        ts2.add("d");
        ts2.add("e");

        // subSet(), headSet(), tailSet(), first(), last()
        System.out.println("전체출력 => " + ts2);
        System.out.println(ts2.first()); // a
        System.out.println(ts2.last()); // e
        System.out.println(ts2.subSet("a", false, "d", false)); // b, c
        System.out.println(ts2.headSet("c", true)); // a, b, c
        System.out.println(ts2.tailSet("c", false)); // d, e
    }

    public static void testTreeSet2() {
        // 데이터 생성
        int data[] = { 4, 5, 3, 1, 2, 9, 7, 6, 8, 10, 4, 6, 2, 3, 8, 1, 7, 5, 2 };

        // TreeSet 객체 생성
        TreeSet<Integer> ts = new TreeSet<>();

        // TreeSet 컬렉션에 저장하기
        for (int i = 0; i < data.length; i++)
            ts.add(data[i]);

        System.out.println("------------------------------------------ TreeSet<Integer>");
        System.out.println("ts 전체출력 => " + ts);

        int a = ts.pollFirst();
        int b = ts.pollLast();

        System.out.println(a); // 1
        System.out.println(b); // 10
        System.out.println("ts 전체출력 => " + ts);

        System.out.println(ts.pollFirst());
        System.out.println(ts.pollLast());
        System.out.println("ts 전체출력 => " + ts);

        ts.clear(); // []
        System.out.println("ts 전체출력 => " + ts);
        System.out.println(ts.pollFirst());
        System.out.println(ts.pollLast());

        System.out.println("------------------------------------ TreeSet<String>");
        String data2[] = { "A", "B", "C", "D", "E", "F" };

        TreeSet<String> ts2 = new TreeSet<>();
        for (int i = 0; i < data2.length; i++)
            ts2.add(data2[i]);

        System.out.println("ts2 전체출력 => " + ts2);
        String s1 = ts2.pollFirst();
        String s2 = ts2.pollLast();

        System.out.println(s1); // A
        System.out.println(s2); // F
        System.out.println("ts2 전체출력 => " + ts2);

        System.out.println(ts2.pollFirst());
        System.out.println(ts2.pollLast());
        System.out.println("ts2 전체출력 => " + ts2);

        ts2.clear();
        System.out.println(ts2.pollFirst());
        System.out.println(ts2.pollLast());
    }

    public static void testTreeMap() {
        TreeMap<String, Integer> map = new TreeMap<>() {
            {
                put("참외", 1000);
                put("포도", 2000);
                put("사과", 3000);
                put("체리", 5000);
                put("수박", 4000);
            }
        };

        System.out.println("------------------------------------------------------- [1]");
        // [1] 모든 과일명과 가격을 전체 출력하시오?
        // 전체 출력1
        System.out.println("전체 출력 => " + map);

        // 전체 출력2
        for (Map.Entry<String, Integer> en : map.entrySet()) {
            System.out.println(en.getKey() + " : " + en.getValue());
        }

        // 전체 출력3
        System.out.println("++++++++++++++++");
        for (String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }

        System.out.println("----------------------------------------------- [2]");
        // [2] 포도 가격이 얼마인지 출력하시오?
        System.out.println("포도 한 송이 가격은? => " + map.get("포도"));

        System.out.println("----------------------------------------------- [3]");
        // [3] 과일중 가격이 가장 싼 과일은?
        System.out.println("가장 싼 과일은(가장 작은 키는)? => " + map.firstKey());
        System.out.println("가장 작은 요소는? => " + map.firstEntry());
        System.out.println("가장 비싼 과일은(가장 큰 키는)? => " + map.lastKey());
        System.out.println("가장 큰 요소는? => " + map.lastEntry());

        System.out.println("----------------------------------------------- [4]");
        // [4] 과일중 포도의 가격을 2200원으로 수정하고 싶다면?
        Integer price = map.get("포도");
        System.out.println("수정 전 포도 가격 => " + price); // 2000
        price = 2200;
        map.put("포도", price);
        System.out.println(map);

        System.out.println("----------------------------------------------- [5]");
        // [5] 메서드 반환 값 받기
        // (문제1) 트리맵에서 첫 번째 요소를 출력하려면?
        // (문제2) 트리맵에서 마지막 번째 요소를 출력하려면?
        // (문제3) 트리맵 전체 요소들을 반복문 사용해서 출력하려면?
        // (문제4) 트리맵 키들만 출력하려면?

        // [5-1]
        Map.Entry<String, Integer> entry = map.firstEntry();
        Integer minEntry = entry.getValue();
        System.out.println("트리맵에서 첫 번째 요소를 출력하려면? => " + minEntry);

        // [5-2]
        Map.Entry<String, Integer> entry2 = map.lastEntry();
        Integer maxEntry = entry2.getValue();
        System.out.println("트리맵에서 마지막 번째 요소를 출력하려면? => " + maxEntry);

        // [5-3]
        Set<Entry<String, Integer>> entrySet = map.entrySet();
        for (Entry<String, Integer> e : entrySet)
            System.out.println(e);

        // [5-4]
        Set<String> keySet = map.keySet();
        for (String s : keySet)
            System.out.println(s);

        System.out.println("----------------------------------------------- [6]");
        // [6] lowerEntry() 메서드 사용하기
        // (문제) 지정한 과일 보다 작은거에서 가장 큰 과일의 가격은?
        Entry<String, Integer> entryA = map.lowerEntry("참외");
        System.out.println(entryA);
        Entry<String, Integer> entryB = map.higherEntry("참외");
        System.out.println(entryB);

        int priceA = map.lowerEntry("참외").getValue();
        int priceB = map.higherEntry("참외").getValue();
        System.out.println(priceA); // 4000
        System.out.println(priceB); // 5000

        System.out.println("----------------------------------------------- [7]");
        // [7] 가격이 가장 비싼 과일의 이름을 알고 싶다면?
        Entry<String, Integer> maxEntry1 = null;

        for (Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e);
            if (maxEntry1 == null || e.getValue() > maxEntry1.getValue()) {
                maxEntry1 = e;
            }
        }
        System.out.println("가장 비싼 과일의 이름은? => " + maxEntry1); // 체리=5000
    }

}
