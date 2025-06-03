package algorithm.bruteforce;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * 파일명: VisitAllRooms.java
 *
 * @설명: 여기에 파일 설명을 작성하세요.
 * @작성자: Kim Yongjin
 * @생성일: 2025.06.03
 * @최종수정일: 2025.06.03
 * @버전: 1.0.0
 *
 *      수정 이력:
 *      날짜 작성자 내용
 *      -------------------------------------------------------------------------------
 *      2025.06.03 Kim Yongjin 초기 버전 작성
 *      -------------------------------------------------------------------------------
 */
public class VisitAllRooms {

    public boolean canVisitAllRooms(int[][] rooms) {
        // 방이 없거나 null인 경우, 모든 방을 방문한 것으로 간주 (0개 방 방문)
        if (rooms == null || rooms.length == 0) {
            return true;
        }
        Set<Integer> visited = new HashSet<>();
        dfs(0, rooms, visited); // 0번 방부터 DFS 탐색 시작
        return visited.size() == rooms.length;
    }

    /**
     * 깊이 우선 탐색(DFS)을 사용하여 연결된 모든 방을 방문합니다.
     *
     * @param currentRoom 현재 방문 중인 방의 번호
     * @param rooms       모든 방과 각 방에 있는 열쇠(다음 방 번호) 목록
     * @param visited     방문한 방들을 기록하는 Set
     */
    private void dfs(int currentRoom, int[][] rooms, Set<Integer> visited) {
        // 이미 방문한 방이면 더 이상 탐색하지 않음
        if (visited.contains(currentRoom)) {
            return;
        }
        // 현재 방을 방문 처리
        visited.add(currentRoom);

        // 현재 방에서 얻은 열쇠(다음 방 번호)들을 순회
        for (int nextRoom : rooms[currentRoom]) {
            // 다음 방을 재귀적으로 방문
            dfs(nextRoom, rooms, visited);
        }
    }

    /**
     * 
     */
    private void bfs(int currentRoom, int[][] rooms, Set<Integer> visited) {
        Queue<Integer> queue = new LinkedList<>();

    }

}
