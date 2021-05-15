package Recursion;
//Fibonacci Number with recursion
public class FibonacciNumber {


    private static long FibCalculte(int n) {

        if(n<=1)
            return n;
        if(n==0 || n==1)
            return 1;


        long fib1 = FibCalculte(n-1);
        long fib2 = FibCalculte(n-2);
        long result = fib1+fib2;
        return result;
    }






/*
  static long N1=1;
   static long N2 =0;
    static long N3=1;
    public static void FibRec(int count)
    {
       if(count <0)
       {
           return;
       }
       else {

           N3 = N1 + N2;
           System.out.print(" "+N3);

           N2 = N1;
           N1 = N3;

           FibRec( count-1);
       }
*/




    public static void main(String[] args) {


        int n = 8;
        System.out.println(FibCalculte(n));




     //   int count = 30;
  //      System.out.print("0"+" "+"1"+"");
  //      FibRec(count);

        //without Recursion
   /*     System.out.print("0"+" "+"1");

        int N1=1;
        int N2 =0;
        int N3=1;
        for(int i=2;i<n;i++)
        {
            N3 =N1+N2;
            System.out.print(" "+N3);

            N2 =N1;
            N1=N3;
        }
*/

    }


}
