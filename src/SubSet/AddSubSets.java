package SubSet;

import java.util.Scanner;

/**
 * packageName    : SubSet
 * fileName       : AddSubSets
 * author         : Sora
 * date           : 2024-06-28
 * description    : 부분 집합 연습 - 두 수의 합이 7인 경우의 수
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-06-28        Sora       최초 생성
 */
public class AddSubSets {
    static int N;
    static int[] Arr = new int[10];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        for(int i  = 0; i < N; i++){
            Arr[i] = sc.nextInt();
        }
        System.out.println(getSolve());

    }

    static int getSolve() {
        int ret = 0;
        for(int i=0; i < (1 << N); ++i){
            if(Integer.bitCount(i) != 2) // Integer.bitCount(i) : i의 원소의 개수
                continue;                   // 두 수의 합만 필요하기때문에 2가 아닌 경우 체크

            int sum = 0;
            for(int j = 0; j < N; ++j){
                if((i&1<<j) != 0){
                    sum += Arr[j];
                }
            }
            if(sum == 7) ++ret;
        }
        return ret;
    }
}
