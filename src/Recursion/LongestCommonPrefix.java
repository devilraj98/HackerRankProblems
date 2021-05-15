package Recursion;

import java.util.Arrays;

public class LongestCommonPrefix {

    public static String FindingSS(String []str)
    {

        Arrays.sort(str);

        String First = str[0];

        for (int i = 1;i< str.length;i++)
        {

            String currentWord = str[i];
            int j = 0;
            while (j<First.length() && First.charAt(j) == currentWord.charAt(j))
            {
                j++;
            }
            if (j == 0)
                return "";

            First = currentWord.substring(0,j);

        }

        return First;
    }



    public static void main(String[] args) {
        String str[] = {"abcddefgh","abcdd","abcd"};

        System.out.println(FindingSS(str));


    }



}
