package Recursion;

public class searchingElementsUsingREcursion {
    private static boolean FindindingElements(int[] arr, int element,int i ) {

          if(i>arr.length-1)
              return false;

          int ele_at_pos = arr[i];
          if(ele_at_pos == element)
              return true;



         return FindindingElements(arr,element,i+1) ;

    }

    public static void main(String[] args) {

        int arr[] = {1,3,5,6,2,7};
        int element ;

      //  System.out.println(FindindingElements(arr,10,0));

        boolean bool = FindindingElements(arr, 11 ,0);
        if(bool){
            System.out.println("Element found");
        }else{
            System.out.println("Element not found");
        }



    }


}
