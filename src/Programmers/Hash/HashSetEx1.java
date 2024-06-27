package Programmers.Hash;

import java.util.HashSet;
import java.util.Set;

/**
 * packageName    : Programmers.Hash
 * fileName       : HashSetEx1
 * author         : Sora
 * date           : 2024-04-26
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-26        Sora       최초 생성
 */
public class HashSetEx1 {
    public static void main(String[] args){
        Object[] objArr = {"1", new Integer(1), "2", "2","3","3","4","4","4"};
        Set set = new HashSet();

        for(int i = 0; i < objArr.length; i++){
            set.add(objArr[i]); // HashSet에 objArr의 요소들을 저장한다.
        }

        // 요소 출력
        System.out.println("set = " + set);
    }
}
