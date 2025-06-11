## Collection Framework
> 데이터를 효율적으로 저장하고 조작할 수 있도록 다양한 자료구조와 알고리즘을 제공하는 표준화된 아키텍처이다.

## Collection Framework 계층 구조
- _Iterable_
  - _Collection_
    - _List_
      - ArrayList
      - Vector
      - LinkedList
      - Stack (Vector를 상속받아서 만들어진 것)
    - _Set_
      - HashSet
      - _SortedSet_
        - TreeSet
    - Queue
  
- _Map_
  - HashMap
  - HashTable
  - _SortedMap_
    - TreeMap

Map 계열의 컬렉션들은 Collection 인터페이스를 상속하지 않고, 별도의 계층 구조를 가지고 있다.

## 주요 인터페이스 3개의 특징
### List
순서가 있는 데이터 집합, 중복 허용
구현 클래스 : ArrayList, Vector, LinkedList, Stack

> LinkedList
> - java.util 패키지에 소속, import 필요
> - Iterable <-- Collection <-- List[Set/Queue] <-- LinkedList 클래스
> 
> ArrayList vs LinkedList
> - 사용하는 메서드가 거의 같다.
> - ArrayList는 내부적으로 **Array**을 이용하는 자료구조이지만, LinkedList는 **Node**를 이용하여 데이터를 저장, 관리(노드는 곧 데이터, 여기에 다음 요소를 가리키는 참조 링크도 가지고 있다고 보면 됨)
>  - 쉽게 말해, ArrayList는 순차적으로 요소(데이터)가 저장되지만, LinkedList는 각 각의 요소들을 링크로 연결하기 때문에 요소들이 순차적이지 않더라도 다음 요소를 가리키는 참조 링크로 인해서 순차적인 관리가 가능.
>
> LinkedList 장점
> - 각 노드가 다음 요소를 가리키는 값만 가지고 있으면 되므로 요소의 추가/삭제 등이 빠르게 처리(다음 요소를 가리키는 참조 값만 변경하면 되기 때문)
> - 요소의 추가, 삭제 시 빠른 장점을 가지고 있어서 어떤 경우에는 ArrayList 보다 선호되는 경향이 있다.
> - 배열은 요소에 접근하는 것은 효율적이나, 추가/삭제 시 뒤의 요소를 전부 업데이트하는 처리가 필요해서 추가적인 비용 발생.
> - LinkedList는 검색에 있어 느리다.
>
> 단일 연결 리스트(Singly Linked List) vs 이중 연결 리스트(Doubly Linked List)
> - 현재 요소에서 다음 요소에 대한 링크만 가지고 있음(노드가 다음 노드만 가리킴)
> - 이러한 단점으로 인해서 이전 요소를 가리키는 참조 값을 노드에 가지는 이중 연결리스트가 나오게 되었고, 자바의 LinkedList는 이중 연결리스트를 내부적으로 구현함.

<hr/>

> Stack
> - Stack 클래스는 Vector 클래스를 상속받아서 만들어진 것
> - 후입선출 방식의 Last In First Out 방식으로 데이터 처리가 이루어지는 자료구조 형태
> - 가장 나중에 저장된 (push) 데이터가 가장 먼저 나오게(pop) 되는 자료 구조 형태
> - 스택의 예 : Undo 기능
> - 주요 메서드
>   - push(E item) : 스택의 맨 위에 요소를 추가.
>   - pop() : 스택의 맨 위의 요소를 제거하고 반환. (비어있으면 EmptyStackException 발생)
>   - peek() : 스택의 맨 위 요소를 제거하지 않고 반환.
>   - empty() : 스택이 비어있는지 확인. (true/false)
>   - search(Object o) : 스택에서 해당 객체의 위치를 반환.(맨 위 요소인 1부터 시작, 못 찾으면 -1)
>   - size() : 스택의 길이 반환
>   - clear() : 스택을 비움. Vector의 clear() 메서드를 호출.
> 
> - 스택 구현 시 주로 사용하는 클래스
>   - Stack 클래스를 사용해도 되나, 더 빠른 스택 구현을 위해서 Deque 인터페이스를 구현한 **ArrayDeque** 클래스를 사용하곤 함.
>     - 성능 : Stack은 Vector를 기반으로 하며, 모든 메서드가 synchronized되어 있어 단일 스레드 환경에서는 불필요한 성능 저하가 발생.
>     - 유연성 : ArrayDeque는 스택과 큐 양쪽 기능을 모두 지원.(단, 제한되는 메서드도 있음을 기억해야 한다.)
>     - 최신 표준 : Java 공식 문서에서도 Stack 대신 ArrayDeque 사용을 권장.

