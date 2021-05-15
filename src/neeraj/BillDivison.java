package neeraj;

import java.util.Arrays;
import java.util.Scanner;

public class BillDivison {

    static void bonAppetit(int[] bill, int k, int b) {

        int totalBill = 0;
        for(int i = 0;i<bill.length;i++){
            totalBill = totalBill+bill[i];
        }
        int BillActual = ((totalBill-bill[k])/2);

        if(b==BillActual){
            System.out.print("Bon Appetit");

        }else
        {
            System.out.print(b-BillActual);
        }


    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        int k = scn.nextInt();
        int[] bill = new int[n];

        for(int i = 0;i<bill.length;i++){
            bill[i] = scn.nextInt();
        }

        int b = scn.nextInt();

        bonAppetit(bill, k, b);




        }
}
