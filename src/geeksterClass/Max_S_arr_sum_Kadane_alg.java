package geeksterClass;

import static java.lang.Math.max;

public class Max_S_arr_sum_Kadane_alg {
    public static void main(String[] args) {
        int[] arr = {3,-2,5,-1};
        int sum = arr[0];
        int max_sum= arr[0];
        for(int i = 1;i < arr.length;i++)
        {
            if(sum<0)
            {
                sum = arr[i];
            }
            else
            {
                sum = sum+arr[i];
            }
            max_sum = max(sum,max_sum);
        }
        System.out.println(max_sum);
    }
}