### Queue
|클래스   |특징   |
|:---|:---|
|LinkedList   |큐와 덱(Deque) 모두 지원   |
|**ArrayDeque**|배열 기반, 빠르고 효율적|
|PriorityQueue|우선순위 큐, 요소의 우선순위에 따라 정렬됨|
|ConcurrentLinkedQueue|멀티스레드 환경에서 안전한 비동기 큐|

> Queue
> - 선입선출 방식의 FIFO 방식으로 데이터 처리가 이루어지는 자료구조 형태
> - 가장 먼저 저장된 (push) 데이터가 가장 먼저 나오게(pop)되는 구조
> - 보통 큐 자료구조를 구현하는 경우 Deque 인터페이스를 구현한 LinkedList 클래스를 사용
> 
> - 주요 메서드
>   - add(E e) : 큐에 요소 추가 (예외 발생 IllegalStateException)
>   - poll() : 큐의 첫 요소 제거 및 반환 (큐가 비어있으면 null 반환)
>   - peek() : 큐의 첫 요소 조회 (큐가 비어 있으면 null 반환), 삭제 X
>   - remove() : 큐의 첫 요소 제거 및 반환 (큐가 비어 있으면 예외 발생)
>   - element() : 큐의 첫 요소 조회 (큐가 비어 있으면 예외 발생), 삭제 X
>   - offer(E e) : 큐에 요소 추가 (실패 시 false 반환)


### Set
|구현 클래스|특징
|:---|:---
|HashSet|가장 일반적인 구현체, 해시 기반, 순서 보장 X, 성능 빠름
|LinkedHashSet|**입력 순서 유지**, 내부적으로 해시 + 연결 리스트 사용
|TreeSet|**정렬된 순서 유지**(이진 탐색 트리), 성능은 느리지만 정렬 필요 시 유용
|EnumSet|enum 타입 전용, 매우 빠르고 메모리 효율적
|CopyOnWriteArraySet|멀티스레드 환경에서 안전, 변경 시 복사 발생(성능 비용 있음)
|

순서가 없는 데이터 집합, 중복 허용 X
구현 클래스 : HashSet, TreeSet
> HashSet
> - 요소를 순서에 상관없이 저장
> - 중복 값은 허용 X
> - Set 인터페이스는 Collection 인터페이스를 상속받으므로, Collection에서 정의한 메서드 대부분을 사용
> - HashSet은 데이터를 순서에 상관없이 저장하기 때문에 인덱스로 데이터를 접근할 수 없다.
> - HashSet은 내부적으로 HashMap을 사용하여 데이터를 처리하기 때문에 중복을 없앨 수 있다.
> 
> - 주요 메서드
>   - add(E e) : 요소 추가(중복이면 추가 안됨)
>   - remove(Object e) : 요소 제거
>   - contains(Object o) : 포함 여부 확인
>   - size() : 요소 개수
>   - isEmpty() : 비어 있는지 확인
>   - clear() : 전체 요소 제거
>   - iterator() : 반복자 반환

<hr/>

> TreeSet
> |특징|설명|
> |:---|:---|
> |정렬된 순서 유지|요소들이 자동으로 정렬됨(기본 정렬 또는 Comparator 기준)
> |중복 허용 안 함|Set이므로 중복된 값은 저장되지 않음
> |탐색/삽입/삭제 O(log n)|내부적으로 Red-Black Tree를 사용하여 효율적 수행
> |null 허용 안 함|null 요소는 저장할 수 없음(정렬 불가)
> |
> 
> - 정렬된 집합(Set) 자료구조로, 내부적으로 **Red-Black Tree**라는 자기 균형 이진 탐색 트리를 기반으로 동작한다.
> - Tree로 시작하는 자료구조 클래스는 데이터 저장 시 **자동으로 정렬**이 되어진다.
> - 어떤 객체를 Tree형 자료구조에 저장할 때는 반드시 **우선순위**를 결정할 수 있어야 한다.
> - 우선 순위를 결정하기 위해서는 **Comparator 인터페이스**를 구현해 놓아야만 한다.
> - 내부구조
>   - Red-Black Tree는 이진 탐색 트리의 일종으로, 삽입/삭제 시에도 트리의 균형을 유지한다.
>   - 이 덕분에 TreeSet은 항상 정렬된 상태를 유지하면서도 탐색, 삽입, 삭제가 O(log n)시간에 가능하다.
>   - 부모보다 값이 작으면 왼쪽, 값이 크면 오른쪽에 위치한다.
>
> - 주요 메서드
>   - add(E e) : 요소 추가
>   - remove(E e) : 요소 제거
>   - clear() : 비우기
>   - size() : 요소 개수 반환
>   - isEmpty() : TreeSet이 비어 있는지 확인
>   - contains(E e) : 포함 여부 확인
>   - first() / last() : 최소/최대 값 반환
>   - lower(E e) / higher(E e) : 지정된 요소보다 작은/큰 값 중 가장 가까운 값
>   - floor(E e) / ceiling(E e) : 지정된 요소 이하/이상 중 가장 가까운 값(자신이 포함되어 있으면 자기 자신 반환)
>   - subSet(from, to) : 범위 검색 (from 이상 to 미만)
>   - headSet(to) : 지정 값보다 작은 값들 (inclusive를 두번째 요소에 넣어서 옵션 변경)
>   - tailSet(from) : 지정 값 이상인 값들 (inclusive를 두번째 요소에 넣어서 옵션 변경)
>   - pollFirst() : 가장 작은 값(첫 번째 요소)을 반환하고, 집합에서 제거 (집합이 비어 있으면 null 반환)
>   - pollLast() : 가장 큰 값(마지막 요소)을 반환하고, 집합에서 제거 (집합이 비어 있으면 null 반환)


