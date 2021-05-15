package neeraj;

public class MergeSortProblem {
   public static void merge(int[] arr1,int[] arr2,int[] arr3,int m,int n) {

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < m && j < n) {

            if (arr1[i] < arr2[j]) {
                arr3[k] = arr1[i];
                i++;
                k++;
            } else {
                arr3[k] = arr2[j];
                j++;
                k++;

            }
        }
        while (i < m) {
            arr3[k] = arr1[i];
            i++;
            k++;
        }
        while (j < n) {
            arr3[k] = arr1[j];
            j++;
            k++;
        }

    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int m = arr1.length;

        int[] arr2 = {2, 4, 6, 8};
        int n = arr2.length;

        int[] arr3 = new int[m + n];

     /*   public void mergeSort(arr1)
        {
            int low = arr1[0];
            int high = arr1[arr1.length-1];
            for(low<high){

                int mid = (low + high) / 2;
            }
            mergeSort(low, mid);
            mergeSort(mid + 1, high);
            merge(arr1, arr2, n1, n2, arr3);
        }

*/
        merge(arr1,arr2,arr3,m,n);



        System.out.println("Array after merging");
        for (int i = 0; i < (m + n); i++)
            System.out.print(arr3[i] + " ");

        }
    }









