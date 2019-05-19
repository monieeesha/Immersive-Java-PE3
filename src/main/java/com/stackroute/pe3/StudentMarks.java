package com.stackroute.pe3;
import java.util.*;

public class StudentMarks {

   /*check that the given grade of student should not exceed between 1 and 100*/
    public  String[] CheckRange(int[] grade) {
        int k=0;
        String[] str=new String[grade.length];
        for (int i = 0; i < grade.length; i++) {
             if (grade[i] < 0)
             {
                 str[k]= "input should be greater than 0";
                 k++;
             }
             else if (grade[i] > 100)
             {
                str[k]="input should be less than 100";
                k++;
             }
             else
                 {
                 str[k]="true";
                 k++;
                 }

              }

        return str;
      }

}