package Programmers;

import java.util.HashMap;
import java.util.Map;

/**
 * packageName    : Programmers
 * fileName       : lessons42578
 * author         : Sora
 * date           : 2024-07-02
 * description    : 코니의 의상
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-07-02        Sora       최초 생성
 */
public class lessons42578 {

    public static void main(String[] args) {
        int result = solution(new String[][]{ {"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"} });
        System.out.println("result = " + result);
    }
    static int solution(String[][] clothes) {
        // 1. 종류별로 map에 카운트 한다.
        // 2. 종류가 한 종류면 카운트 값만 return
        // 2. 한 종류 이상이면 카운트 값 + 키의 개수 return
        int answer = 1;
        Map<String,Integer> kindClothesMap = new HashMap<>();
        for(int i = 0; i < clothes.length; i++){
            kindClothesMap.put(clothes[i][1],
                    kindClothesMap.getOrDefault(clothes[i][1],0)+1);
        }

        // 동시에 일어나는 경우의 수 A*B
        // +1 : 해당 종류의 옷을 아예 안입는 경우 추가
        for (String key : kindClothesMap.keySet()) {
            answer *= kindClothesMap.get(key) + 1;
        }
        // -1 : 모든 종류의 옷을 아예 안입는 경우는 없으므로
        return  answer - 1;
    }
}
