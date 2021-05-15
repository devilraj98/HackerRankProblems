package Recursion;

public class StockBuyAndSell {

    /*  Brute Force Approach  time complexity is n^2
    public static void StocKBuySellMethod(int []arr) {

        int OverAll_diff = 0;
        for (int i = 0; i < arr.length; i++) {
            int curr_diff = 0;
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] > arr[i]) {
                    curr_diff = arr[j] - arr[i];

                    if (curr_diff > OverAll_diff)
                        OverAll_diff = curr_diff;
                }

            }
        }

        System.out.println(OverAll_diff);
    }
    */

    //MInimal solution time complexity is 0(n)

    private static void StocKBuySellMethod(int[] arr) {

        int MaxOverAll= 0;
        int MinPrice = Integer.MAX_VALUE;
        for (int i = 0;i<arr.length;i++)
        {
            MinPrice = Math.min(arr[i],MinPrice);
            MaxOverAll = Math.max(MaxOverAll,arr[i]-MinPrice);
        }
        System.out.println(MaxOverAll);
    }

    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
      StocKBuySellMethod(arr);

    }

}
