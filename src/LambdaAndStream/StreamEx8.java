package LambdaAndStream;

import javax.swing.text.DefaultStyledDocument;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;

/**
 * packageName    : LambdaAndStream
 * fileName       : StreamEx8
 * author         : Sora
 * date           : 2024-05-08
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-05-08        Sora       최초 생성
 */
public class StreamEx8 {
    public static void main(String[] args) {

        StudentEx7[] stuArr = {
                new StudentEx7("나자바", true, 1, 1, 300),
                new StudentEx7("김지미", false, 1, 1, 250),
                new StudentEx7("김자바", true, 1, 1, 200),
                new StudentEx7("이지미", false, 1, 2, 150),
                new StudentEx7("남자바", true, 1, 2, 100),
                new StudentEx7("안지미", false, 1, 2, 50),
                new StudentEx7("황지미", false, 1, 3, 100),
                new StudentEx7("강지미", false, 1, 3, 150),
                new StudentEx7("이자바", true, 1, 3, 200),

                new StudentEx7("나자바", true, 2, 1, 300),
                new StudentEx7("김지미", false, 2, 1, 250),
                new StudentEx7("김자바", true, 2, 1, 200),
                new StudentEx7("이지미", false, 2, 2, 150),
                new StudentEx7("남자바", true, 2, 2, 100),
                new StudentEx7("안지미", false, 2, 2, 50),
                new StudentEx7("황지미", false, 2, 3, 100),
                new StudentEx7("강지미", false, 2, 3, 150),
                new StudentEx7("이자바", true, 2, 3, 200)
        };

        System.out.printf("1. 단순그룹화(반별로 그룹화)%n");
        Map<Integer, List<StudentEx7>> stuByBan = Stream.of(stuArr)
                .collect(groupingBy(StudentEx7::getBan));

        for(List<StudentEx7> ban : stuByBan.values()){
            for(StudentEx7 s : ban){
                System.out.println(s);
            }
        }

        System.out.printf("%n2. 단순그룹화(성적별로 그룹화)%n");
        Map<StudentEx7.Level, List<StudentEx7>> stuByLevel = Stream.of(stuArr)
                .collect(groupingBy(s -> {
                    if(s.getScore() >= 200) return StudentEx7.Level.HIGH;
                    else if(s.getScore() >= 100) return StudentEx7.Level.MID;
                    else                         return StudentEx7.Level.LOW;
                }));


        TreeSet<StudentEx7.Level> keySet = new TreeSet<>(stuByLevel.keySet());

        for(StudentEx7.Level key : keySet){
            System.out.println("["+key+"]");

            for(StudentEx7 s : stuByLevel.get(key))
                System.out.println(s);
            System.out.println();
        }

    }

}
