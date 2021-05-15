package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintingSubstr {
/*
    static List<String> ans = new ArrayList<>();
    private static void FindSubStr(String Input, String Output) {

        if(Input.length() == 0) {
            ans.add(Output);
            return;
        }
          FindSubStr(Input.substring(1),Output);
          FindSubStr(Input.substring(1),Output+Input.charAt(0));


    }
*/

  //  static List <String> al = new ArrayList<>();
    public static void FindSubString(String Input,String Output)
    {
        if(Input.length()== 0) {
            System.out.print(Output+", ");
            return;
        }

        FindSubString(Input.substring(1),Output);
        FindSubString(Input.substring(1),Output+Input.charAt(0));




    }

    public static void main(String[] args) {

        /*
        String Input = "abcd";
        String temp="";
        for(int i = 0;i<Input.length();i++)
        {
        //    System.out.println(Input.charAt(i));
            for (int j = i+1;j<=Input.length();j++)                                //a
            {
                System.out.println(Input.substring(i,j));    //a,ab //

            }
        }
*/


        String Input = "abc";
        String Output = "";

        FindSubString(Input,Output);
      //  System.out.println(output);
   }


}
