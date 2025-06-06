## Dynamic Programming
문제에 대한 정답이 될 가능성이 있는 모든 해결책을 **체계적**이고 **효율적**으로 탐색하는 풀이법

![dp](/images/dp.png)

1. 크고 복잡한 문제를 작은 문제들로 나눈다. (subproblem - 하위문제)
2. 하위 문제의 답을 계산한다.
   - 중복 계산해야 하는 하위 문제가 있다. (overlapping subproblem - 중복 하위 문제)
   - 한 번 계산한 결과는 메모리에 저장하여 재계산 하지 않도록 한다. -> 속도 향상 (memoization, dp table)
3. 하위 문제에 대한 답을 통해 원래 문제에 대한 답을 계산한다. (optimal substructure - 최적 부분 구조)
   - 최적 부분 구조 : 하위 부분 문제에서 구한 최적의 답이 합쳐진 큰 문제의 최적의 답을 구할 수 있는 구조.

## Top-down vs Bottom-up
