package geeksterClass;

public class MergeSort {

    //merging function
    void merge (int A[],int mid, int low, int high) {
        int i = low;
        int j = mid + 1;
        int k = low;
        int B[] = new int[A.length];
        while (i < mid && j < high) {
            if (A[i] <= A[j]) {
                B[k] = A[i];
                i++;
                k++;
            } else {
                B[k] = A[j];
                j++;
                k++;
            }

            while (i <= mid) {
                B[k] = A[i];
                i++;
                k++;
            }

            while (j <= high) {
                B[k] = A[i];
                j++;
                k++;
            }
        }
        for (i = low; i < high; i++) {
            A[i] = B[i];
        }
    }
        //sorting of array
        void merge_sort( int A[], int low, int high)
            {

                if (low < high) {
                    int mid = (low + high) / 2;

                    merge_sort(A, low, mid);
                    merge_sort(A, mid + 1, high);
                    merge(A, low, mid, high);
                }
            }




    public static void main(String[] args) {
        int A[] = {10, 9, 7, 101, 23, 44, 12, 78, 34, 23};

          MergeSort mb = new MergeSort();
                  mb.merge_sort(A,0,A.length-1);

           System.out.println("\nSorted array");
           for(int i =0; i<A.length;i++)
          {
            System.out.println(A[i]+"");
          }
    }
}

        /*
        void merge(A[],B[],c[],m,n)
        {
            int i,j,k;
            i=j=k=0;
            while(i<m && j<n) {
                if (A[i] <= B[j]) {
                    C[k] = A[i];
                    i++;
                    k++;
                }
                else {
                    C[k] = B[j];
                    j++;
                    k++;
                }
                    while(i<m) {
                        C[k] = A[i];
                        i++;
                        k++;
                    }
                    while (j<n) {
                        C[k] = B[j];
                        j++;
                        k++;
                    }
            }

            }*/

//A[]={7,9,18,19,22};
//B[]={1,6,9,11};
//C[] = new arr[A.length+B.length];