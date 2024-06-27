package Recursion;

import java.util.Scanner;

/**
 * packageName    : Recursion
 * fileName       : RecursionFun
 * author         : Sora
 * date           : 2024-04-07
 * description    : Flood fill 알고리즘 : 재귀 함수의 활용
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-07        Sora       최초 생성
 */
public class RecursionFun {
    static int N;
    static int[][] Board = new int[100][100];

    // Flood fill 알고리즘 : 재귀 함수의 활용
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        for(int i = 0; i < N; ++i){
            for(int j = 0; j < N; ++j){
                Board[i][j] = sc.nextInt();
            }
        }

        int sRow, sCol; // 시작 위치
        sRow = sc.nextInt(); sCol = sc.nextInt();
        fill(sRow, sCol);

        for(int i = 0; i < N; ++i){
            for(int j = 0; j < N; ++j){
                System.out.print(Board[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void fill(int r, int c){
        // 사용할 수 있는 인덱스는 N-1까지 (ex : N이 5라면 인덱스 4까지 사용 가능)
        // 0보다 작거나 N-1보다 큰 경우는 경계면을 벗어났다는 뜻
        if( r < 0 || r > N-1 || c < 0 || c > N-1) return;    // Base case : 재귀 호출 종료하는 부분

        // 벽을 만났거나 이미 1마킹
        if(Board[r][c] != 0) return; // Base case

        Board[r][c] = 1;

        // Recursive case
        fill(r - 1, c); // 실행위치에서 위로 이동
        fill(r + 1, c); // 실행위치에서 아래쪽으로 이동
        fill(r, c - 1); // 실행위치에서 왼쪽으로 이동
        fill(r, c + 1); // 실행위치에서 오른쪽으로 이동

    }


}
