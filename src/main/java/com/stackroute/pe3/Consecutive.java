package com.stackroute.pe3;
import java.util.*;

public class Consecutive {
    /*check wheather the given array contains consecutive numbers*/
    public  static String Checkcons(String string)
    {

        String  word[] = string.split(",");
        int k=0;
        boolean result=true;
        int a[]=new int[word.length];
        for(String str:word) {

            a[k] = Integer.parseInt(str);
            k++;
        }

        for(int i=0;i<k-1;i++)
        {

            if(a[i+1]-a[i]==1||a[i+1]-a[i]==-1)
            {
                continue;
            }

             else
             {

             result=false;

            }
        }

        if(result)
            return "consecutive";
        else
            return "nonconsecutive";

    }
}
