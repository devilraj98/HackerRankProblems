package Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class FindingSum_fromArrY {
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
         int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<arr.length-1;i++){
            arr[i]=scn.nextInt();

        }
        System.out.println(Arrays.toString(arr));
        int sum = scn.nextInt();
        int start = 0;
        int end = arr.length-1;

        if(end<start){
            if(sum<arr[start]+arr[end]){
                end--;
            }
            else if(sum>arr[start]+arr[end]){
                start++;
            }
            else
            {
                 System.out.println(sum);
            }


        }

    }
}
