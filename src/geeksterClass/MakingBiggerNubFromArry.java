package geeksterClass;

import java.util.Arrays;
import java.util.Comparator;

class CompareNumAsString implements Comparator<Integer>{
    public int compare(Integer a,Integer b)
    {
        String s1= a.toString();
        String s2 = a.toString();
        return (s2+s1).compareTo(s1+s2);
    }
}
public class MakingBiggerNubFromArry {

    public static void main(String[] args) {
        Integer arr[] = {555,5551};
        Arrays.sort(arr,new CompareNumAsString());
        for (int i =0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

}
