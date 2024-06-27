package Programmers;

import java.util.ArrayList;
import java.util.List;



/**
 * packageName    : PACKAGE_NAME
 * fileName       : Programmers.lessons_155652
 * author         : Sora
 * date           : 2024-05-01
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-05-01        Sora       최초 생성
 */
public class lessons_155652 {

    public static void main(String args[]){
        // result = happy;

        String result = ourPassword("aukks","wbqd",5);
        System.out.println("result = " + result);

//        String result2 = ourPwd("aukks","wbqd",5);
//        System.out.println("result2 = " + result2);
    }

    static String ourPwd(String s, String skip, int index){
//       1. 5 ≤ s의 길이 ≤ 50
//       2. 1 ≤ skip의 길이 ≤ 10
//       3. s와 skip은 알파벳 소문자로만 이루어져 있습니다.
//       4. skip에 포함되는 알파벳은 s에 포함되지 않습니다.
//       5. 1 ≤ index ≤ 20

        // *. s의 각 알파벳을 index만큼 뒤의 알파벳으로 변경
        // *. index만큼의 뒤의 알파벳이 z 넘어가면 다시 a
        // *. skip에 있는 알파벳은 제외
        // *. ASCII :  (소문자)97 ~ 122

        // *. s의 각 알파벳을 index만큼 뒤의 알파벳으로 변경
        // *. index만큼의 뒤의 알파벳이 z 넘어가면 다시 a
        // *. skip에 있는 알파벳은 제외
        // *. ASCII :  97 ~ 122


        String answer = "";
        // 1. 알파벳 넣기
        List<Character> temp_list = new ArrayList<>();
        for(int i = 97; i <= 122; i++){
            temp_list.add((char)i);
        }

        // 2. skip 문자열 알바펫에서 중복 제거
        for(int i=0; i < skip.length(); i++){
            // 2-1. skip문자열 각 구하기
            char skipChar = skip.charAt(i);

            temp_list.removeIf((x) -> x == skipChar );
        }


        // 4. 해당 알파벳의 index만큼 뒤의 알파벳으로 변경
        char resultChar=' ';
        // 3. s의 각 알파벳을 구한다
        for(int i=0; i < s.length(); i++){
            for(int j = 0; j < temp_list.size(); j++){
                if(temp_list.get(j) == s.charAt(i)) {
                    if ((j + index) <= temp_list.size() - 1) {
                        resultChar = temp_list.get(j + index);

                    } else {
                        // 넘어간 인덱스만큼 0부터 다시 시작
                        int startAlpa = temp_list.size()-(j + index);
                        resultChar = temp_list.get(startAlpa);
                    }
                    answer+=resultChar;
                }


            }
        }


        return answer;
    }


    // 런타임 에러
    static String ourPassword(String s, String skip, int index) {

        // *. s의 각 알파벳을 index만큼 뒤의 알파벳으로 변경
        // *. index만큼의 뒤의 알파벳이 z 넘어가면 다시 a
        // *. skip에 있는 알파벳은 제외
            // *. ASCII :  97 ~ 122


        String answer = "";
        // 1. 알파벳 넣기
        List<Character> temp_list = new ArrayList<>();
        for(int i = 97; i <= 122; i++){
            temp_list.add((char)i);
        }

        // 2. skip 문자열 알바펫에서 중복 제거
        for(int i=0; i < skip.length(); i++){
            // 2-1. skip문자열 각 구하기
            char skipChar = skip.charAt(i);
//            // 2-2. int로 변환
//            int skipInt = (int)skipChar;
            // 2-3. skip 문자열 중복 제거\
            temp_list.removeIf((x) -> x == skipChar );
        }



            // 4. 해당 알파벳의 index만큼 뒤의 알파벳으로 변경
            int resultInt;
            char resultChar=' ';
                // 3. s의 각 알파벳을 구한다
                for(int i=0; i < s.length(); i++){
//                    char sChar = s.charAt(i);
//                    int  sInt = (int)sChar;
//                    Integer sInteger = Integer.valueOf(sInt);

                    for(int j = 0; j < temp_list.size(); j++){
                          if(temp_list.get(j) == s.charAt(i)) {
                    if ((j + index) <= temp_list.size() - 1) {
//                        resultInt = temp_list.get(j + index);
                        resultChar = temp_list.get(j + index);


                    } else {
                        // 넘어간 인덱스만큼 0부터 다시 시작

                        int startAlpa = temp_list.size()-(j + index);
//                        resultInt = temp_list.get(startAlpa);
                        resultChar = temp_list.get(startAlpa);

                    }
                    answer+=resultChar;
                }


                }
            }


        return answer;
    }
}
