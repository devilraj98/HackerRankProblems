package geeksterClass;

import java.io.*;
import java.util.*;

//second Approach

public class MaxSubArrProd {

    public int MaxProd(int arr[])
    {
        int max_prod = arr[0];
        int min_prod = arr[0];
        int Max_Overall = arr[0];
        int choice1 ,choice2;
        for(int i = 1;i<arr.length;i++)
        {
            choice1 = arr[i]*max_prod;
            choice2 = arr[i]*min_prod;

            max_prod = Math.max(arr[i],Math.max(choice1,choice2));
            min_prod = Math.min(arr[i],Math.min(choice1,choice1));
            Max_Overall = Math.max(Max_Overall,max_prod);
        }
        return Max_Overall;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<arr.length;i++)
            arr[i] = scn.nextInt();

        MaxSubArrProd mp = new MaxSubArrProd();

        System.out.println( mp.MaxProd(arr));


    }
}