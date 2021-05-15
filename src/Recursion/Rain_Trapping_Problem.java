package Recursion;

public class Rain_Trapping_Problem {
    public static void main(String[] args) {

        int arr[] = {3,0,0,2,0,4};
        int left = 0;
        int right = 0;

          for(int i = 0;i<arr.length-1;i++)
          {
              if(arr[i]>left)
              {
                  left = arr[i];
              }
          }
          for(int i = arr.length-1;i>0;i--)
          {
              if(arr[i]>right)
              {
                  right = arr[i];
              }

          }
          int water = 0;
          for (int i = 0;i<arr.length-1;i++)
          {
              water = water+Math.min(left,right)-arr[i];
          }
        System.out.println(water);
    }
}


//3,0,0,2,0,4
//left=3,3,3,3,3,4
//right=4,4,4,4,4,4