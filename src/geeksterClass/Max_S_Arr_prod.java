package geeksterClass;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.max;


public class Max_S_Arr_prod {

    // Brute Force Approach which is not valid for large input
    /*
    static int maxProduct(int[] arr) {
        int max_prod =arr[0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int curr_prod = 1;
                for (int k = i; k <= j; k++) {
                    curr_prod = curr_prod * arr[k];


                }
                if (curr_prod > max_prod) {
                    max_prod = curr_prod;
                }
            }
        }
        return max_prod;

*/

    static int maxProduct(int[] arr) {
         int max_overall =arr[0];
         int max_ending_here = arr[0];
         int min_ending_here = arr[0];
         for(int i = 1;i<arr.length;i++)
          {      int temp = max_ending_here;
                  max_ending_here = Math.max(arr[i], Math.max(arr[i]*max_ending_here,arr[i]*min_ending_here));
                  min_ending_here = Math.min(arr[i], Math.min(arr[i]*temp,arr[i]*min_ending_here));
                  max_overall = Math.max(max_overall,max_ending_here);
              }

        return max_overall;
    }

       static  Scanner scn = new Scanner(System.in);
        public static void main(String[] args)
        {

            int n = scn.nextInt();
            int arr[] = new int[n];
            for(int i = 0;i<arr.length;i++)
            {
                arr[i] = scn.nextInt();
            }
            System.out.println(Arrays.toString(arr));

            System.out.println(maxProduct(arr));

    }

}