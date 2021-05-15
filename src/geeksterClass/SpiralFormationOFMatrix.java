package geeksterClass;

import java.util.Scanner;

public class SpiralFormationOFMatrix {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int m =scn.nextInt();
        int n= scn.nextInt();

        int [][]arr= new int[m][n];
        for(int i = 0;i < arr.length;i++)
        {
            for(int j = 0;j< arr[0].length;j++)
            {
                arr[i][j] =scn.nextInt();
            }
        }


        int top = 0;
        int bottom = arr.length-1;
        int left = 0;
        int right =arr[0].length-1;
        int TotNoEle=m*n;
        int count  =0;
        //top

        while(count<TotNoEle) {


            for (int i = left; i <= right && count < TotNoEle; i++) {
                System.out.println(arr[top][i]);
                count++;
            }
            top++;

            //right
            for (int i = top; i <= bottom && count < TotNoEle; i++) {
                System.out.println(arr[i][right]);
                count++;
            }
            right++;
            //bottom
            for (int i = left; i >= right && count < TotNoEle; i--) {
                System.out.println(arr[bottom][i]);
                count++;
            }
            bottom++;
            //left

            for (int i = bottom; i >= top && count < TotNoEle; i--) {
                System.out.println(arr[i][left]);
                count++;
            }
            left++;

        }



    }
}
