package neeraj;

import java.util.Scanner;

public class CODE_30_Conditional {



    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("PLese enter no");
        int n = scn.nextInt();

        if (n % 2 != 0) {
            System.out.println("Weird");
        } else if (2 <= n && n <= 5) {
            System.out.println("Not Weird");
        }
        else if (6 <= n && n <= 20) {
            System.out.println(" Weird");
        }
        else if (n>20) {
            System.out.println("Not Weird");
        }
    }
}
