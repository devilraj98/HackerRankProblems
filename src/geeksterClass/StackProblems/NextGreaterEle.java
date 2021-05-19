package geeksterClass.StackProblems;

import java.util.Stack;

public class NextGreaterEle {
    private static int[] NGE(int[] arr, int n) {

        Stack<Integer> stk = new Stack<>();
        int ans[] = new int[n];
        for (int i = n-1; i >=0 ; i--) {

            while (!stk.isEmpty() && stk.peek() < arr[i])
                stk.pop();

            if (stk.isEmpty())
                ans[i] =-1;

            else ans[i] =stk.peek();

            stk.push(arr[i]);
        }
        return ans;
    }


    public static void main(String[] args) {
        int arr[] = {1,3,3,2,0,4};
        int n = arr.length;

        int []result = NGE(arr,n);

        for(int i : result)
            System.out.print(i+" ");

    }


}
