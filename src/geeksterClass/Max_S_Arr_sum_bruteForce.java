package geeksterClass;

//This problem is for finding Max_subarray sum
//this is done by three methods
//third one is very imp that is Kadane_alg
public class Max_S_Arr_sum_bruteForce {

    /*   BRUTE FORCE ,Time Complexity = O(n^3)
private static void Max_SUBarr_sum_BruteForce(int[] arr)
    {
  int Max_sum = 0;

   for(int i=0;i<arr.length;i++)
   {
       for(int j = i;j< arr.length;j++)
       {
           int curr_sum =0;
           for(int k =i;k<=j;k++)
           {
               curr_sum=curr_sum+arr[k];


           }
           if(curr_sum>Max_sum)
           {
               Max_sum = curr_sum;
           }
       }
   }
   System.out.println(Max_sum);
   }
*/
    //time complexity = O(n^2)
    private static void Max_SUBarr_sum_BruteForce(int[] arr)
    {
 /*
        int Max_sum = 0;
        for (int i = 0; i < arr.length; i++)
        {
            int curr_sum = 0;
            for (int j = i; j < arr.length; j++)
            {
                curr_sum += arr[j];

                if (curr_sum > Max_sum)
                {
                    Max_sum = curr_sum;
                }
            }

         }
        System.out.println(Max_sum);
     */
        int sum = 0;
        int curr_sum =0;
        for(int i = 0;i<arr.length;i++)
        {
            curr_sum+=arr[i];

            if(curr_sum<0)
            {
                curr_sum= 0;
            }

            else
                if(curr_sum>sum)
            {
                sum = curr_sum;
            }


        }
        System.out.println(sum);

    }
    public static void main(String[] args)
    {
        int[] arr = {3, -2, 5, -1};
        Max_SUBarr_sum_BruteForce(arr);
    }

}



