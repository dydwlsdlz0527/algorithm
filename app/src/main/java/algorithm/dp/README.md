## Dynamic Programming
문제에 대한 정답이 될 가능성이 있는 모든 해결책을 **체계적**이고 **효율적**으로 탐색하는 풀이법

![subproblem](/images/subproblem.png)

1. 크고 복잡한 문제를 작은 문제들로 나눈다. (subproblem - 하위문제)
2. 하위 문제의 답을 계산한다.
   - 중복 계산해야 하는 하위 문제가 있다. (overlapping subproblem - 중복 하위 문제)
   - 한 번 계산한 결과는 메모리에 저장하여 재계산 하지 않도록 한다. -> 속도 향상 (memoization, dp table)
3. 하위 문제에 대한 답을 통해 원래 문제에 대한 답을 계산한다. (optimal substructure - 최적 부분 구조)
   - 최적 부분 구조 : 하위 부분 문제에서 구한 최적의 답이 합쳐진 큰 문제의 최적의 답을 구할 수 있는 구조.

## 접근 방법
![dp-problem](/images/dp-problem.png)
- 완전 탐색(재귀)
  - 시간복잡도: O(n^2)
  - 크고 복잡한 문제를 하위 문제로 나눈다.
  - 하위 문제에 대한 답을 계산한다.
    - overlapping subproblem : 중복 하위 문제
    - memoization : 계산 결과를 저장하여 중복된 문제에 사용
  - 하위 문제에 대한 답으로 원래 문제에 대한 답을 계산한다.
  - base case : 즉시 답을 낼 수 있는 단계 (무한루프에 빠지지 않기 위해서 반드시 필요하다.)
- 반복문

## Top-down vs Bottom-up
![dp](/images/dp.png)
### Top-down
- 재귀를 활용해서 풀이한다. => 구현 시간이 빠르다.
- top-down 이라고 하지만, 계산은 가장 하위부터 시작해서 채워나간다.
- 재귀풀이에 중복되는 계산값을 저장하여(memoize) 동일한 함수 호출 시에 재활용 한다.

### Bottom-up
- 반복문을 활용해서 풀이한다. => 실행 시간이 빠르다.
- 밑에서부터 채워나가며 더 작은 subproblem에 대한 계산 결과를 DP table에 저장하여 더 큰 문제의 계산에 활용한다.
- tabulation이라고도 하며, hashtable 또는 list에 계산 결과를 저장한다.

