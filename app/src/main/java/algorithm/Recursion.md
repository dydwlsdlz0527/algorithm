## 재귀 함수(Recursive function)
> 💡재귀함수(Recursive function)란 자신을 정의할 때 자기 자신을 재참조하는 함수를 뜻합니다.

```java
public int factorial(int n){
    if(n==1) return 1;
    return n * factorial(n-1);
}

public int fibo(int n){
    if(n==1 || n==2) return 1;
    return fibo(n-1) + fibo(n-2);
}
```

### 구성 요소 2가지

#### recurrence relation 점화식
f(n)을 f(n-1), f(n-2), ... f(2), f(1)의 관계식으로 표한하는 것을 recurrence relation
- problem와 subproblem(s)의 관계식을 말합니다.

예) Factorial, Fibonacci sequence, Pascal's Triangle

#### Base case
- 더 이상 재귀 호출을 하지 않아도 계산값을 반환할 수 있는 상황(조건)을 말합니다.
- 모든 입력이 최종적으로 base case을 이용해서 문제를 해결할 수 있어야 합니다.
- basecase가 무조건 있어야 재귀함수의 **무한루프를 방지**할 수 있습니다.

### 재귀 함수 시간복잡도
> 💡재귀함수 전체 시간복잡도 = 재귀 함수 호출 수 x (재귀 함수 하나당) 시간복잡도
Excution Tree(recursion tree) : 재귀 함수의 실행 흐름을 나타내는 데 사용되는 트리

- n에 비례한 호출 : f(n)=f(n-1)+1 의 시간복잡도 O(n)
- 2^N에 비례한 호출 : f(n)=f(n-1)+f(n-2) O(n^2) 의 시간복잡도 O(2^n)
- Binary Search O(log2 n)