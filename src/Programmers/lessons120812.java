package Programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

/**
 * packageName    : PACKAGE_NAME
 * fileName       : Programmers.lessons120812
 * author         : Sora
 * date           : 2024-05-27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-05-27        Sora       최초 생성
 */
public class lessons120812 {
    public static void main(String[] args) {
        int result = solution(new int[]{1, 2, 3, 3, 4});
        System.out.println("result = " + result);
        int result2 = solution(new int[]{1, 1, 2, 2});
        System.out.println("result2 = " + result2);
        int result3 = solution(new int[]{1});



        System.out.println("result3 = " + result3);
    }

    static public int solution(int[] array) {
        // 1. 배열의 요소를 찾는다
        // 2. 같은 요소일 때 +1
        // 3. 최빈값 return
        Map<Integer,Integer> map = new HashMap<>();
        int max = 0;
        int answer = 0;

        for(int i : array){     // 요소의 개수 카운트해서 map에 넣기
            if(map.containsKey(i)) map.replace(i, map.get(i)+1);
            else map.put(i,1);

            if(max < map.get(i)){
                max = map.get(i);
                answer = i;
            }
            }

//        for(int key : map.keySet()){ // value 최대값 구하기
//           if(max < map.get(key)){
//               max = map.get(key);
//               answer = key;
//           }
//        }
       map.remove(answer);  // 최빈값 중복을 확인을 위해 최대값으로 나온 요소 삭제

      return map.containsValue(max) ? -1 : answer;
    }
}
