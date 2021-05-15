package geeksterClass.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrListCreation {

    public static void main(String[] args) {

//        ArrayList <Integer> fruits = new ArrayList<>();
//        fruits.add(10);
//        fruits.add(20);
//        fruits.add(30);
//        fruits.add(25);
//        System.out.println(fruits);
//        fruits.add(0,222);
//        System.out.println(fruits);
//        System.out.println( fruits.get(0));
//
//
//        System.out.println();
//        Collections.sort(fruits);
//        System.out.println(fruits);
//       //For Each loop
//        for (int item : fruits)
//        System.out.print(item+"   ");
//
//        System.out.println();
//        int arr[] = {5,10,23,44};
//        int i =0;
//        for(int itm : arr)
//            System.out.println(itm+" "+i++);
//         //   System.out.println();

        Scanner scn = new Scanner(System.in);

        ArrayList <Integer> arrlist = new ArrayList<>();
        System.out.println("Enter the elements");
        for (int i = 0;i<10; i++) {

            int temp = scn.nextInt();

            if (!arrlist.contains(temp))
                arrlist.add(temp);

        }
        System.out.print(arrlist);
        Collections.sort(arrlist);
        System.out.println(arrlist);





    }
}
