package com.stackroute.pe3;
import java.util.*;

public class StudentMarks {

    public static void main(String args[]) {
        int j=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number of students");
        int n= scan.nextInt();
        int grade[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("enter the grades");
            j = scan.nextInt();
            String x=CheckRange(j);
            System.out.println(x);
            if(x=="true")
            {
                grade[i]=j;
            }
        }

    }


    public static String CheckRange(int grade)
    {

        if( grade<0) {
              return "input should be greater than 0";
          }
         else if(grade>100) {
              return "input should be less than 100";
          }
         else  {
              return "true";
          }

    }


}