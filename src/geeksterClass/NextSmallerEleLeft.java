package geeksterClass;

import java.util.Stack;

class PrevGreaterEleLeft {

    public static long[] PGE(long[] arr, int n)
    {
        Stack<Long> stk = new Stack<>();
        long ans[] = new long[n];


        for(int i = n-1;i>0;i--)
        {

            long element = arr[i];
            while(!stk.isEmpty() && stk.peek()<element)
            {
                stk.pop();
            }
            if (stk.isEmpty())
                ans[i] = -1;
            else
                ans[i] =stk.peek();

            stk.push(element);
        }
        return ans;
    }




    public static void main(String[] args) {


    long ip[] = {5,0,2,1,3,4};
          //     -1,5,5,2,5,5  PGE
          //     -1,-1,0,0,1,3 PSE
          //
    int n = ip.length;

    long arr[] = PGE(ip, n);


        for (long l :arr)
            System.out.println(l);




}
}