### Map
<key, value> 쌍으로 이루어진 데이터 집합, 순서는 없고 키는 중복이 안되나 값은 중복이 가능
구현 클래스 : HashMap, HashTable, TreeMap

> HashMap
> - 한 개의 요소를 <key, value> 쌍으로 묶어서 관리하는 자료구조 형태
> - 키(key)는 중복될 수 없고 유일해야 하며, 값(Value)은 중복 가능
> - 내부적으로 배열 + 연결리스트(또는 트리) 구조를 사용
> - 객체 생성할 때 제네릭 타입을 지정하는 부분에서 key, value 쌍에 대한 타입을 지정
> - 내부 구조
>   - 배열 : 해시값을 기반으로 인덱스를 계산하여 저장
>   - 해시 함수 : key.hashCode()를 통해 인덱스 계산
>   - 충돌 처리 :
>       - Java 8 이전 : LinkedList로 연결
>       - Java 8 이후 : LinkedList - TreeNode (Red-Black Tree)로 전환(충돌이 많을 경우 성능 향상)
> 
> - 주요 메서드
>   - put(K key, V value) : 키-값 쌍 저장(이미 존재하면 덮어씀)
>   - get(Object key) : 키에 해당하는 값 반환(없으면 null)
>   - remove(Object key) : 키에 해당하는 항목 제거
>   - containsKey(Object key) : 해당 키가 존재하는지 확인
>   - containsValue(Object value) : 해당 값이 존재하는지 확인
>   - keySet() : 모든 키를 Set으로 반환
>   - values() : 모든 값을 Collection으로 반환
>   - entrySet() : 모든 키-값을 쌍 Set<Map.Entry<K,V>>로 반환

<hr/>

> TreeMap
> |특징|설명|
> |:---|:---|
> |정렬된 키 순서 유지|키는 항상 오름차순(또는 Comparator 기준)으로 정렬됨
> |중복 키 불가|Map이므로 키는 유일해야 함
> |null 키 허용 안 됨|TreeMap은 null 키를 허용하지 않음
> |범위 검색 가능|subMap(),headMap(),tailMap() 등 제공
> |최소/최대 키 접근 가능|firstKey(), lastKey() 메서드 제공
> |
> - TreeMap<K, V>는 Map 인터페이스를 구현한 클래스 중 하나로, **Key**를 기준으로 **자동 정렬**되는 Map이다.
> - 내부적으로 Red-Black Tree를 사용하여 탐색, 삽입, 삭제가 O(log n)시간에 수행된다.
> 
> - 주요 메서드
>   - put(K, V) : 키-값 쌍 추가
>   - get(K) : 키에 해당하는 값 반환
>   - remove(K) : 키-값 쌍 제거
>   - firstKey() / lastKey() : 가장 작은/큰 키 반환
>   - higherKey(K) / lowerKey(K) : 특정 키보다 큰/작은 키 반환
>   - ceilingKey(K) / floorKey(K) : 이상/이하인 가장 가까운 키
>   - subMap(fromKey, toKey) : 범위 내 키-값 쌍 반환
>   - pollFirstEntry() / pollLastEntry() : 가장 작은/큰 항목 반환 후 제거