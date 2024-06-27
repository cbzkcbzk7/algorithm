package SubSet;

/**
 * packageName    : SubSet
 * fileName       : SubSets
 * author         : Sora
 * date           : 2024-06-27
 * description    : 비트를 이용한 부분 집합
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-06-27        Sora       최초 생성
 */
public class SubSets {
    // ************ 비트 연산자 ***************************
    // & , x&y: 두 비트가 모두 1이면 1
    // | , x|y: 두 비트 중 하나라도 1이면 1
    // ^(XOR), x^y : 두 비트가 같으면 0, 다르면 1
    // ~(NOT) , ~x: 각 비트를 반전, 0이면 1, 1이면 0
    // << (Left Shift), x << 2  : 비트를 왼쪽으로 이동, 하나 이동할 때마다 곱하기2
    // >> (Right Shift), x >> 2 : 비트를 오른쪽으로 이동, 하나 이동할 때마다 나누기2
    // ***************************************************

    // 원소가 n개인 집합
    //  - 부분 집합의 총 개수 : 1 << n
    // 1. i번째에 원소가 있는지 확인
    //     - (비트로 표현된 집합) & (1<<i) 결과가 0이 아니면 존재
    // 2. i번째에 원소를 추가
    //     - (비트로 표현된 집합) | (1<<i)
    // 3. i번째 원소를 삭제
    //     - (비트로 표현된 집합) & ~(1<<i)
    static void printSubsets(char[g] arr, int n){
        for(int i = 0; i < (1 << n); ++i){
            System.out.print("{ ");
            for(int j = 0; j < n; ++j){
                if( (i & 1<<j) != 0)
                    System.out.print(arr[j] + ", ");
            }

            System.out.println("}");
        }
    }


    public static void main(String[] args) {
        char[] data = {'A','B','C','D'};
        printSubsets(data, 4);
    }
}
