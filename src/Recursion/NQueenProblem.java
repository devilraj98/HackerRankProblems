package Recursion;

import java.util.Scanner;

public class NQueenProblem {

    private static void NqueeenPrint(int[][] chessBoard, String qsf, int row) {
        if(row == chessBoard.length)
        {
            System.out.println(qsf);
            return;
        }

        for (int col = 0; col < chessBoard.length; col++) {
            if(isItSafePostionForQueen(chessBoard,qsf, row,col)){
                chessBoard[row][col] = 1;
                NqueeenPrint(chessBoard, qsf + row + "-" + col + ",", row + 1);
                chessBoard[row][col] = 0;
            }
            }


    }
  public static Boolean isItSafePostionForQueen(int [][]chessboard,String qsf,int row,int col)

  {
      for (int i = row-1,j =col; i >=0 ; i--) {
          if(chessboard[i][j] == 1)
              return false;
      }
      for (int i = row-1,j =col-1; i >=0 && j>=0 ; i--,j--) {
          if(chessboard[i][j] == 1)
              return false;
      }
      for (int i = row-1,j =col+1; i >=0 && j<chessboard.length ; i--,j++) {
          if(chessboard[i][j] == 1)
              return false;
      }

      return true;

  }




    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        int [][]chessBoard = new int [n][n];

        NqueeenPrint(chessBoard,"",0);
    }


}
