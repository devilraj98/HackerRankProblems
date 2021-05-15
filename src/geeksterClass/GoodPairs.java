package geeksterClass;
import java.io.*;
import java.util.*;
public class GoodPairs {


        public static void main(String[] args) {


            Scanner sc=new Scanner(System.in);
              int N = sc.nextInt();
            int nums[] = new int[N];
            int GoodPairs =0;

            for(int i = 0;i<nums.length;i++)
                nums[i] = sc.nextInt();

            for (int i = 0; i < nums.length; i++)
            {
                for (int j = i+1; j < nums.length; j++) {
                    if (nums[i] == nums[j])
                        GoodPairs++;
                }
             }
            System.out.println(GoodPairs);
    }
}
