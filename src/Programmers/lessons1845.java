package Programmers;

import java.util.HashSet;
import java.util.Set;

/**
 * packageName    : Programmers
 * fileName       : lessons1845
 * author         : Sora
 * date           : 2024-07-01
 * description    : 폰켓몬
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-07-01        Sora       최초 생성
 */

public class lessons1845 {
    public static void main(String[] args) {
        int result = solution(new int[]{3,1,2,3});
        System.out.println("result = " + result);
    }
    static int solution(int[] nums) {
        // 1. 가져갈 수 있는 폰멧몬 수를 구한다. nums/2
        // 2. 중복을 제거한다.
        // 3. return
        int getPhoneNum = nums.length/2;

        Set<Integer> totalPhoneSet = new HashSet<>();
        for(int phone : nums) {
            totalPhoneSet.add(phone);
        }

        //if(totalPhoneSet.size() < getPhoneNum) return totalPhoneSet.size();

        return Math.min(totalPhoneSet.size(), getPhoneNum);
    }
}
