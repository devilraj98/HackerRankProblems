package neeraj;
import java.util.*;
public class MaxDiff {

        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t>0)
            {
                int n = sc.nextInt();
                int a[] = new int[n];
                for(int i=0; i<n; i++)
                    a[i] = sc.nextInt();
                Solution ob = new Solution();
                System.out.println(ob.findMaxDiff(a,n));
                t--;
            }
        }
    }// } Driver Code Ends



class Solution
{
    int findMaxDiff(int a[], int n)
    {
        int LS[] =new int[n];
        int RS[] = new int[n];
        LS[0] =0;
        RS[n-1] =0;
        for(int i = 1;i<n;i++)
        {
            for(int j=i-1;j>=0;j++)
            {
                if(a[j]<a[i])
                    LS[i] = a[j];

                else if(j<0)
                    LS[i] = 0;
            }

        }
        return LS[1];
    }
}
