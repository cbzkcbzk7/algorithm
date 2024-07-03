package Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * packageName    : Programmers
 * fileName       : lessons43164
 * author         : Sora
 * date           : 2024-07-03
 * description    : 여행경로 - DFS
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-07-03        Sora       최초 생성
 */
public class lessons43164 {

    static boolean[] visited;
    static ArrayList<String> allRoute;
    public static void main(String[] args) {
        String[] result = solution(new String[][]{ {"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL","SFO"} });
       // System.out.println(Arrays.toString(result));
    }

    static String[] solution(String[][] tickets){
        String[] answer = {};
        int cnt = 0;
        visited = new boolean[tickets.length];
        allRoute = new ArrayList<>();

        dfs("ICN","ICN",tickets, cnt);

        Collections.sort(allRoute);
        answer = allRoute.get(0).split(" ");

        return answer;
    }

    static void dfs(String start, String route, String[][] tickets, int cnt){
        if(cnt == tickets.length){
            allRoute.add(route);
            return;
        }

        // {"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL","SFO"}
        for(int i = 0; i < tickets.length; i++){
            if(start.equals(tickets[i][0]) && !visited[i]){ // 찾는 node를 tickets에서 찾았고, && 아직 방문하지 않았으면..
                visited[i] = true;
                dfs(tickets[i][1], route+" "+tickets[i][1], tickets, ++cnt);
                visited[i] = false;
            }
        }
    }
}
