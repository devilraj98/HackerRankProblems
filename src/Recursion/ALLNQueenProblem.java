package Recursion;

import java.util.Scanner;

public class ALLNQueenProblem {


    private static void PrintBoard(int[][] ChessBoard, int row,String qsf) {
        //Base case

        if(row == ChessBoard.length) {
            PrintAns(ChessBoard);
            System.out.println(qsf);
            System.out.println("------------------------------------");
            System.out.println("------------------------------------");
            return;
        }
        for(int col = 0; col < ChessBoard.length; col++)
        {

            if(IsItSafePositionForQueen(ChessBoard,row,col,qsf)) {
                ChessBoard[row][col] = 1;
                PrintBoard(ChessBoard, row + 1,qsf+row+"-"+row+",");
                ChessBoard[row][col] = 0;
            }

        }


    }

    public static Boolean IsItSafePositionForQueen(int [][]ChessBoard, int row, int col,String qsf) {

        for (int i = row-1,j=col; i>=0 ; i--) {
            if (ChessBoard[i][j]==1)
                return false;
        }
        for (int i = row-1,j=col-1; i >=0 && j>=0 ; i--,j--) {
            if (ChessBoard[i][j]==1)
                return false;
        }
        for (int i = row-1,j=col+1; i >=0 && j<ChessBoard.length; i--,j++) {
            if (ChessBoard[i][j]==1)
                return false;
        }
        return true;
    }

    public static void PrintAns(int [][]ChessBoard)
    {

        for (int i = 0; i <ChessBoard.length ; i++) {
            for (int j = 0; j < ChessBoard.length; j++) {
                System.out.print(ChessBoard[i][j]);

            }
            System.out.println();

        }


    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("plse enter N*N ChessBoard");
        int n = scn.nextInt();
        int [][]ChessBoard = new int[n][n];
        PrintBoard(ChessBoard,0,"");

    }


}