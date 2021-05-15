package HaKerEearth_problem;
import java.util.*;
public class PrintFirstOcc {


        public static void main(String args[])

        {

            Scanner sc=new Scanner(System.in);

            int t = sc.nextInt();

            sc.nextLine();

            while(t-->0)

            {

                String s=sc.nextLine();

                System.out.print(s.charAt(0));

                for(int i=1;i<s.length();i++)

                {

                    if(s.substring(0,i).contains(""+s.charAt(i)))
                    {
                        //do nothing
                    }

                    else{

                        System.out.print(s.charAt(i));

                    }

                }

                System.out.println();

            }

        }

    }