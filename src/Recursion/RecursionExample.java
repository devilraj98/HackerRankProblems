package Recursion;

public class RecursionExample {

    /* //printing factorial of n number using recursion
    public static int Factorial(int n)
    {
        if(n==0 || n==1)
            return n;

        int result = n*Factorial(n-1);
        return result;


    }
*/

 /* printing Elements of an array
    public static void PrintingArray(int arr[],int index )
    {
        if(index>=arr.length)
            return ;

        System.out.print(arr[index]+" ");
        PrintingArray(arr,index+1);

    }
*/

    /*  Printing Reverse of an array Element
    private static void PrintReverseAraay(int[] arr, int index) {

         if(index<0)
             return;

        System.out.print(arr[index] + " ");
        PrintReverseAraay(arr,index-1);

    }

*/

  /* Finding the power of 2
   public static int PrintPowerOf_N(int n)
   {
       if(n==0)
           return 1;


       int result = PrintPowerOf_N(n-1);
       return 2*result;

   }

*/
  /*   Finding the Given Number
  private static Boolean SearchingNum(int[] arr, int n,int index) {


      while (index < arr.length) {
          if (index == n)
              return true;

          else
              SearchingNum(arr, n, index + 1);


      }
      return false;
  }
*/
    /*
  private static Boolean FindElement(int[] arr, int n,int index) {

      if(index<arr.length) {


          if (arr[index] == n)
              return true;

          else
              FindElement(arr, n, index + 1);


      }
      return true;
  }

*/


    public static void main(String[] args) {
   //     System.out.println( PrintingArray(6 ,0));

       int arr[] = {1,2,3,4,5,6};
       int n = 7;
     //   System.out.println(FindElement(arr,n,0));

//        PrintingArray(arr ,0);
//        PrintReverseAraay(arr,5);

//        System.out.print(PrintPowerOf_N(5));

  //       System.out.print(SearchingNum(arr,6,arr[0]));

    }



}
