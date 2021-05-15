package Recursion;

public class PossibleSubStringWithVowel {

    public static void main(String[] args) {

        String str = "ABECDF";
        int count = 0;

       for(int i = 0;i< str.length();i++)
       {

           if(str.charAt(i)=='A' || str.charAt(i)=='E' ||str.charAt(i)=='I'|| str.charAt(i)=='O' ||str.charAt(i)=='U') {
               for (int j = i + 1; j <=str.length(); j++) {
                   System.out.println(str.substring(i, j));
                   count++;
               }
           }
       }
        System.out.println(count);

    }



}
