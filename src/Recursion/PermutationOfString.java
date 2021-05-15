package Recursion;

public class PermutationOfString {

    public static void FindingFactorial(String s)

    {
       int n = s.length();
       int FacRes =  Factorial(n);

        for(int i = 0;i<FacRes;i++)
        {
            int temp = i;
            StringBuilder s1 = new StringBuilder(s);
            for( int div = s.length();div>=1;div--)
            {

                int remainder = temp % div;
                int quotient = temp / div;

                System.out.print(s1.charAt(remainder));
                s1.deleteCharAt(remainder);
                temp =quotient;

            }
            System.out.println();
        }

    }





    public static int Factorial(int n)
    {
        if(n==1)
            return n;
        return n*Factorial(n-1);

    }


    public static void main(String[] args) {
        String s = "abc";

        FindingFactorial(s);



    }
}
