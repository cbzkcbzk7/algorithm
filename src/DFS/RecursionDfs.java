package DFS;

/**
 * packageName    : DFS
 * fileName       : RecursionDfs
 * author         : Sora
 * date           : 2024-06-30
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-06-30        Sora       최초 생성
 */
public class RecursionDfs {
    public static void main(String[] args) {
        // 방문처리에 사용 할 배열 선언
        boolean[] visited = new boolean[9];

        // DFS 그래프의 연결상태를 2차원 배열로 표현
        // 인덱스가 각각의 노드번호가 될 수 있게 0번 인덱스는 아무것도 없는 상태라고 가정
        int[][] graph = { {}, {2,3,8}, {1,6,8}, {1,5}, {5,7}, {3,4,7}, {2}, {4,5}, {1,2} };

        depthFirstSearch(visited, graph, 1);
    }

    public static void depthFirstSearch(boolean[] visited, int[][] graph, int nodeIndex){

        // 방문 처리
        visited[nodeIndex] = true;

        // 방문 노드 출력
        System.out.println(nodeIndex + " -> ");

        // 방문한 노드에 인접한 노드 찾기
        for(int node : graph[nodeIndex]){
            // 인접한 노드가 방문한 적이 없다면 DFS 수행
            if(!visited[node]){
                depthFirstSearch(visited, graph, node);
            }
        }
    }

}
