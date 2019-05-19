package com.stackroute.pe3;

import java.util.Scanner;

public class CheckPrimeEvenReverse {

    /*Traverse the array check for Even and Odd nyumbers*/
    public static String[] IsEvenOdd(int[] input) {

        int size=input[0];
        String[] output=new String[size];
        int i=0,j=0;
        for ( i = 1; i <=size; i++)
        {
            if (input[i] % 2 == 0)
            {

                output[j] = "Even";
                j++;

            }
            else {

               output[j] = "Odd";
               j++;

            }

        }

        return output;
        }

    /*Traverse the array Remove all prime number*/
    public static int[] RemovePrime(int[] input) {
        int size=input[0];
        int[] output=new int[size];
        int i=0,j=0,k=0,m=0;
        boolean flag = false;
        for ( i = 1; i<=size; i++)
        {
            m = input[i];
            for ( j = 2; j < m / 2; j++)
            {
                flag=false;
                if (m % j == 0)
                {
                    flag = true;
                    break;

                }
            }
            if (flag)
            {
                output[k] = m;
                k++;
            }

        }
        int[] output1=new int[k];
        for(i=0;i<k;i++)
        {
            output1[i]=output[i];
        }
        return output1;
    }

    /*Traverse the array and Reverse the given array*/
    public static int[] ReverseArr(int[] input) {

        int size=input[0];
        int[] output=new int[size];
        int i,j=0,k=0;
        for(i=size;i>=1;i--)
        {
            output[j]=input[i];
            j++;
        }
        return output;
    }

}







