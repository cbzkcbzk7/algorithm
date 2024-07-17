package leetcode;

/**
 * packageName    : leetcode
 * fileName       : FindPivotIndex
 * author         : Sora
 * date           : 2024-07-17
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-07-17        Sora       최초 생성
 */
public class FindPivotIndex {
    public static void main(String[] args) {
       int result1 = pivotIndex(new int[]{1,7,3,6,5,6});
       int result2 = pivotIndex(new int[]{1,2,3});
       int result3 = pivotIndex(new int[]{2,1,-1});

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);
    }
    static int pivotIndex(int[] nums) {
        // 1. 가장 오른쪽 인덱스와 pivot index 가장오른쪽 인덱스-1로 초기화
        // 2. pivot index 전까지 left index를 전부 더한다.
        // 3. 1의 가장 오른쪽 인덱스와 값이 같은지 확인한다.
        //  3-1. 같으면 pivot index return
        //  3-2. 다르면 반복
        //  3-3. 없으면 -1
        final int LENGTH = nums.length;
        int pivotIndex = 0;

        while(pivotIndex != LENGTH){
            int sumRightIndex = 0, sumLeftIndex = 0;


            for(int i = 0; i < pivotIndex; i++){
                sumLeftIndex += nums[i];
            }

            for(int j = LENGTH-1; j > pivotIndex; j--){
                sumRightIndex += nums[j];
            }

            if(sumRightIndex == sumLeftIndex){
                break;
            }

            ++pivotIndex;

        }

        return pivotIndex == LENGTH ? -1 : pivotIndex;

    }
}
