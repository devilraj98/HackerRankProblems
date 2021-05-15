
package neeraj;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
    private int[] elements;
    public int maximumDifference;


    public Difference(int a[]){
        this.elements =a;
    }

    public void computeDifference() {

        for(int i = 0;i < elements.length;i++)
        {    int curr_dif = 0;
            for(int j=i+1;j< elements.length;j++ )
            {
                curr_dif = Math.abs(elements[i]-elements[j]);
                if (curr_dif>maximumDifference)
                    maximumDifference = curr_dif;
            }
        }

    }
} // End of Difference class

public class Scope{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}