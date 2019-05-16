package com.stackroute.pe3;
import java.util.*;

public class Consecutive {


    public static void main(String args[])
    {

        Scanner scan=new Scanner(System.in);
        String string=scan.next();




         String  result= Checkcons(string);
         System.out.println(result);


    }

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
