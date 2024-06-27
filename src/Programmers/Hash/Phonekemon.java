package Programmers.Hash;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * packageName    : Programmers.Hash
 * fileName       : Phonekemon
 * author         : Sora
 * date           : 2024-04-26
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-26        Sora       최초 생성
 */
public class Phonekemon {

    public static void main(String[] args){
        int phonekemon = findMaxPhonekemons(new int[]{3,1,2,3});
        int phonekemonHash = findMaxPhonekemonsHash(new int[]{3,1,2,3});
        System.out.println("phonekemonHash = " + phonekemonHash);
    }
    static int findMaxPhonekemons(int[] nums){
                // 1. nums = 포켓몬(짝수)
                // 2. N/2 선택한다
                int maxNum = nums.length/2;
                int result = 0;
                List list = new ArrayList();
                // 3. 포켓몬 종류의 중복을 확인한다
                for(int i = 0; i < nums.length; i++){

                    if(list.indexOf(nums[i]) == -1) list.add(nums[i]);

                }
                // 4. 2번의 최대값을 넘으면 최대값 반환 , 최대값을 넘지않으면 결과 반환
                result = list.size();
                return maxNum < result ? maxNum : result;
        }

        static int findMaxPhonekemonsHash(int[] nums){

            HashSet hashPokeball = new HashSet();

            for(int i = 0; i < nums.length; i++){
                hashPokeball.add(nums[i]);
            }

            return nums.length/2 < hashPokeball.size() ? hashPokeball.size() : nums.length/2;
        }
}
