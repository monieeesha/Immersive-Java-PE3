package com.stackroute.pe3;

import java.util.Scanner;

public class SecondProgram {
    public static  String[]  CompareArray(String s1[],String s2[]) {
         String output[]=new  String[s1.length];
                int j=0;
              for (int i = 0; i < s1.length; i++)
              {


                      if (s1[i].equals(s2[i]))
                      {

                           output[j] = "equal";
                           j++;
                      }
                      else
                          {

                          output[j] = "notequal";
                          j++;
                      }

              }


         return   output;
      }
    public static String[] AppendLast(String s1[], String s2[])
    {

        int x = s1.length;
        String[] output = new String[x];
        String word = s1[0];
        for (int i = 0; i < s2.length; i++)
        {

            output[i] = s2[i].concat(word);
        }
        return output;

    }

    public static String[] PrependFirst(String s1[], String s2[]) {

        int start = 0;
        int end = s2.length;
        String[] output = new String[end];
        int mid;
        if (end % 2 == 0)
        {
            mid = end / 2;
        }
        else
            {
                mid = start + (end - start) / 2;
            }

        for (int i = 0; i < s1.length; i++)
        {
            output[i] = s2[mid] + s1[i];

        }
        return output;

    }

    public static String[] RemoveDuplicate(String[] array1) {
        int i = 0, j = 0;
        String[] output = new String[array1.length];
        for (i = 0; i < array1.length - 1; i++) {
            for (j = i + 1; j < array1.length; j++) {
                if (array1[i] != null && array1[i].equals(array1[j])) {
                    array1[j] = null;
                }
            }
        }
        for (i = 0, j = 0; i < array1.length; i++) {
            if (array1[i] != null) {
                output[j] = array1[i];
                j++;
            }
        }
        String[] output1 = new String[j];
        for (i = 0; i < j; i++) {
            output1[i] = output[i];
        }
        return output1;
    }
}