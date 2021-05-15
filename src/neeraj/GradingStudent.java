package neeraj;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GradingStudent {
    public static List<Integer> ans = new ArrayList<Integer>();

    private static List<Integer> GradingSystem(int[] arr) {

    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]<38 || arr[i]%5 <=2)
        {
           ans.add(arr[i]);
        }
      else
        {
            int rem =arr[i] % 5;
            int NoToAdd = 5-rem;
            int result = arr[i]+NoToAdd;
            ans.add(result);
        }

    }
    return ans;

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i= 0;i<arr.length;i++)
            arr[i] = scn.nextInt();


       System.out.println(GradingSystem(arr));

        ans.forEach(System.out::println);
        for (Integer lst: ans) {
            System.out.println(lst);
        }


    }


}
