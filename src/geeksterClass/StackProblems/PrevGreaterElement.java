package geeksterClass.StackProblems;

import java.util.Arrays;
import java.util.Stack;

public class PrevGreaterElement {

    private static int[] PGE(int[] arr,int n) {

        Stack<Integer> stk = new Stack<>();
        int ans[]=new int[n];
        for (int i = 0; i <n;i++) {

            int element = arr[i];

            while (!stk.isEmpty() && stk.peek()<element)
            {    stk.pop();}

            if (stk.isEmpty()) {
                    ans[i] = -1;
                } else {
                    ans[i] = stk.peek();
                }


          stk.push(element);
        }

       return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1,3,3,2,0,4};
        int n = arr.length;

       int []result = PGE(arr,n);

       for(int i : result)
           System.out.print(i+" ");

    }


}
