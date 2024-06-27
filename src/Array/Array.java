package Array;

import java.util.Scanner;

/**
 * packageName    : Array
 * fileName       : Array
 * author         : Sora
 * date           : 2024-04-07
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-07        Sora       최초 생성
 */
public class Array {
                    //  Start row, Start col
    static int Row, Col, Sr, Sc;
    static int[][] Board = new int[100][100];
    static void cross(){
        if(Board[Sr][Sc] != 0) return;

        Board[Sr][Sc] = 1; // 시작점 1 마킹
//        위로 올라가기
        for (int i = Sr - 1; i >= 0; --i){
            if(Board[i][Sc] != 0 ) break; // 0아니면 벽일테니 break
            Board[i][Sc] = 1;             // 0 이면 1 마킹
        }
//       아래로 내려가기
        for(int i = Sr + 1; i < Row; ++i){
            if(Board[i][Sc] != 0) break;
            Board[i][Sc] = 1;
        }

//        왼쪽으로 가기
        for(int j = Sc - 1; j >= 0 ; --j){
            if(Board[Sr][j] != 0) break;
            Board[Sr][j] = 1;
        }
 //     오른쪽으로 가기
        for(int j = Sc + 1; j < Col; ++j){
            if(Board[Sr][j] != 0) break;
            Board[Sr][j] = 1;
        }


    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Row = sc.nextInt();
        Col = sc.nextInt();
        for(int i = 0; i < Row; ++i){
            for(int j = 0; j < Col; ++j){
                Board[i][j] = sc.nextInt();
            }
        }
        Sr = sc.nextInt();
        Sc = sc.nextInt();

        cross();
        for(int i = 0; i < Row; ++i){
            for(int j = 0; j < Col; ++j){
                System.out.print(Board[i][j] + " ");
            }
            System.out.println();
        }


    }
}
