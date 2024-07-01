package Programmers;

import java.util.HashMap;
import java.util.Map;

/**
 * packageName    : Programmers
 * fileName       : lessons42576
 * author         : Sora
 * date           : 2024-07-01
 * description    : 완주하지 못한 선수
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-07-01        Sora       최초 생성
 */
public class lessons42576 {
    public static void main(String[] args) {
       String reuslt =  solution(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"});
        System.out.println("reuslt = " + reuslt);
    }
    static String solution(String[] participant, String[] completion) {
        // 1. 완주자 명단을 map의 키로 넣는다. value +1
        // 2. 참가자 명단를 완주자 명단 map 키 기준 value -1 한다.
        // 3. 최종 value가 0이 아닌 선수 명단(key) return
        String answer = "";

        Map<String,Integer> completionMap = new HashMap<>();
        for(String compPlayer : completion){
            completionMap.put(compPlayer,
                    completionMap.getOrDefault(compPlayer,0)+1 );
        }

        for(String partPlayer : participant){
            completionMap.put(partPlayer,
                    completionMap.getOrDefault(partPlayer,0)-1);
        }

        for(String key : completionMap.keySet()){
            if(completionMap.get(key) != 0){
                answer = key;
                break;
            }
        }

        return answer;
    }
}
