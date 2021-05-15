package neeraj;

import java.util.Arrays;
import java.util.Scanner;

public class finding_Sum_Array {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6};
        int sum = 10;
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==sum){
                    System.out.println();
                }

            }
        }
    }
}
