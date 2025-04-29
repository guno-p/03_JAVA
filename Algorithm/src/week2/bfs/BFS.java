package week2.bfs;

import java.util.*;

public class BFS {
    public void bfs(List<List<Integer>> graph, int startVertex) {
        // 1. 사용하는 자료구조 정의
        // Queue 랑 visited 저장

        
        // 2. 시작점 지정
        // 3. while 문 시작
        // 4. 방문
        // 5. 다음노드 예약

        Deque<Integer> queue = new ArrayDeque<>();
        List<Integer> visited = new ArrayList<>();

        queue.addLast(startVertex);
        visited.add(startVertex);

        System.out.println("방문 순서 : ");
        while (!queue.isEmpty()) {
            int currentVertex = queue.removeFirst();
            System.out.print(currentVertex + " ");

            for (int nextVertex : graph.get(currentVertex)) {
                if (!visited.contains(nextVertex)) {
                    queue.addLast(nextVertex);
                    visited.add(nextVertex);
                }
            }
        }
    }

    public void solve(List<List<Integer>> graph) {
        bfs(graph, 0);
    }

    // 실행용 메소드
    public static void main(String[] args) {
        (new BFS()).solve(makeGraph());
    }

    public static List<List<Integer>> makeGraph() {
        return new ArrayList<>() {{
            add(List.of(1, 3, 6));
            add(List.of(0, 3));
            add(List.of(3));
            add(List.of(0, 1, 2, 7));
            add(List.of(5));
            add(List.of(4, 6, 7));
            add(List.of(0, 5));
            add(List.of(3, 5));
        }};
    }

}