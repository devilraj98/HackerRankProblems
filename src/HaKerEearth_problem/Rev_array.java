package HaKerEearth_problem;

import java.util.Arrays;
import java.util.Scanner;

public class Rev_array {




    public static void main(String args[] ) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for(int i = 0;i<arr.length;i++){
            arr[i] = scn.nextInt();

        }
       // System.out.println(Arrays.toString(arr));
       for(int j = arr.length-1;j>=0;j--){
            System.out.println(arr[j]);
        }



    }
}
