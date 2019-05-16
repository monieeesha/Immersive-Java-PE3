package com.stackroute.pe3;
import java.util.*;

public class RemoveVowels {

        public static String[] ReadString(String[] input) {
            int size = Integer.parseInt(input[0]);
            String[] output=new String[size];
            int i=0,j=0;
            for (i = 1; i <=size; i++) {
                if(input[i].isEmpty())
                {
                    output[j]="Strings cannot be null";
                    j++;
                }
                else if (true) {
                    String check1 = input[i];
                    boolean flag=true;
                    int c;
                    char[] chars = check1.toCharArray();
                    for (c = 0; c < chars.length; c++) {
                        if (!Character.isLetter(chars[c])) {
                            flag=false;
                            output[j] = "String should contain only letter";
                            j++;
                            break;
                        }
                    }
                    if(flag) {
                        output[j] = input[i].replaceAll("[AaEeIiOoUu]", "");
                        j++;
                    }
                }
            }

            return output;
        }

    }


