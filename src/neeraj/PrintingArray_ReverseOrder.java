package neeraj;

import java.util.Scanner;

public class PrintingArray_ReverseOrder {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter no of Array");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array ");

        for (int i = 0; i < n; i++)
        {
            System.out.print(arr[i]= scn.nextInt());
        }
        System.out.println();

        for(int j = n;j<=arr.length;j--)
        {
            System.out.print(arr[j]);
        }



    }
}
