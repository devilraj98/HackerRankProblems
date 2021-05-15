package Recursion;

import java.util.Scanner;

public class PallidromeFinding {

    /*
    //Brute force approach to find the the given string is Pallidrome or not
    private static Boolean isPallidrome(String str) {

        String str1="" ;
        for(int i = str.length()-1;i>=0;i--)
             str1 = str1 +str.charAt(i);

        if(str.equals(str1))
            return true;
        else
            return false;
    }
    */


    private static Boolean isPallidrome(String str) {

      //abcba
        int i = 0;
        int j = str.length()-1;
        while (i<j) {

            if (str.charAt(i) != str.charAt(j))
                return false;

            else {
                i++;
                j--;
            }
        }
          return true;

    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Please Enter the string ");
        String str = scn.next();

        System.out.println(isPallidrome(str));



    }


}
