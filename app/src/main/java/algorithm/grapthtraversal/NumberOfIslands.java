package algorithm.grapthtraversal;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * ------------------------------------------------------------
 *   파일명  : NumberOfIslands.java
 *   설명 : 1(육지)과 0(물)로 구성된 지도를 나타내는 m x n 크기의 이진 격자가 주어졌을 때 섬의 개수를 구하시오.
 * 섬은 물로 둘러싸여져 있으며, 인접한 육지를 수평 또는 수직으로 연결하여 형성됩니다. 격자의 네 모서리가 모두
 * 물로 둘러싸여 있다고 가정할 수 있습니다.
 *   작성자  : 김용진
 *   작성일  : 2025-06-06
 *   수정이력   :
 *    - 2025-06-06 김용진 최초 생성
 * ------------------------------------------------------------
 */
public class NumberOfIslands {

    private int numRows;
    private int numCols;
    private char[][] grid;
    private int[] dx = {-1, 1, 0, 0};
    private int[] dy = {0, 0, -1, 1};

    public int numIslands(char[][] grid) {
        int number_of_islands = 0;

        if (grid == null || grid.length == 0 || grid[0].length == 0)
            return 0;
        numRows = grid.length;
        numCols = grid[0].length;

        this.grid = grid;

        for (int r = 0; r < numRows; r++) {
            for (int c = 0; c < numCols; c++) {
                if (grid[r][c] == '1') {
                    number_of_islands++;
                    dfs(r, c);
                }
            }
        }

        return number_of_islands;
    }

    public void dfs(int r, int c) {
        if (r >= 0 && r < numRows && c >= 0 && c < numCols) {
            return;
        }
        grid[r][c] = 0;
        for(int i=0;i<4;i++){
            dfs(r+dx[i],c+dy[i]);
        }
    }

    public static int bfs(char[][] grid) {

        if (grid == null || grid.length == 0 || grid[0].length == 0)
            return 0;

        int m = grid.length;
        int n = grid[0].length;
        int number_of_islands = 0;

        // 4방향 (상,하,좌,우) 이동을 위한 배열
        int[] dx = { -1, 1, 0, 0 };
        int[] dy = { 0, 0, -1, 1 };

        boolean[][] visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            Arrays.fill(visited[i], false);
        }

        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                // 1 (땅) & not visited
                if (grid[r][c] == '1' && visited[r][c] == false) {
                    // 새로운 섬 발견하고 방문
                    visited[r][c] = true;
                    number_of_islands++;
                    Queue<int[]> queue = new LinkedList<>();
                    queue.offer(new int[] { r, c });
                    grid[r][c] = 0; // 재방문하지 않기 위해 0으로 변경
                    while (!queue.isEmpty()) {
                        int[] current = queue.poll();
                        int currentRow = current[0];
                        int currentCol = current[1];
                        for (int i = 0; i < 4; i++) {
                            int newRow = currentRow + dx[i];
                            int newCol = currentCol + dy[i];
                            // 이동할 곳이 grid 내에 있고 1(땅) 인 경우 queue에 추가
                            if (newRow >= 0 && newRow < m && newCol >= 0 && newCol < n && grid[newRow][newCol] == '1') {
                                queue.offer(new int[] { newRow, newCol }); // 큐에 추가
                                grid[newRow][newCol] = '0';
                            }

                        }
                    }
                }
            }
        }

        return number_of_islands;
    }
}
