package neeraj;

import java.util.Scanner;

public class camelCaseCount {

    private static final Scanner scn = new Scanner(System.in);

     public static int strCount(String str){
          int count = 1;
         for(int i =1;i<str.length()-1;i++){
             if(str.charAt(i)>=66 && str.charAt(i)<100)
                 count++;
         }
         return count;

     }


    public static void main(String[] args) {

        String str =scn.nextLine();
        System.out.println(strCount(str));




    }
}
