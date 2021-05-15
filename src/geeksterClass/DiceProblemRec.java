package geeksterClass;

import java.util.ArrayList;

public class DiceProblemRec {

    private static ArrayList<String> GetBoardPass(int curr, int end ) {
        ArrayList<String> myREs = new ArrayList<String>();
      //Base Case
        if(curr==end)
        {
            ArrayList<String> br = new ArrayList<>();
            br.add("\n");
            return br;
        }

        if(curr>end)
        {
            ArrayList<String> br = new ArrayList<>();
            return br;
        }



        for (int dice = 1;dice<=6;dice++)
        {
            ArrayList<String> RecRes = GetBoardPass(curr+1,end);

            for (String s:RecRes)
                myREs.add(dice+s);



        }
        return myREs;


    }


    public static void main(String[] args) {

        System.out.println(GetBoardPass(0,10));

    }




}


