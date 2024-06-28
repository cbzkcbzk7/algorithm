package ExhaustiveSearch;

/**
 * packageName    : ExhaustiveSearch
 * fileName       : SequentialSearch
 * author         : Sora
 * date           : 2024-04-07
 * description    : 순차 탐색(Sequential search) : 완전 탐색의 활용
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-07        Sora       최초 생성
 */
public class SequentialSearch {
    // 정렬되어 있는 경우는 굳이 순차 탐색을 할 필요는 없음
    // 이진탐색이 나음

    // 1. 순열(Permutation) : 선택 순서가 결과에 영향을 미치는 경우 선택
    // - 가장 큰 두자리 수 구하기
    static int N = 4;
    static int[] Nums = { 1, 2, 3, 4};

    static int solve(int cnt, int used, int val){
        if (cnt == 2) return val;  // base case : 선택된 수가 2개면 결과 반환

        int ret = 0;
        for(int i = 0; i < N; ++i){ // 모든 경우를 전부 시도
            if((used & 1 << i) != 0) continue;
            ret = Math.max(ret, solve(cnt + 1, used | 1 << i, val * 10 + Nums[i]));
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(solve(0,0,0));
    }
}
