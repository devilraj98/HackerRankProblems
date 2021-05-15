package Recursion;

public class SqareRoot {
    public static int sqrt(int n ) {

        if (n == 0 || n == 1)
            return n;

        int start = 1;
        int end = n;
        int ans= -1;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (mid * mid == n)
                return mid;

            if (mid * mid < n) {
                start = mid + 1;
                ans = mid;
            }


            else {
                end = mid - 1;
            }
          }
           return ans;
        }
        public static void main (String[]args){
            int n = 2;
            System.out.print(sqrt(n));

        }
    }
