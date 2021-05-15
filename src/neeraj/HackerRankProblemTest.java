package neeraj;

import java.util.Scanner;

public class HackerRankProblemTest {
    public static void main(String[] args) {
        int step;
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        if(n%2==0)
        {
            step = n/2;
        }
        else
        {
            step = n-1;
        }
        System.out.println(step);
    }

}
