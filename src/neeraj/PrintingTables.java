package neeraj;

import java.util.Scanner;

public class PrintingTables {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("please enter the no for which table will be created");
        int n = scn.nextInt();
        for(int i = 1;i<=10;i++){
            int result = n*i;
            System.out.println(n+" x "+i+" = "+result);
        }
    }
}
