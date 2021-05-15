package neeraj;

import java.io.IOException;
import java.util.Scanner;

public class TimeConversion   {

    static String TimeConversion(String s)
    {
        if(s.substring(8,10).equals("PM")){
            if(!s.substring(0, 2).equals("12")){
                s = (Integer.parseInt(s.substring(0,2))+12) + s.substring(2,8);
            }else{
                s = s.substring(0, 8);
            }
        }else if(s.substring(0,2).equals("12") && s.substring(8,10).equals("AM")){
            s = "00" + s.substring(2, 8);

        }else{
            s = s.substring(0, 8);
        }

        return s;
    }

        public static void main(String[] args) throws IOException {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the time in format");
        String s = scn.nextLine();
            System.out.println(TimeConversion(s));

    }
}
