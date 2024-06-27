package Programmers;

import java.util.*;

/**
 * packageName    : PACKAGE_NAME
 * fileName       : Programmers.lessons120869
 * author         : Sora
 * date           : 2024-05-28
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-05-28        Sora       최초 생성
 */
public class lessons120869 {
    public static void main(String[] args) {
        int result = solution(new String[]{"z", "d", "x"}, new String[]{"def", "dww", "dzx", "loveaw"});


        int result2 = solution(new String[]{"s", "o", "m", "d"}, new String[]{"moos", "dzx", "smm", "sunmmo", "som"});
        System.out.println("result = " + result);
        System.out.println("result2 = " + result2);
    }

    public static int solution(String[] spell, String[] dic) {
        // 1. dic의 원소에서 spell의 원소를 조회한다.
        // 1-1. dic 원소 문자열을 나눈다
        int answer = 0;


        for(int i = 0; i < dic.length; i++){
            answer =  0;
            for(int j = 0; j < spell.length; j++){
                if( dic[i].contains(spell[j]) ) {
                    ++answer;
                }
            }
            if(answer == spell.length){
                answer = 1;
                break;
            }else{
                answer = 2;
            }

        }
            return answer;


        // 2. 성공 : 하지만 코드가 더러움
//        HashSet<Character> set = new HashSet<>();
////        List<String> list2 = null;
//
//        for(String dicEle : dic){
//            for(int i = 0; i < dicEle.length(); i++){
//                set.add(dicEle.charAt(i));
//            }
//            List<String> list2 = new ArrayList(set);
//
//            for(int k = 0; k < spell.length; k++){
//                char spellEle = spell[k].charAt(0);
//                System.out.print("list2="+list2+"\n");
//                System.out.println("spellEle="+spellEle);
//                if(list2.contains(spellEle)){
//                    ++count;
//
//                }
//            }
//            System.out.println("count="+count);
//            System.out.println("spell.length="+spell.length);
//            if(count == spell.length){
//                answer = 1;
//                break;
//            }else{
//                answer = 2;
//            }
//
//            count = 0;
//            set.clear();
//        }
// 1. 방법 : 실패
//        for(int i = 0; i < dic.length; i++){
//            String dic_elem = dic[i];
//            // 1-2. spell 원소를 돌려서 dic의 원소와 일치하는지 찾는다.
//            for(int k = 0; k < spell.length; k++){   // z
//                char spell_elem = spell[k].charAt(0);
//
//                for(int j = 0; j < dic_elem.length(); j++){ // d
//                    char chr = dic_elem.charAt(j);
//                    System.out.println("spell_elem="+spell_elem);
//                    System.out.print("chr="+chr);
//                    System.out.println();
//                    // 1-2. 일치하면 count return, 없으면 다음 원소와 비교한다.
//                    if(spell_elem == chr){
//                        ++count; // 카운트
//                    }
//                }
//            }
//            System.out.println("count="+count);
//            System.out.println("spell.length="+spell.length);
//            System.out.println();
//            if(count == spell.length){
//                answer = 1;
//                break;
//            }else{
//                answer = 2;
//            }
//            count = 0;
//        }

        // 2. dic의 원소는 문자열
        // 3. 해당원소를 모두 사용한 단어가 있으면 1, 없으면 2 return
        // 3-1. 1-2의 카운트가 spell의 길이와 일치하면 1, 일치하지 않으면 2



//        return answer;
    }
}
