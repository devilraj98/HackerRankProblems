package neeraj;


import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BirtdayCandlesCount {

    public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
         int n = scn.nextInt();
         int[] arr = new int[n];
         int max = arr[0];
         int count = 0;

         for(int i = 0;i<n;i++)
         {
             arr[i] = scn.nextInt();

         } System.out.print(Arrays.toString(arr));


         for(int i = 0;i<arr.length;i++)
         {
             if(arr[i]>max)
             {
                 max= arr[i];
             }
         }

        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i]==max)
            {
                count++;
            }
        }
        System.out.println(count);
    }

}
