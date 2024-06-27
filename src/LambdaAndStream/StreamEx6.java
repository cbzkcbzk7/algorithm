package LambdaAndStream;

import java.util.*;

import static java.util.stream.Collectors.*;

import java.util.stream.*;
import java.util.stream.Stream;


/**
 * packageName    : LambdaAndStream
 * fileName       : StreamEx6
 * author         : Sora
 * date           : 2024-05-05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-05-05        Sora       최초 생성
 */
public class StreamEx6 {
    public static void main(String[] args) {
        Student[] stuArr = {
                new Student("이자바", 3, 300),
                new Student("김자바", 1, 200),
                new Student("안자바", 2, 100),
                new Student("박자바", 2, 150),
                new Student("소자바", 1, 200),
                new Student("나자바", 3, 290),
                new Student("감자바", 3, 180)
                };

        // 학생 이름만 뽑아서 List<String>에 저장
        List<String> names = Stream.of(stuArr).map(Student::getName)
                                    .collect(Collectors.toList());

        System.out.println("names = " + names);

        // 스트림을 배열로 반환
       Student[] stuArr2  = Stream.of(stuArr).toArray(Student[]::new);

       for(Student s : stuArr2)
           System.out.println(s);       // toString 오버라이딩 되어있기때문

        // 스트림을 Map<String, Student>로 변환. 학생 이름이 key
      Map<String,Student>  stuMap = Stream.of(stuArr).collect(Collectors.toMap(Student::getName, p->p));

      for(String name : stuMap.keySet())
          System.out.println(name + " = " + stuMap.get(name));  // 이름별 맞는 value 출력


        long count = Stream.of(stuArr).collect(counting());
        System.out.println("count = " + count);

        long totalScore = Stream.of(stuArr).collect(summingInt(Student::getTotalScore));
        System.out.println("totalScore = " + totalScore);

        totalScore = Stream.of(stuArr)
                .collect(reducing(0, Student::getTotalScore, Integer::sum));    // 초기값, 조건, 연산
        System.out.println("totalScore = " + totalScore);


        Optional<Student> topStudent =  Stream.of(stuArr)
                                        .collect(maxBy(Comparator.comparingLong(Student::getTotalScore)));
        System.out.println("topStudent = " + topStudent.get());

        IntSummaryStatistics stat = Stream.of(stuArr)
                                    .collect(summarizingInt(Student::getTotalScore));
        System.out.println("stat = " + stat);

        String stuNames = Stream.of(stuArr).map(Student::getName)
                        .collect(joining(",","{","}"));

        System.out.println(stuNames);
    }


}
