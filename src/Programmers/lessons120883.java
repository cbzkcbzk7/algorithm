package Programmers;

import java.util.HashMap;
import java.util.Map;

/**
 * packageName    : PACKAGE_NAME
 * fileName       : Programmers.lessons120883
 * author         : Sora
 * date           : 2024-05-22
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-05-22        Sora       최초 생성
 */
public class lessons120883 {
    public static void main(String[] args) {
        String[] id_pw = {"meosseugi", "1234"};
        String[][] db = {
                {"rardss", "123"},
                {"yyoom", "1234"},
                {"meosseugi", "1234"}
        };

        String result = solution(id_pw, db);
        System.out.println("result = " + result);

        lessons120883 lessons120883 = new lessons120883();
        String result2 = lessons120883.solution2(id_pw, db);
        System.out.println("result2 = " + result2);
    }
    public String solution2(String[] idPw, String[][] db) {

        return getDb(db).get(idPw[0]) != null ? getDb(db).get(idPw[0]).equals(idPw[1]) ? "login" : "wrong pw" : "fail";
    }

    private Map<String, String> getDb(String[][] db) {
        Map<String, String> map = new HashMap<>();

        for (String[] array : db) {
            map.put(array[0], array[1]);
        }
        return map;
    }

    static String solution(String[] id_pw, String[][] db) {
        // db에 id_pw와 일치하는 값이 있으면 "login" 패스워드 다르면 "wrong pw" 없으면 "fail"
        String answer = "";
        // 1. id_pw의 id값과 db의 id값을 일치를 찾는다.
        for(int i=0; i < db.length; i++){
            // 1. id_pw의 id값과 db의 id값을 일치를 찾는다.
            if(id_pw[0].equals(db[i][0])) {
                // 2. 있으면 pw값을 비교한다.
                answer = id_pw[1].equals(db[i][1]) ? "login" : "wrong pw";
                break;

            }else{
                // 2. 없으면 fail
                answer = "fail";
            }
        }
        return answer;
    }
}
