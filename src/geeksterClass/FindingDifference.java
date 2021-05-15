package geeksterClass;

public class FindingDifference {
    public static void main(String[] args) {
        int[] arr = {10,15,22,25,30};
        int diff = 8;

        for(int i = 0;i<arr.length-1;i++){
            for(int j=1;j<arr.length-1;j++){
                int findDiff= arr[j]-arr[i];
                if(diff==findDiff){
                    System.out.println("yes we found the result");
                    break;
                }
                System.out.println("not found");
            }

        } System.out.println("not found");
    }
}
